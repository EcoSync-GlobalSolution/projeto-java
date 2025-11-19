package br.com.fiap.gsolution.Model;

public class UsuarioHabilidade {
    private Long id;
    private Long usuarioId;
    private Long habilidadeId;
    private String nivel;
    private Double anosExperiencia;

    public UsuarioHabilidade() {}

    public UsuarioHabilidade(Long id, Long usuarioId, Long habilidadeId, String nivel, Double anosExperiencia) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.habilidadeId = habilidadeId;
        this.nivel = nivel;
        this.anosExperiencia = anosExperiencia;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getHabilidadeId() { return habilidadeId; }
    public void setHabilidadeId(Long habilidadeId) { this.habilidadeId = habilidadeId; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public Double getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(Double anosExperiencia) { this.anosExperiencia = anosExperiencia; }
}