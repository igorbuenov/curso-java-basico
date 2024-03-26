package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        // (72.7 * altura) - 58

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe a sua altura para descobrir o seu peso ideal: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.printf(String.format("O seu peso ideal é: Kg %.2f", pesoIdeal));

    }
}
