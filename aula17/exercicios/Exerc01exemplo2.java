package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc01exemplo2 {
    public static void main(String[] args) {


        /*
         * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor sejá inválido e
         * continue pedindo até que o usuário informe um valor válido
         */

        Scanner scan =  new Scanner(System.in);

        boolean notaValida = false;

        do {

            System.out.print("Informe uma nota entre 0 e 10: ");
            int nota = scan.nextInt();
            System.out.println();

            if (nota >= 0 && nota <= 10) {

                notaValida = true;
                System.out.println("Você digitou a nota: " + nota);

            } else {

                System.out.println("Nota inválida!");

            }

        } while (!notaValida);
    }
}
