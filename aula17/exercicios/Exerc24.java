package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {


        /*
        * Faça um programa que calcule e mostre a média aritmética de N notas.
        */

        Scanner scan = new Scanner(System.in);
        int qtdNotas;
        double valorNotas = 0;
        double mediaAritmetica;

        System.out.print("Informe a quantidade de notas a serem digitadas: ");
        qtdNotas = scan.nextInt();

        for (int i = 1; i <= qtdNotas ; i++) {

            System.out.print("Digite a nota " + i + ": ");
            double nota = scan.nextDouble();

            valorNotas += nota;

        }

        mediaAritmetica = valorNotas / qtdNotas;

        System.out.println("A média aritmética das notas é: " + mediaAritmetica);

    }
}
