package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        // Faça um oprograma que peça a temperatura em graus Celsius, transforme e mostre a temperatura em grasu Fahrenheit

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a temperauta em graus Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9) / 5 + 32;

        System.out.printf(String.format("Temperatura em Fahrenheit: °%.2f", fahrenheit));

    }
}
