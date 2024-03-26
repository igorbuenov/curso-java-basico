package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {


        /*
        * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos
        * em A e B, ou seja: C[i] = A[i] + B[i]
         */


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.println("Digite os valores para armazenar no vetor A e B: ");
        System.out.println();

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Vetor A - posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            System.out.print("Vetor B - posição " + i + ": ");
            vetorB[i] = scan.nextInt();
            System.out.println();

            vetorC[i] = vetorA[i] + vetorB[i];

        }
        System.out.println();

        System.out.println("Valores armazenados no vetor C: ");
        for (int valor : vetorC) {
            System.out.println("Vetor C - valor = " + valor );
        }



    }
}
