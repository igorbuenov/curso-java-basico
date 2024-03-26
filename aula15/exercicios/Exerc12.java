package com.igor.cursojava.aula15.exercicios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        /*
        * Faça um programa para o calculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do
        * salário bruto (conforme a tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do salário Bruto, mas não é
        * descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O Programa deverá
        * pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
        * -> Desconto de IR
        * -> Salário Bruto até 900 (inclusive) - isento
        * -> Salário Bruto até 1500 (inclusive) - desconto de 5%
        * -> Salário Bruto até 2500 (inclusive) - desconto de 10%
        * -> Salário Bruto acima de 2500 - desconto de 20%
        * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
        * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        *
        * ..:: TABELA ::..
        *
        * Salário Bruto: (5 * 220)            : R$ 1100,00
        * (-) IR (5%)                         : R$   55,00
        * (-) INSS (10%)                      : R$  110,00
        * FGTS (11%)                          : R$  121,00
        * Total de descontos                  : R$  165,00
        * Salário Líquido                     : R$  935,00
        * */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = scan.nextDouble();
        System.out.print("Digite quantas horas trabalha mensalmente: ");
        double qtdHorasPorMes = scan.nextDouble();

        // CALCULOS

        double salarioBruto = qtdHorasPorMes * valorHora;
        double impostoDeRenda;
        double percentualIR = 0;

        if (salarioBruto <= 900 ) {
            percentualIR = 0;
        } else if (salarioBruto >= 900 && salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto >= 1500 && salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        impostoDeRenda = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double descontos = inss + impostoDeRenda;
        double salarioLiquido = salarioBruto - descontos;

        // SAÍDA DE DADOS
        System.out.println();
        System.out.println("Salário Bruto (" + valorHora + " * " + qtdHorasPorMes + ")             : R$ " + salarioBruto);
        System.out.println("(-) IR ("+ percentualIR +"%)                           : R$ " + impostoDeRenda);
        System.out.println("(-) INSS (10%)                          : R$ " + inss);
        System.out.println("FGTS (11%)                              : R$ " + fgts);
        System.out.println("Total de descontos                      : R$ " + descontos);
        System.out.println("Salário Líquido                         : R$ " + salarioLiquido);




    }
}
