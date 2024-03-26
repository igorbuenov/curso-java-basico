package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc07exemplo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int num;
        int maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite um número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }

        }

        System.out.println();
        System.out.println("O maior número é: " + maior);

    }
}
