package br.com.fiap.gsolution.Model;

public class Organizacao {
    private Long id;
    private String nome;
    private String tipo;
    private String emailContato;
    private String verificada;

    public Organizacao() {
    }

    public Organizacao(Long id, String nome, String tipo, String emailContato, String verificada) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.emailContato = emailContato;
        this.verificada = verificada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getVerificada() {
        return verificada;
    }

    public void setVerificada(String verificada) {
        this.verificada = verificada;
    }
}

