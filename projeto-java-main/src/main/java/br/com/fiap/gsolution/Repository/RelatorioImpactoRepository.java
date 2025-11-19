package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.RelatorioImpacto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class RelatorioImpactoRepository {

    @Inject
    DataSource dataSource;

    public List<RelatorioImpacto> listar() throws SQLException {
        List<RelatorioImpacto> relatorios = new ArrayList<>();
        String sql = "SELECT id_relatorio, id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio FROM ES_relatorio_impacto";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                RelatorioImpacto r = new RelatorioImpacto(
                        rs.getLong("id_relatorio"),
                        rs.getLong("id_projeto"),
                        rs.getString("cd_ods_meta"),
                        rs.getString("nm_indicador"),
                        rs.getBigDecimal("vl_indicador"),
                        rs.getDate("dt_relatorio").toLocalDate()
                );
                relatorios.add(r);
            }
        }
        return relatorios;
    }

    public void inserir(RelatorioImpacto relatorio) throws SQLException {
        String sql = "INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, relatorio.getProjetoId());
            stmt.setString(2, relatorio.getOdsMeta());
            stmt.setString(3, relatorio.getIndicador());
            stmt.setBigDecimal(4, relatorio.getValor());
            stmt.setDate(5, Date.valueOf(relatorio.getDataRelatorio()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_relatorio_impacto WHERE id_relatorio = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}