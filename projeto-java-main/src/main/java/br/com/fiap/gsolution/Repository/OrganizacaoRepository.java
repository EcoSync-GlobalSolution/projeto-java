package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Organizacao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class OrganizacaoRepository {

    @Inject
    DataSource dataSource;

    public List<Organizacao> listar() throws SQLException {
        List<Organizacao> organizacoes = new ArrayList<>();
        String sql = "SELECT id_organizacao, nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao FROM ES_organizacao";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Organizacao o = new Organizacao(
                        rs.getLong("id_organizacao"),
                        rs.getString("nm_organizacao"),
                        rs.getString("tp_organizacao"),
                        rs.getString("nm_email_contato"),
                        rs.getString("st_verificada").equals("S"),
                        rs.getTimestamp("dt_criacao").toLocalDateTime()
                );
                organizacoes.add(o);
            }
        }
        return organizacoes;
    }

    public void inserir(Organizacao organizacao) throws SQLException {
        String sql = "INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, organizacao.getNome());
            stmt.setString(2, organizacao.getTipo());
            stmt.setString(3, organizacao.getEmailContato());
            stmt.setString(4, organizacao.isVerificada() ? "S" : "N");
            stmt.setTimestamp(5, Timestamp.valueOf(organizacao.getDataCriacao()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_organizacao WHERE id_organizacao = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}