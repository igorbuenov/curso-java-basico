package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {


        /*
         * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
         * elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i
         * */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }
        System.out.println();

        System.out.println("Valores armazenados no vetor B: ");
        for (int valor : vetorB) {
            System.out.println("Valor: " + valor);
        }

    }
}
