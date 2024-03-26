package com.igor.cursojava.aula43.exercicios.exerc01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    public boolean sacar(double valorSaque) {


        double saldoComLimite = this.getSaldo () + limite;

        if ((saldoComLimite - valorSaque) >= 0 ) {
            this.setSaldo(this.getSaldo() - valorSaque);
            return true;
        }

        return false;

    }



    @Override
    public String toString() {
        return "..:: Conta Especial ::..\n" +
                String.format ("Limite: R$ %.2f.\n",limite )  +
                super.toString();
    }
}
