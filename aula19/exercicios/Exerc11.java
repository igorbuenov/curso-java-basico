package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {


        /*
        * Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementoas armazenados neste vetor
        * que são pares
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int par = 0;


        System.out.println("Digite os valores para armazenar no vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println();

        for (int valor : vetorA) {

            if (valor % 2 == 0) {
                par++;
                System.out.println("O valor " + valor + " é par!");
            }

        }
        System.out.println();
        System.out.println("O vetor possui um total de " + par + " valor(es) par(es)");


    }
}
