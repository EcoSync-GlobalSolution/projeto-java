package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.UsuarioHabilidade;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsuarioHabilidadeRepository {

    @Inject
    DataSource dataSource;

    public List<UsuarioHabilidade> listar() throws SQLException {
        List<UsuarioHabilidade> usuarioHabilidades = new ArrayList<>();
        String sql = "SELECT id_usuario_habilidade, id_usuario, id_habilidade, st_nivel, vl_anos_experiencia FROM ES_usuario_habilidade";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                UsuarioHabilidade uh = new UsuarioHabilidade(
                        rs.getLong("id_usuario_habilidade"),
                        rs.getLong("id_usuario"),
                        rs.getLong("id_habilidade"),
                        rs.getString("st_nivel"),
                        rs.getDouble("vl_anos_experiencia")
                );
                usuarioHabilidades.add(uh);
            }
        }
        return usuarioHabilidades;
    }

    public List<UsuarioHabilidade> listarPorUsuario(Long usuarioId) throws SQLException {
        List<UsuarioHabilidade> usuarioHabilidades = new ArrayList<>();
        String sql = "SELECT id_usuario_habilidade, id_usuario, id_habilidade, st_nivel, vl_anos_experiencia " +
                "FROM ES_usuario_habilidade WHERE id_usuario = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, usuarioId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    UsuarioHabilidade uh = new UsuarioHabilidade(
                            rs.getLong("id_usuario_habilidade"),
                            rs.getLong("id_usuario"),
                            rs.getLong("id_habilidade"),
                            rs.getString("st_nivel"),
                            rs.getDouble("vl_anos_experiencia")
                    );
                    usuarioHabilidades.add(uh);
                }
            }
        }
        return usuarioHabilidades;
    }

    public void inserir(UsuarioHabilidade usuarioHabilidade) throws SQLException {
        String sql = "INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES (?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, usuarioHabilidade.getUsuarioId());
            stmt.setLong(2, usuarioHabilidade.getHabilidadeId());
            stmt.setString(3, usuarioHabilidade.getNivel());
            stmt.setDouble(4, usuarioHabilidade.getAnosExperiencia());
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_usuario_habilidade WHERE id_usuario_habilidade = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}