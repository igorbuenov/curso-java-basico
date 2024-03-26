package com.igor.cursojava.aula43.exercicios.exerc03;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe() {
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString () + "\n" +
                "Características: " + caracteristicas;
    }
}
