package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {


        /*
        * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C do mesmo tipo e tamanho,
        * obedecendo as seguintes regras de formação:
        * a) C[i] deverá receber 1 quando A[i] for maior que B[i]
        * b) C[i] deverá receber 0 quando A[i] for igual a B[i]
        * c) C[i] deverá receber -1 quando A[i] for menor que B[i]
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite um número no vetor A: ");
            vetorA[i] = scan.nextInt();
            System.out.print("Digite um número no vetor B: ");
            vetorB[i] = scan.nextInt();
            System.out.println();

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
        }
        System.out.println();

        System.out.println("Valores no Vetor C");
        for (int elemento : vetorC) {
            System.out.println(elemento);
        }
    }
}
