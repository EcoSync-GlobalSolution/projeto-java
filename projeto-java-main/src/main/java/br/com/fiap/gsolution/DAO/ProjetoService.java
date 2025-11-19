package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Projeto;
import br.com.fiap.gsolution.Repository.ProjetoRepository;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class ProjetoService {

    @Inject
    ProjetoRepository repository;

    public List<Projeto> listarProjetos() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarProjeto(Projeto projeto) throws SQLException {
        if (projeto.getStatus() == null || projeto.getStatus().isEmpty()) {
            projeto.setStatus("ATIVO");
        }

        if (projeto.getDataCriacao() == null) {
            projeto.setDataCriacao(LocalDateTime.now());
        }

        if (projeto.getOrganizacaoId() == null) {
            throw new IllegalArgumentException("Organização vinculada ao projeto é obrigatória");
        }
        if (projeto.getResponsavelId() == null) {
            throw new IllegalArgumentException("Responsável pelo projeto é obrigatório");
        }

        repository.inserir(projeto);
    }

    @Transactional
    public void removerProjeto(Long id) throws SQLException {
        repository.deletar(id);
    }
}