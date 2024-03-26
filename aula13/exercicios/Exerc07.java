package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        // Faça um programa que calcule a área de um quadrado, em seguida moste o dobro desta área para o usuário.

        Scanner scan = new Scanner(System.in);

        double lado;

        System.out.println("Digite o lado do quadrado: ");
        lado = scan.nextDouble();

        double area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

        double dobroDaAreaDoQuadrado = area * 2;
        System.out.println("O dobro da área é: " + dobroDaAreaDoQuadrado);

    }
}
