package br.com.fiap.gsolution.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Evidencia {
    private Long id;
    private Long projetoId;
    private Long autorId;
    private String tipo;
    private String caminhoArquivo;
    private String indicadorImpacto;
    private BigDecimal valorIndicador;
    private LocalDateTime dataEnvio;

    public Evidencia() {
    }

    public Evidencia(Long id, Long projetoId, Long autorId, String tipo,
                     String caminhoArquivo, String indicadorImpacto,
                     BigDecimal valorIndicador, LocalDateTime dataEnvio) {
        this.id = id;
        this.projetoId = projetoId;
        this.autorId = autorId;
        this.tipo = tipo;
        this.caminhoArquivo = caminhoArquivo;
        this.indicadorImpacto = indicadorImpacto;
        this.valorIndicador = valorIndicador;
        this.dataEnvio = dataEnvio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getProjetoId() { return projetoId; }
    public void setProjetoId(Long projetoId) { this.projetoId = projetoId; }

    public Long getAutorId() { return autorId; }
    public void setAutorId(Long autorId) { this.autorId = autorId; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCaminhoArquivo() { return caminhoArquivo; }
    public void setCaminhoArquivo(String caminhoArquivo) { this.caminhoArquivo = caminhoArquivo; }

    public String getIndicadorImpacto() { return indicadorImpacto; }
    public void setIndicadorImpacto(String indicadorImpacto) { this.indicadorImpacto = indicadorImpacto; }

    public BigDecimal getValorIndicador() { return valorIndicador; }
    public void setValorIndicador(BigDecimal valorIndicador) { this.valorIndicador = valorIndicador; }

    public LocalDateTime getDataEnvio() { return dataEnvio; }
    public void setDataEnvio(LocalDateTime dataEnvio) { this.dataEnvio = dataEnvio; }
}