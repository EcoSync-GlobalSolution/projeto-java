package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.UsuarioHabilidade;
import br.com.fiap.gsolution.Repository.UsuarioHabilidadeRepository;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class UsuarioHabilidadeService {

    @Inject
    UsuarioHabilidadeRepository repository;

    public List<UsuarioHabilidade> listarPorUsuario(Long usuarioId) throws SQLException {
        return repository.listarPorUsuario(usuarioId);
    }

    @Transactional
    public void adicionarHabilidade(UsuarioHabilidade usuarioHabilidade) throws SQLException {
        // Validar campos obrigatórios
        if (usuarioHabilidade.getUsuarioId() == null) {
            throw new IllegalArgumentException("Usuário é obrigatório");
        }
        if (usuarioHabilidade.getHabilidadeId() == null) {
            throw new IllegalArgumentException("Habilidade é obrigatória");
        }
        if (usuarioHabilidade.getNivel() == null || usuarioHabilidade.getNivel().isEmpty()) {
            throw new IllegalArgumentException("Nível da habilidade é obrigatório");
        }
        if (usuarioHabilidade.getAnosExperiencia() == null || usuarioHabilidade.getAnosExperiencia() < 0) {
            throw new IllegalArgumentException("Anos de experiência devem ser informados e não podem ser negativos");
        }

        repository.inserir(usuarioHabilidade);
    }

    @Transactional
    public void removerHabilidade(Long id) throws SQLException {
        repository.deletar(id);
    }
}