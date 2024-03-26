package com.igor.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {


        /*
        * Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e encontre a quantidade de números pares,
        * e a quantidade de números ímpares*/

        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {

            System.out.println("Entre com o número para a linha " + (i+1) + ": ");
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print("Digite o " + (j+1) + "º número: ");
                matrizM[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                if (matrizM[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }

            }
        }
        System.out.println();

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {

                System.out.print(matrizM[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Pares: " + qtdPares);
        System.out.println("Impares: " + qtdImpares);


    }
}
