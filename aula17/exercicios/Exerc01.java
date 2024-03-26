package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {


        /*
        * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor sejá inválido e
        * continue pedindo até que o usuário informe um valor válido
        */

        Scanner scan =  new Scanner(System.in);

        System.out.print("Informe uma nota entre 0 e 10: ");
        int nota = scan.nextInt();

        int tentativa = 0;

        while (nota < 0 || nota > 10) {

            System.out.println("Número inválido!");
            System.out.println();

            System.out.print("Digite novamente: ");
            nota = scan.nextInt();

            tentativa++;

        }

        System.out.println();
        System.out.println("Nota digitada: " + nota);
    }
}
