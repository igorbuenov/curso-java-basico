package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça um número inteiro e determine se ele é par um ímpar*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele é par ou ímpar: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par!");
        } else {
            System.out.println("O número " + num + " é ímpar!");
        }
    }
}
