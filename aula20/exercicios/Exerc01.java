package com.igor.cursojava.aula20.exercicios;

import java.util.Random;

public class Exerc01 {
    public static void main(String[] args) {


        /*
        * Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9. Após isso determine o maior número da matriz e a sua posição
        * (linha, coluna)
        */

        int[][] matrizM = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                matrizM[i][j] = numeroRandom.nextInt(10);

            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }

            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                System.out.print(matrizM[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior valor = " + maior);
        System.out.println("Coluna = " + (coluna + 1));
        System.out.println("Linha = " + (linha + 1));





    }
}
