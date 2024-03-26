package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        // Faça um oprograma que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em grasu Celsius

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a temperauta em graus Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf(String.format("Temperatura em Celsius: °%.2f", celsius));
    }
}
