package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Evidencia;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EvidenciaRepository {

    @Inject
    DataSource dataSource;

    public List<Evidencia> listar() throws SQLException {
        List<Evidencia> evidencias = new ArrayList<>();
        String sql = "SELECT id_evidencia, id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio FROM ES_evidencia";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Evidencia e = new Evidencia(
                        rs.getLong("id_evidencia"),
                        rs.getLong("id_projeto"),
                        rs.getLong("id_autor"),
                        rs.getString("tp_evidencia"),
                        rs.getString("nm_caminho_arquivo"),
                        rs.getString("nm_indicador_impacto"),
                        rs.getBigDecimal("vl_indicador"),
                        rs.getTimestamp("dt_envio").toLocalDateTime()
                );
                evidencias.add(e);
            }
        }
        return evidencias;
    }

    public void inserir(Evidencia evidencia) throws SQLException {
        String sql = "INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, evidencia.getProjetoId());
            stmt.setLong(2, evidencia.getAutorId());
            stmt.setString(3, evidencia.getTipo());
            stmt.setString(4, evidencia.getCaminhoArquivo());
            stmt.setString(5, evidencia.getIndicadorImpacto());
            stmt.setBigDecimal(6, evidencia.getValorIndicador());
            stmt.setTimestamp(7, Timestamp.valueOf(evidencia.getDataEnvio()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_evidencia WHERE id_evidencia = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}