package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {


        /*
        * Números palíndromos são aqueles que escritos da direita para a esquerda tem o mesmo valor quando
        * escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; etc.. Escreva um programa que
        * verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro
        * elemento do vetor for igual ao último, se o segundo é igual o penultimo e assim por diante até
        * verificar todos os elementos ou chegar a conclusão que o vetor não é um palindromo.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.print("Digite um número: ");
            vetorA[i] = scan.nextInt();

        }
        System.out.println();

        if (vetorA[0] != vetorA[9] ||
                vetorA[1] != vetorA[8] ||
                vetorA[2] != vetorA[7] ||
                vetorA[3] != vetorA[6] ||
                vetorA[4] != vetorA[5]) {

            System.out.println("Não é palíndromo!");
        } else {

            System.out.print(" - ");
            for (int elemento : vetorA) {
                System.out.print(elemento + " - ");
            }

        }
    }
}
