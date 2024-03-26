package com.igor.cursojava.aula17.exercicios;

public class Exerc09 {
    public static void main(String[] args) {


        /*
        * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
        */

        for (int i = 1; i <= 50; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
