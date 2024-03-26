package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {


        /*
        * Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano desejado: ");
        int ano = scan.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 != 0 || ano % 400 == 0) {
                System.out.println("O ano informado é bissexto!");
            } else {
                System.out.println("O ano informado não é bissexto!");
            }
        } else {
            System.out.println("O ano informado não é bissexto!");
        }
    }
}
