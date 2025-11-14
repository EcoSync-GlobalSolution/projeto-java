package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Usuario;
import br.com.fiap.gsolution.Repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.util.List;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository repository;

    public List<Usuario> listarUsuarios() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarUsuario(Usuario usuario) throws SQLException {
        // Exemplo de regra de negócio: validar papel
        if (usuario.getPapel() == null || usuario.getPapel().isEmpty()) {
            throw new IllegalArgumentException("Papel do usuário é obrigatório");
        }
        repository.inserir(usuario);
    }

    @Transactional
    public void removerUsuario(Long id) throws SQLException {
        repository.deletar(id);
    }
}
