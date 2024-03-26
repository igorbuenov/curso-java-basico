package com.igor.cursojava.aula43.exercicios.exerc03;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero() {
        this.setCor ("Castanho");
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString () + "\n" +
                "Alimento: " + alimento;
    }
}
