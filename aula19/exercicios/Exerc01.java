package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {


        /*
        * Crie um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos"
        * elementos do vetor A, ou seja B[i] = A[i]
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.println();

        System.out.println("Valores armazenados no vetor A: ");
        for (int valor : vetorA) {
            System.out.println("Valor: " + valor);
        }
        System.out.println("Valores armazenados no vetor B: ");
        for (int valor : vetorB) {
            System.out.println("Valor: " + valor);
        }

    }
}
