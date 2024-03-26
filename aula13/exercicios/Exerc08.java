package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        //Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        //Calcule e mostre o total do seu salário no referido mês.

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o quanto você ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();

        System.out.print("Digite o numero de horas trabalhadas por mês: ");
        double horasTrabalhadasPorMes = scan.nextDouble();

        double ganhoPorMes = horasTrabalhadasPorMes * ganhoPorHora;
        System.out.printf(String.format("Salário do mês: %.2f", ganhoPorMes));

    }
}
