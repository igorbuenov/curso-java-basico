package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {


        /*
         * A série de Fibonacci é formada pela sequência "0,1,1,2,3,5,8,13,21,34,55..." Faça um programa
         * que gere a série até que o valor seja maior que 500.
         */

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.print(primeiro + ",");
        System.out.print(segundo + ",");

        while (proximo <= 500) {

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(proximo + ",");
        }
    }
}
