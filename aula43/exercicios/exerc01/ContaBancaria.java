package com.igor.cursojava.aula43.exercicios.exerc01;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean sacar(double valorSaque) {

        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            return true;
        }

        return false;

    }

    public void depositar(double valorDeposito) {

        saldo += valorDeposito;

    }



    @Override
    public String toString() {
        return "Nome: " + nomeCliente + "\n" +
                "Conta: " + numConta + "\n" +
                String.format("Saldo: R$ %.2f",  saldo);
    }
}
