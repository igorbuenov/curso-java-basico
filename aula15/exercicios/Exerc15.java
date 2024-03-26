package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {


        /*
        * Faça o programa que peça os 3 lados de um triângulo. O programa
        * deverá informar se os valores podem ser um triângulo. Indique,
        * caso os lados formem um triângulo, se o mesmo é: equilatero, isósceles
        * ou escaleno.
        * Dicas:
        * Três lados formam um triângulo quando a soma de quaisquer dois lados
        * for maior que o terceiro
        * -> Triângulo equilátero: três lados iguais
        * -> Triângulo Isósceles: quaisquer dois lados iguais
        * -> Triângulo Escaleno: três lados diferentes
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado A: ");
        double ladoA = scan.nextDouble();
        System.out.print("Informe o tamanho do lado B: ");
        double ladoB = scan.nextDouble();
        System.out.print("Informe o tamanho do lado C: ");
        double ladoC = scan.nextDouble();

        if ((ladoA + ladoB) > ladoC || (ladoA + ladoC) > ladoB || (ladoB + ladoC) > ladoA) {

            if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
                System.out.print("Três lados diferentes: Triângulo ESCALENO");
            } else if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
                System.out.print("Três lados iguais: Triângulo EQUILATERO");
            } else {
                System.out.print("Dois lados iguais e 1 diferente: Triângulo ISÓSCELES");
            }

        } else {

            System.out.println("Não é um triângulo");

        }


    }
}
