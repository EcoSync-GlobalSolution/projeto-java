package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Organizacao;
import br.com.fiap.gsolution.Repository.OrganizacaoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class OrganizacaoService {

    @Inject
    OrganizacaoRepository repository;

    public List<Organizacao> listarOrganizacoes() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarOrganizacao(Organizacao organizacao) throws SQLException {
        if (organizacao.getTipo() == null || organizacao.getTipo().isEmpty()) {
            throw new IllegalArgumentException("Tipo da organização é obrigatório");
        }
        repository.inserir(organizacao);
    }

    @Transactional
    public void removerOrganizacao(Long id) throws SQLException {
        repository.deletar(id);
    }
}

