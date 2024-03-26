package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {


        /*
         * Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
         * Escreva um programa que determine e escreva a menor e a maior idades e respectivas posições.
         */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int idade;
        int idadeMaior = 0;
        int idadeMenor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            idade = scan.nextInt();

            vetorA[i] = idade;

            if (vetorA[i] > idadeMaior) {

                idadeMaior = vetorA[i];
                posicaoMaior = i;

                if ( idadeMenor == 0) {

                    idadeMenor = idadeMaior;
                    posicaoMenor = i;
                }

            }

            if (vetorA[i] < idadeMenor) {
                idadeMenor = vetorA[i];
                posicaoMenor = i;
            }

        }
        System.out.println();

        System.out.println("Idade maior " + idadeMaior + " - posição " + (posicaoMaior+1));
        System.out.println("Idade menor " + idadeMenor + " - posição " + (posicaoMenor+1));



    }
}
