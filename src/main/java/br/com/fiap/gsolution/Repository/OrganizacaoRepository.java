package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Organizacao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class OrganizacaoRepository {

    @Inject
    DataSource dataSource;

    public List<Organizacao> listar() throws SQLException {
        List<Organizacao> organizacoes = new ArrayList<>();
        String sql = "SELECT id_organizacao, nm_organizacao, tp_organizacao, nm_email_contato, st_verificada FROM ES_organizacao";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Organizacao o = new Organizacao(
                        rs.getLong("id_organizacao"),
                        rs.getString("nm_organizacao"),
                        rs.getString("tp_organizacao"),
                        rs.getString("nm_email_contato"),
                        rs.getString("st_verificada")
                );
                organizacoes.add(o);
            }
        }
        return organizacoes;
    }

    public void inserir(Organizacao organizacao) throws SQLException {
        String sql = "INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES (?, ?, ?, ?, CURRENT_TIMESTAMP)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, organizacao.getNome());
            stmt.setString(2, organizacao.getTipo());
            stmt.setString(3, organizacao.getEmailContato());
            stmt.setString(4, organizacao.getVerificada());
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

