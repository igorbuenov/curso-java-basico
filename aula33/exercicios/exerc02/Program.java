package com.igor.cursojava.aula33.exercicios.exerc02;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        * Crie uma classe para representar uma conta corrente que possui um número, saldo, status que informa se ela é especial ou não, um limite.
        * Desenvolva métodos para realizar saque(verificadno se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se
        * o cliente está usando o cheque especial ou não.
        * */

        Scanner scan = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldo(-10);


        System.out.println("Saldo na conta " + conta.getNumero() + " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.saque(10);

        if (saqueEfetuado) {

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo: R$ " + conta.getSaldo());

        } else {

            System.out.println("Saldo insuficiente!");

        }

        System.out.println();

        saqueEfetuado = conta.saque(500);

        if (saqueEfetuado) {

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo: R$ " + conta.getSaldo());

        } else {

            System.out.println("Saldo insuficiente!");

        }

        conta.depositar(3000);

        conta.toString();



    }
}
