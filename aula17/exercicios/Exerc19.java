package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {


        /*
        * Altere o programa anterior para que ele aceite apenas números entre 0 e 1000
        */

        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int num;
        int numMenor = 0;
        int numMaior = 0;
        int soma;

        do {

            System.out.print("Informe a quantidade de números a serem digitados entre 0 e 1000: ");
            qtdNumeros = scan.nextInt();
            System.out.println();

        } while (qtdNumeros < 0 || qtdNumeros > 1000);



        for (int i = 1; i <= qtdNumeros; i++) {

            System.out.print("Digite o " + i + "º número: ");
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
