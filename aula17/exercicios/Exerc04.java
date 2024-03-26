package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {


        /*
        * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
        * e que a população de uma pais B seja da ordem de 200000 habitantes com uma taxa de crescimento de 1,5%.
        * Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse
        * ou iguale a população do país B, mantida as taxas de crescimento;
        */

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;
        double percentualA;
        double percentualB;


        do {

            percentualA = (paisA / 100) * 3;
            percentualB = (paisB / 100) * 1.5;

            paisA += percentualA;
            paisB += percentualB;

            anos++;

        } while (paisA < paisB);

        System.out.println();
        System.out.printf("O país A alcançou em tamanho de população o país B em %d anos.", anos);
        System.out.println();
        System.out.println("População do páis A: " + paisA);
        System.out.println("População do páis B: " + paisB);



    }
}
