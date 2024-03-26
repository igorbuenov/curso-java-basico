package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {


        /*
        * Faça um programa que dado um conjuto N de números, determine o menor valor, o maior valor
        * e a soma dos valores
        */


        Scanner scan = new Scanner(System.in);

        int num;
        int numMenor = 0;
        int numMaior = 0;
        int soma;

        System.out.print("Informe a quantidade de números a serem digitados: ");
        int qtdNumeros = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= qtdNumeros; i++) {

            System.out.print("Digite um número: ");
            num = scan.nextInt();

            if (num > numMaior) {

                numMaior = num;

                if (numMenor == 0) {

                    numMenor = numMaior;

                }

            }

            if (num < numMenor) {

                numMenor = num;

            }

        }

        soma = numMaior + numMenor;

        System.out.println(String.format("\nO número maior é %d e o número menor é %d, e a soma dos dois é %d.", numMaior, numMenor, soma));

    }
}
