package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        /*
        * Faça um programa que leia três números e  mostre-os em ordem decrescente.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 < num2 && num1 < num3) {

            if (num2 < num3) {
                System.out.print(num3 + " - " + num2 + " - " + num1);
            } else {
                System.out.println(num2 + " - " + num3 + " - " + num1);
            }

        } else if (num2 < num3 && num2 < num1) {

            if (num3 < num1) {
                System.out.println(num1 + " - " + num3 + " - " + num2);
            } else {
                System.out.println(num3 + " - " + num1 + " - " + num2);
            }

        } else {

            System.out.println(num1 + " - " + num2 + " - " + num3);

        }

    }
}
