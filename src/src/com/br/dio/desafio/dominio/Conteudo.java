package com.br.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP = 10d;

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public abstract double calcularXP();

}
