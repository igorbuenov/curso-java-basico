package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {


        /*
         * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser a raiz
         * quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i])
         * */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
        }
        System.out.println();

        System.out.println("Valores armazenados no vetor B: ");
        for (int valor : vetorB) {
            System.out.println("Valor: " + valor);
        }
    }
}
