package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Usuario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuarioRepository {

    @Inject
    DataSource dataSource;

    public List<Usuario> listar() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id_usuario, nm_usuario, nm_email, tp_papel, dt_criacao FROM ES_usuario";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario u = new Usuario(
                        rs.getLong("id_usuario"),
                        rs.getString("nm_usuario"),
                        rs.getString("nm_email"),
                        rs.getString("tp_papel"),
                        rs.getTimestamp("dt_criacao").toLocalDateTime()
                );
                usuarios.add(u);
            }
        }
        return usuarios;
    }

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES (?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPapel());
            stmt.setTimestamp(4, Timestamp.valueOf(usuario.getDataCriacao()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_usuario WHERE id_usuario = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}