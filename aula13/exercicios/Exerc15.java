package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {


        /*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
          Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para
          o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

          -> Salário bruto
          -> quanto pagou ao INSS
          -> quanto pagou ao sindicato
          -> Salário líquido
          -> Calcule os descontos e o salário líquido, conforme a tanela abaixo

                Salário bruto - IR(11%) - INSS(8%) - Sindicato(5%) = Salário Líquido
        */

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o quanto você ganha por hora: ");
        double ganhoPorHora = scan.nextDouble();

        System.out.print("Digite o numero de horas trabalhadas por mês: ");
        double horasTrabalhadasPorMes = scan.nextDouble();

        double salarioBruto = horasTrabalhadasPorMes * ganhoPorHora;
        double impostoDeRenda = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println();
        System.out.printf(String.format("Salário bruto: %.2f\n", salarioBruto));
        System.out.printf(String.format("Desconto do Imposto de Renda: %.2f\n", impostoDeRenda));
        System.out.printf(String.format("Desconto INSS: %.2f\n", inss));
        System.out.printf(String.format("Desconto Sindicato: %.2f\n", sindicato));
        System.out.printf(String.format("Salário líquido: %.2f\n", salarioLiquido));



    }
}
