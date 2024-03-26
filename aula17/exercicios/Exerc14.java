package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {


        /*
        * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares
        * e a quantidade de números ímpares
        */

        Scanner scan = new Scanner(System.in);
        double num;
        int par = 0, impar = 0;


        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite um número: ");
            num = scan.nextDouble();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }

        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
