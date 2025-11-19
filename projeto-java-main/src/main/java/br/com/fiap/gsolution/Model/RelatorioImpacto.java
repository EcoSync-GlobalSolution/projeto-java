package br.com.fiap.gsolution.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RelatorioImpacto {
    private Long id;
    private Long projetoId;
    private String odsMeta;
    private String indicador;
    private BigDecimal valor;
    private LocalDate dataRelatorio;

    public RelatorioImpacto() {
    }

    public RelatorioImpacto(Long id, Long projetoId, String odsMeta,
                            String indicador, BigDecimal valor, LocalDate dataRelatorio) {
        this.id = id;
        this.projetoId = projetoId;
        this.odsMeta = odsMeta;
        this.indicador = indicador;
        this.valor = valor;
        this.dataRelatorio = dataRelatorio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getProjetoId() { return projetoId; }
    public void setProjetoId(Long projetoId) { this.projetoId = projetoId; }

    public String getOdsMeta() { return odsMeta; }
    public void setOdsMeta(String odsMeta) { this.odsMeta = odsMeta; }

    public String getIndicador() { return indicador; }
    public void setIndicador(String indicador) { this.indicador = indicador; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public LocalDate getDataRelatorio() { return dataRelatorio; }
    public void setDataRelatorio(LocalDate dataRelatorio) { this.dataRelatorio = dataRelatorio; }
}