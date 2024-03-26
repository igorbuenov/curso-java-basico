package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {

        /*
        * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares,
        * respectivamente, armazenados neste vetor.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int impares = 0;
        int pares = 0;
        double porcentagemPar;
        double porcentagemImpar;


        System.out.println("Digite os valores para armazenar no vetor A");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                impares++;
            }

            if (vetorA[i] % 2 == 0) {
                pares++;
            }

        }

        System.out.println();

        // % = (pares / vetorA.length) x 100
        porcentagemPar = (double) pares / vetorA.length * 100;
        // % = (impares / vetorA.length) x 100
        porcentagemImpar = (double) impares / vetorA.length * 100;

        System.out.println("Porcentagem de elementos pares: " + porcentagemPar + "%.");

        System.out.println("Porcentagem de elementos ímpares: " + porcentagemImpar + "%.");

    }
}
