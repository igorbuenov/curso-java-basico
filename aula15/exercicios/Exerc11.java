package com.igor.cursojava.aula15.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        /*
        * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
        * e lhe contrataram para desenvolver o programa que calculará os reajustes.
        *
        * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        * -> Salários até R$280,00(incluindo): aumento de 20%
        * -> Salários entre R$280,00 e R$700,00: aumento de 15%
        * -> Salários entre R$700,00 e R$1500,00: aumento de 10%
        * -> Salários de R$1500,00 em diante: aumento de 5%
        * Após o aumento ser realizado, informe na tela:
        * -> o salário antes do reajuste
        * -> o percentual de aumento aplicado
        * -> o valor do aumento
        * -> o novo salário, após o aumento
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: ");
        double salario = scan.nextDouble();

        double porcentagem;
        double aumento;
        double novoSalario;

        if (salario <= 280.0) {

            porcentagem = 20;
            aumento = (salario / 100) * 20;
            novoSalario = salario  + aumento;

        } else if (salario > 280.0 && salario <= 700.0) {

            porcentagem = 15;
            aumento = (salario / 100) * 15;
            novoSalario = salario  + aumento;

        } else if (salario >= 700.0 && salario <= 1500.0) {

            porcentagem = 10;
            aumento = (salario / 100) * 10;
            novoSalario = salario  + aumento;

        } else {

            porcentagem = 5;
            aumento = (salario / 100) * 5;
            novoSalario = salario + aumento;

        }

        System.out.println();
        System.out.printf(String.format("Salário antes do reajuste: R$ %.2f\n", salario));
        System.out.println("Percentual de aumento aplicado: " + porcentagem + "%.");
        System.out.printf(String.format("Valor do reajuste: R$ %.2f\n", aumento));
        System.out.printf(String.format("Novo salário: R$ %.2f", novoSalario));
    }
}
