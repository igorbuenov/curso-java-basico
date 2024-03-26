package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {


        /*
        * Faça um programa que calcule raízes de uma equação do segundo grau, na forma ax2 + bx + c.
        * O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário
        * nas seguintes situações:
        * A -> Se o usuário informar o valor de A igual a 0 a equação não é do segundo grau e o programa
        * não deve pedir os demais valores, sendo encerrado.
        *
        * B -> Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário
        * e encerre o programa.
        *
        * C -> Se o delta calculado for igual a 0  a equação possui apenas uma raiz real; Informe ao usuário
        *
        * D -> Se o delta for positivo, a equação possui duas raizes reais; Informe ao usuário.*/

        Scanner scan = new Scanner(System.in);


        double valorA;
        double valorB;
        double valorC;
        double delta;

        System.out.print("Informe o valor de A: ");
        valorA = scan.nextDouble();

        if (valorA == 0) {

            System.out.println("A equação não é de segundo grau.");

        } else {

            System.out.print("Informe o valor de B: ");
            valorB = scan.nextDouble();
            System.out.print("Informe o valor de C: ");
            valorC = scan.nextDouble();

            // SUBISTITUINDO VALORES -> ax² + b + c = 0;
            valorA = valorA * valorA;

            // DELTA -> delta = b² - 4ac
            delta = (valorB * valorB) - (4 * valorA * valorC);

            if (delta < 0) {
                System.out.println("A equação não possui raizes reais.");
            } else if (delta == 0) {
                System.out.println("A equação possui apenas uma raiz real");
            } else {
                System.out.println("A equação possui duas raizes reais.");
            }

        }
    }
}
