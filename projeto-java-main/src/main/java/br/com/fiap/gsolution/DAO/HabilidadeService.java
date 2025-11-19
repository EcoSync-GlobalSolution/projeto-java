package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Habilidade;
import br.com.fiap.gsolution.Repository.HabilidadeRepository;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class HabilidadeService {

    @Inject
    HabilidadeRepository repository;

    public List<Habilidade> listarHabilidades() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarHabilidade(Habilidade habilidade) throws SQLException {
        if (habilidade.getNome() == null || habilidade.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome da habilidade é obrigatório");
        }
        if (habilidade.getCategoria() == null || habilidade.getCategoria().isEmpty()) {
            throw new IllegalArgumentException("Categoria da habilidade é obrigatória");
        }

        repository.inserir(habilidade);
    }

    @Transactional
    public void removerHabilidade(Long id) throws SQLException {
        repository.deletar(id);
    }
}