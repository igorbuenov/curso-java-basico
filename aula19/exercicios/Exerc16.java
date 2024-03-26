package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {

        /*
        *
        * Criar um vetor A com elementos inteiros. Escrever um programa que calcule e escreva:
        * a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        * b) a quantidade de elementos armazenados no vetor que são iguais a 15;
        * c) a média dos elementos armazenados no vetor que são superiores a 15;
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int menor = 0;
        int igual = 0;
        int maior = 0;
        int mediaMaior15;

        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();



            if (vetorA[i] == 15) {
                igual++;
            } else if (vetorA[i] > 15) {
                maior++;
                soma += vetorA[i];
            } else {
                menor += vetorA[i];
            }

        }
        System.out.println();

        mediaMaior15 = soma / maior;

        System.out.println("A soma dos elementos menores que 15 no vetor é: " + menor);
        System.out.println("A quantidade de elementos no vetor menor que 15 é: " + igual);
        System.out.println("A média dos elementos armazenados no vetor maior que 15 é: " + mediaMaior15);

    }
}
