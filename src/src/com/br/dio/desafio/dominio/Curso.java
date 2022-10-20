package com.br.dio.desafio.dominio;

public class Curso extends Conteudo{
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + getTitulo() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }

    public Curso() {
    }

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP+120D;
    }
}
