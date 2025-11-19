package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Habilidade;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class HabilidadeRepository {

    @Inject
    DataSource dataSource;

    public List<Habilidade> listar() throws SQLException {
        List<Habilidade> habilidades = new ArrayList<>();
        String sql = "SELECT id_habilidade, nm_habilidade, tp_categoria, ds_habilidade FROM ES_habilidade";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Habilidade h = new Habilidade(
                        rs.getLong("id_habilidade"),
                        rs.getString("nm_habilidade"),
                        rs.getString("tp_categoria"),
                        rs.getString("ds_habilidade")
                );
                habilidades.add(h);
            }
        }
        return habilidades;
    }

    public void inserir(Habilidade habilidade) throws SQLException {
        String sql = "INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES (?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, habilidade.getNome());
            stmt.setString(2, habilidade.getCategoria());
            stmt.setString(3, habilidade.getDescricao());
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_habilidade WHERE id_habilidade = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}