package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {


        /*
        * A série de Fibonacci é formada pela sequência "0,1,1,2,3,5,8,13,21,34,55..." Faça um programa
        * capaz de gerar a série até o n-ésimo termo.
        */


        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o n-ésimo termo da séri de Fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.print(primeiro + ",");
        System.out.print(segundo + ",");

        for (int i = 3; i <= n ; i++) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

                System.out.print(proximo + ",");
        }
        System.out.print("...");
    }
}
