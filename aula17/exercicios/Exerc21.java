package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
        * Um número primo é aquele que é divisível somente por ele mesmo ou por um.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                System.out.println("Não é um número primo.");
                primo = false;

            }
        }

        if (primo) {
            System.out.println(num + " é um número primo.");
        }



    }
}
