package com.igor.cursojava.aula20.exercicios;

import java.util.Random;

public class Exerc02 {
    public static void main(String[] args) {


        /*
         * Gere e imprima uma matriz 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5
         * e qual é o maior valor e o menor valor da coluna 7
         */

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        // ATRIBUINDO VALORES
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                numerosAleatorios[i][j] = numeroRandom.nextInt(10);

            }
        }

        // IMPRIMINDO VALORES
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {

                System.out.print(numerosAleatorios[i][j] + " ");

            }
            System.out.println();
        }

        // LINHA 5
        int maiorL5 = 0;
        int menorL5 = 0;
        int linha5 = 5;
        
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {

            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }

            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }

        }
        System.out.println();
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        System.out.println();

        // LINHA 7
        int maiorL7 = 0;
        int menorL7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < numerosAleatorios.length; i++) {

            if (numerosAleatorios[i][coluna7] > maiorL7) {
                maiorL7 = numerosAleatorios[linha5][i];
            }

            if (numerosAleatorios[i][coluna7] < menorL7) {
                menorL7 = numerosAleatorios[linha5][i];
            }

        }
        System.out.println();
        System.out.println("Maior valor da coluna 7 = " + maiorL7);
        System.out.println("Menor valor da coluna 7 = " + menorL7);
        System.out.println();





    }
}
