package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de sua escolha: ");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("O número que você digitou é positivo");
        } else {
            System.out.println("O número que você digitou é negativo!");
        }
    }
}
