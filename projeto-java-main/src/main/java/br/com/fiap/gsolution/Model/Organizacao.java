package br.com.fiap.gsolution.Model;

import java.time.LocalDateTime;

public class Organizacao {
    private Long id;
    private String nome;
    private String tipo;
    private String emailContato;
    private boolean verificada;
    private LocalDateTime dataCriacao;

    public Organizacao() {
    }

    public Organizacao(Long id, String nome, String tipo, String emailContato, boolean verificada, LocalDateTime dataCriacao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.emailContato = emailContato;
        this.verificada = verificada;
        this.dataCriacao = dataCriacao;
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

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}