package com.igor.cursojava.aula24.exercicios.exerc05;

public class Exerc05 {
    public static void main(String[] args) {

        /*
        * Criar uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite
        */

        ContaCorrente conta1 = new ContaCorrente();

        conta1.numero = 1234567;
        conta1.saldo = 201.95;
        conta1.especial = true;

        if (conta1.especial){
            conta1.limiteEspecial = 100;
        }

        System.out.println("Número: " + conta1.numero);
        System.out.println("Saldo: R$ " + conta1.saldo);
        System.out.println("Limite especial: R$: " + conta1.limiteEspecial);



    }
}
