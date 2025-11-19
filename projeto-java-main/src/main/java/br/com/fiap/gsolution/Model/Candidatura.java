package br.com.fiap.gsolution.Model;

import java.time.LocalDateTime;

public class Candidatura {
    private Long id;
    private Long usuarioId;
    private Long projetoId;
    private String status;
    private Double horasPrevistas;
    private Double horasEntregues;
    private LocalDateTime dataCandidatura;

    public Candidatura() {}

    public Candidatura(Long id, Long usuarioId, Long projetoId, String status,
                       Double horasPrevistas, Double horasEntregues, LocalDateTime dataCandidatura) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.projetoId = projetoId;
        this.status = status;
        this.horasPrevistas = horasPrevistas;
        this.horasEntregues = horasEntregues;
        this.dataCandidatura = dataCandidatura;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getProjetoId() { return projetoId; }
    public void setProjetoId(Long projetoId) { this.projetoId = projetoId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Double getHorasPrevistas() { return horasPrevistas; }
    public void setHorasPrevistas(Double horasPrevistas) { this.horasPrevistas = horasPrevistas; }

    public Double getHorasEntregues() { return horasEntregues; }
    public void setHorasEntregues(Double horasEntregues) { this.horasEntregues = horasEntregues; }

    public LocalDateTime getDataCandidatura() { return dataCandidatura; }
    public void setDataCandidatura(LocalDateTime dataCandidatura) { this.dataCandidatura = dataCandidatura; }
}