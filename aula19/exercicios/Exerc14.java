package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {


        /*
        * Criar um vetor A com com 10 elementos inteiros. Implementar um programa que defina e escreva a média aritmética simples dos elementos
        * ímpares armazenados neste vetor
        */


        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int media = 0;
        int impares = 0;


        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {

                impares++;
                soma += vetorA[i];

            }

        }

        media = soma / impares;

        System.out.println();

        System.out.println("A média aritmética simples dos números ímpares é: " + media);
    }
}
