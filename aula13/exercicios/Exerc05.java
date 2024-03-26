package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {


        // Faça um programa que converta metros para centimetros

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número em metros para converter em centímetros: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println(cm + "cm");


    }
}
