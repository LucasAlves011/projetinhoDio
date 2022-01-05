package com;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo,String descricacao,int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricacao);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + super.toString() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
