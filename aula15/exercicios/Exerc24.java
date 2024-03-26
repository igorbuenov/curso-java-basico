package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {


        /*
        * Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
        * O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
        * par ou ímpar
        * positivo ou negativo
        * inteiro ou decimal
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite qual operação deseja fazer: ");
        System.out.println("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão | 5 - Resto da divisão");
        int operacao = scan.nextInt();
        System.out.println();

        double resultado = 0;

        if (operacao == 1) {

            resultado = num1 + num2;

        } else if (operacao == 2) {

            resultado = num1 - num2;

        } else if (operacao == 3) {

            resultado = num1 * num2;

        } else if (operacao == 4) {

            resultado = num1 / num2;

        } else if (operacao == 5) {

            resultado = num1 % num2;

        } else {

            System.out.println("Operação inválida!");

        }

        if ((resultado % 2 == 0) && (resultado > 0)) { // PAR E POSITIVO

            if (resultado % 1 == 0) {
                System.out.println("O número " + resultado + " é par, positivo e inteiro");
            } else {
                System.out.println("O número " + resultado + " é par, positivo e decimal");
            }

        } else if ((resultado % 2 == 0) && (resultado < 0)){ // PAR E NEGATIVO

            if (resultado % 1 == 0) {
                System.out.println("O número " + resultado + " é par, negativo e inteiro");
            } else {
                System.out.println("O número " + resultado + " é par, negativo e decimal");
            }

        } else if ((resultado % 2 != 0) && (resultado > 0)) { // IMPAR E POSITIVO

            if (resultado % 1 == 0) {
                System.out.println("O número " + resultado + " é ímpar, positivo e inteiro");
            } else {
                System.out.println("O número " + resultado + " é ímpar, positivo e decimal");
            }

        } else { // IMPAR E NEGATIVO

            if (resultado % 1 == 0) {
                System.out.println("O número " + resultado + " é ímpar, negativo e inteiro");
            } else {
                System.out.println("O número " + resultado + " é ímpar, negativo e decimal");
            }
        }
    }
}
