package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Candidatura;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CandidaturaRepository {

    @Inject
    DataSource dataSource;

    public List<Candidatura> listar() throws SQLException {
        List<Candidatura> candidaturas = new ArrayList<>();
        String sql = "SELECT id_candidatura, id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura FROM ES_candidatura";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Candidatura c = new Candidatura(
                        rs.getLong("id_candidatura"),
                        rs.getLong("id_usuario"),
                        rs.getLong("id_projeto"),
                        rs.getString("st_candidatura"),
                        rs.getDouble("vl_horas_previstas"),
                        rs.getDouble("vl_horas_entregues"),
                        rs.getTimestamp("dt_candidatura").toLocalDateTime()
                );
                candidaturas.add(c);
            }
        }
        return candidaturas;
    }

    public void inserir(Candidatura candidatura) throws SQLException {
        String sql = "INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, candidatura.getUsuarioId());
            stmt.setLong(2, candidatura.getProjetoId());
            stmt.setString(3, candidatura.getStatus());
            stmt.setDouble(4, candidatura.getHorasPrevistas());
            stmt.setDouble(5, candidatura.getHorasEntregues());
            stmt.setTimestamp(6, Timestamp.valueOf(candidatura.getDataCandidatura()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_candidatura WHERE id_candidatura = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}