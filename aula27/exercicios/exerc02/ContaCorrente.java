package com.igor.cursojava.aula27.exercicios.exerc02;

public class ContaCorrente {


    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;


    boolean saque(double valorSaque) {

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

    void depositar(double valorDeposito) {

        saldo += valorDeposito;

    }

    boolean verificarUsoLimiteEspecial() {

        return saldo < 0;

    }

    public void dadosConta() {

        System.out.printf(String.format(
                "Número: %s \n" +
                        "Agência: %s \n" +
                        "Saldo: R$ %.2f"
                , numero, agencia, saldo));
    }


}
