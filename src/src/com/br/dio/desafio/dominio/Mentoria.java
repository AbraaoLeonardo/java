package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP+20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" + getTitulo()+
                "data= " + data +
                '}';
    }
}
