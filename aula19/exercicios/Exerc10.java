package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {



        /*
         * Criar um vetor A com 10 elementos inteiros. Construit um vetor B memso tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto
         * da divisão do respectivo elemento de A por 2, ou seja: B[i] = A[i] % 2
         */


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        System.out.println();

        System.out.println("Valores armazenados no vetor B: ");
        for (int valor : vetorB) {
            System.out.println("Valor: " + valor);
        }


    }
}
