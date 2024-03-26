package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {


        /*
        *
        * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        * obedecendo as seguintes regras de formação:
        * a) B deverá receber 1 quando A[i] for par
        * b) B deverá receber 0 quandi A[i] for ímpar.
        */

        Scanner scan = new Scanner(System.in);


        int[] vetorA = new int[10];
        int[] vetorB = new int[10];


        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite um número: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }

        }
        System.out.println();

        for (int elemento : vetorA) {

            System.out.println("Valor do vetor A: " + elemento);
        }

        System.out.println();

        for (int elemento : vetorB) {

            System.out.println("Elemento: " + elemento);
        }
    }
}
