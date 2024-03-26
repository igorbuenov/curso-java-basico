package com.igor.cursojava.aula33.exercicios.exerc02;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean saque(double valorSaque) {

        if (saldo >= valorSaque) {

            saldo -= valorSaque;
            return true;

        } else {

            if (especial) {

                double limite = limiteEspecial + saldo;

                if (limite >= valorSaque) {

                    saldo -= valorSaque;
                    return true;

                } else {
                    return false;
                }

            } else {

                return false;

            }


        }

    }

    public void depositar(double valorDeposito) {

        saldo += valorDeposito;

    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + getSaldo());
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

    public String toString() {

        return String.format(
                "Número: %s \n" +
                        "Agência: %s \n" +
                        "Saldo: R$ %.2f"
                , numero, agencia, saldo);
    }


}
