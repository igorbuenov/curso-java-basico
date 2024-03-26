package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {


        /*
        * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os
        * elementos do vetor A são pares. Se pelo menos um elemento do não for par, o processo de repetição
        * para percorrer os elementos do vetor deve ser encerrado, como sugestão:
        * utilize uma variável do tipo flag para atingir este propósito
        */

        Scanner scan = new Scanner(System.in);

        boolean par = true;

        int[] vetorA = new int[10];



        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite um número: ");
            vetorA[i] = scan.nextInt();

        }
        System.out.println();



        for (int numero : vetorA) {

            do {

                if (numero % 2 == 0) {
                    System.out.println(numero);
                } else {
                    par = false;
                }

            } while (!par);

        }
























    }
}
