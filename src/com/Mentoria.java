package com;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria{" + super.toString() +
                "data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }
}
