package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Evidencia;
import br.com.fiap.gsolution.Repository.EvidenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class EvidenciaService {

    @Inject
    EvidenciaRepository repository;

    public List<Evidencia> listarEvidencias() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarEvidencia(Evidencia evidencia) throws SQLException {
        if (evidencia.getTipo() == null || evidencia.getTipo().isEmpty()) {
            throw new IllegalArgumentException("Tipo da evidência é obrigatório");
        }
        if (evidencia.getCaminhoArquivo() == null || evidencia.getCaminhoArquivo().isEmpty()) {
            throw new IllegalArgumentException("Caminho do arquivo é obrigatório");
        }
        if (evidencia.getValorIndicador() == null) {
            throw new IllegalArgumentException("Valor do indicador é obrigatório");
        }
        if (evidencia.getProjetoId() == null) {
            throw new IllegalArgumentException("Projeto vinculado à evidência é obrigatório");
        }
        if (evidencia.getAutorId() == null) {
            throw new IllegalArgumentException("Autor da evidência é obrigatório");
        }

        if (evidencia.getDataEnvio() == null) {
            evidencia.setDataEnvio(LocalDateTime.now());
        }

        repository.inserir(evidencia);
    }

    @Transactional
    public void removerEvidencia(Long id) throws SQLException {
        repository.deletar(id);
    }
}