package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {


        /*
         * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos neste vetor
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;


        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            soma += vetorA[i];
        }
        System.out.println();

        System.out.println("A soma dos valores armazenados é: " + soma);


    }
}
