package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça dois números e imprima o maior deles
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scan.nextInt();

        if (n1 > n2) {
            System.out.println("O número maior é o " + n1 + " que foi o primeiro a ser digitado!");
        } else {
            System.out.println("O número maior é o " + n2 + " que foi o segundo a ser digitado!");
        }
    }
}
