package com.igor.cursojava.aula19.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {


        /*
        * Implementar um programa que obtenha a cotação do dólar (U$) em realção ao real (R$) e a seguir armazene
        * em vetor A com 20 elementos as seguintes conversões:
        * A[i] = cotação do dolar * i, para todo i variando de 1 até 20
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacaoDolar;

        System.out.print("Entre com a cotação do dólar: ");
        cotacaoDolar = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = cotacaoDolar * (i+1);

        }

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf(String.format("%.2f U$ = R$ %.2f\n", (double) (i+1), vetorA[i]));

        }


    }
}
