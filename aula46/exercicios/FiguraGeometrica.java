package com.igor.cursojava.aula46.exercicios;


// CLASSE MÃE
public abstract class FiguraGeometrica {

    private String nome;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
