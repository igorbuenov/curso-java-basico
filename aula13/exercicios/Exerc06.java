package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {

        // Faça um programa que peça o raio de um círculo, calcule e moste sua área

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o raio do circulo: ");
        double raio = scan.nextDouble();

        double pi = 3.14159;

        // Calculo da area de um circulo
        double area = pi * (raio * raio);

        System.out.println("A area do circulo é: " + area);

    }
}
