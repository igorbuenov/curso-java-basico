package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {


        // Faça um programa que peça dois números e imprima a soma.

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scan.nextInt();

        int soma = n1 + n2;
        System.out.println("O resultado da soma entre os dois números é: " + soma);
    }
}
