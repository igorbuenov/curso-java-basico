package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        // Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
        // a. O produto do dobro do primeiro com metade do segundo.
        // b. A soma do triplo do primeiro com o terceiro.
        // c. O terceiro elevado ao cubo.

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o número real: ");
        double numeroReal = scan.nextDouble();

        System.out.println();

        // CALCULO E RESULTADO A
        int resultadoA = (n1 * 2) * (n2 / 2);
        System.out.println("Resultado A: " + resultadoA);

        // CALCULO E RESULTADO B
        double resultadoB =  (n1 * 3) + numeroReal;
        System.out.println("Resultado B: " + resultadoB);

        // CALCULO E RESULTADO C
        double resultadoC = numeroReal * numeroReal * numeroReal;
        System.out.println("Resultado C: " + resultadoC);

        scan.close();
    }
}
