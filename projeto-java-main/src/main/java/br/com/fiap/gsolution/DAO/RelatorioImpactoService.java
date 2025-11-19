package br.com.fiap.gsolution.DAO;

import br.com.fiap.gsolution.Model.RelatorioImpacto;
import br.com.fiap.gsolution.Repository.RelatorioImpactoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class RelatorioImpactoService {

    @Inject
    RelatorioImpactoRepository repository;

    public List<RelatorioImpacto> listarRelatorios() throws SQLException {
        return repository.listar();
    }

    @Transactional
    public void cadastrarRelatorio(RelatorioImpacto relatorio) throws SQLException {
        if (relatorio.getOdsMeta() == null || relatorio.getOdsMeta().isEmpty()) {
            throw new IllegalArgumentException("ODS meta é obrigatória");
        }
        if (relatorio.getIndicador() == null || relatorio.getIndicador().isEmpty()) {
            throw new IllegalArgumentException("Indicador é obrigatório");
        }
        if (relatorio.getValor() == null) {
            throw new IllegalArgumentException("Valor do indicador é obrigatório");
        }
        if (relatorio.getProjetoId() == null) {
            throw new IllegalArgumentException("Projeto vinculado ao relatório é obrigatório");
        }

        if (relatorio.getDataRelatorio() == null) {
            relatorio.setDataRelatorio(LocalDate.now());
        }

        repository.inserir(relatorio);
    }

    @Transactional
    public void removerRelatorio(Long id) throws SQLException {
        repository.deletar(id);
    }
}