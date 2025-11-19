package br.com.fiap.gsolution.Repository;

import br.com.fiap.gsolution.Model.Projeto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProjetoRepository {

    @Inject
    DataSource dataSource;

    public List<Projeto> listar() throws SQLException {
        List<Projeto> projetos = new ArrayList<>();
        String sql = "SELECT id_projeto, id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao FROM ES_projeto";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Projeto p = new Projeto(
                        rs.getLong("id_projeto"),
                        rs.getString("nm_titulo"),
                        rs.getString("ds_projeto"),
                        rs.getString("st_projeto"),
                        rs.getLong("id_organizacao"),
                        rs.getLong("id_responsavel"),
                        rs.getTimestamp("dt_criacao").toLocalDateTime()
                );
                projetos.add(p);
            }
        }
        return projetos;
    }

    public void inserir(Projeto projeto) throws SQLException {
        String sql = "INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, projeto.getOrganizacaoId());
            stmt.setLong(2, projeto.getResponsavelId());
            stmt.setString(3, projeto.getTitulo());
            stmt.setString(4, projeto.getDescricao());
            stmt.setString(5, projeto.getStatus());
            stmt.setTimestamp(6, Timestamp.valueOf(projeto.getDataCriacao()));
            stmt.executeUpdate();
        }
    }

    public void deletar(Long id) throws SQLException {
        String sql = "DELETE FROM ES_projeto WHERE id_projeto = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}