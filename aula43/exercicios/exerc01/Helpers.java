package com.igor.cursojava.aula43.exercicios.exerc01;

public class Helpers {

    public static void realizarSaque(ContaBancaria conta, double valor) {

        if (conta.sacar(valor)) {
            System.out.println( String.format ("Saque efetuado com sucesso!\nNovo saldo: R$ %.2f", conta.getSaldo()));
        } else {
            System.out.println(String.format ("Saldo insuficiente para o saque de R$ %.2f.\nSaldo: R$ %.2f", valor, conta.getSaldo()));
        }

    }

}
