package com.igor.cursojava.aula43.exercicios.exerc02;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();


    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                String.format("Renda bruta: R$ %.2f\n", rendaBruta);
    }
}
