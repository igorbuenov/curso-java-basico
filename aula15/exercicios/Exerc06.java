package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {

        /*
        * Faça um programa que leia três números e mostre o maior deles.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número a ser digitado que é o " + num1 + " é o maior.");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("O segundo número a ser digitado que é o " + num2 + " é o maior.");
        } else {
            System.out.println("O terceiro número a ser digitado que é o " + num3 + " é o maior.");
        }
    }
}
