package com.igor.cursojava.aula34.exercicios.exerc02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        /*
        * Escreva uma classe Calculadora que tenha 0s seguintes métodos: somar, subtrair, multiplicar, dividir, elevar à potêncian.
        * Desenvolva um programa para testar essa classe.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite o 2º número: ");
        double num2 = scan.nextDouble();

        System.out.println();
        System.out.printf("%.0f + %.0f = %.0f\n", num1, num2, Calculadora.soma(num1, num2));
        System.out.printf("%.0f - %.0f = %.0f\n", num1, num2, Calculadora.subtrair(num1, num2));
        System.out.printf("%.0f * %.0f = %.0f\n", num1, num2, Calculadora.multiplicar(num1, num2));
        System.out.printf("%.0f / %.0f = %.0f\n", num1, num2, Calculadora.dividir(num1, num2));
        System.out.printf("%.0f ** %.0f = %.0f\n", num1, num2, Calculadora.potencia(num1, num2));
    }
}
