package com.igor.cursojava.aula27.exercicios.exerc02;

public class Program {
    public static void main(String[] args) {

        /*
        * Crie uma classe para representar uma conta corrente que possui um número, saldo, status que informa se ela é especial ou não, um limite.
        * Desenvolva métodos para realizar saque(verificadno se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se
        * o cliente está usando o cheque especial ou não.
        * */


        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;


        boolean saqueEfetuado = conta.saque(10);

        if (saqueEfetuado) {

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo: R$ " + conta.saldo);

        } else {

            System.out.println("Saldo insuficiente!");

        }

        System.out.println();

        saqueEfetuado = conta.saque(500);

        if (saqueEfetuado) {

            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo: R$ " + conta.saldo);

        } else {

            System.out.println("Saldo insuficiente!");

        }

        conta.depositar(3000);

        conta.dadosConta();



    }
}
