package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.Candidatura;
import br.com.fiap.gsolution.Repository.CandidaturaRepository;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class CandidaturaService {

    @Inject
    CandidaturaRepository repository;

    public List<Candidatura> listarCandidaturas() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarCandidatura(Candidatura candidatura) throws SQLException {
        if (candidatura.getStatus() == null || candidatura.getStatus().isEmpty()) {
            candidatura.setStatus("PENDENTE");
        }

        if (candidatura.getDataCandidatura() == null) {
            candidatura.setDataCandidatura(LocalDateTime.now());
        }

        if (candidatura.getHorasPrevistas() == null || candidatura.getHorasPrevistas() <= 0) {
            throw new IllegalArgumentException("Horas previstas são obrigatórias e devem ser maiores que zero");
        }

        if (candidatura.getHorasEntregues() == null) {
            candidatura.setHorasEntregues(0.0);
        }

        repository.inserir(candidatura);
    }

    @Transactional
    public void removerCandidatura(Long id) throws SQLException {
        repository.deletar(id);
    }
}