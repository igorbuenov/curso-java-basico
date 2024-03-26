package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {


        /*
        * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
        * Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior
        * a 35 anos.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int idade;
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            idade = scan.nextInt();

            if (idade > 35) {
                cont++;
            }
        }
        System.out.println();

        System.out.println("Pessoas acimas de 35 anos no grupo: " + cont);


    }
}
