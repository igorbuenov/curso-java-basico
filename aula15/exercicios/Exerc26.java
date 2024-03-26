package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {


        /*
        * Um posto está vendendo combustivéis com a seguinte tabela de descontos:
        *
        * Alcool:
        * Até 20 litros, desconto de 3% por litro
        * acima de 20 litros, desconto de 5% por litro
        *
        * Gasolina:
        * até 20 litros, desconto de 4% por litro
        * acima de 20 litros, desconto de 6% por litro
        *
        * Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma:
        * A-álcool, G- gasolina), calcule  e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro de
        * gasolina é R$ 2,50 o preço do litro do alcool é R$ 1,90.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a qtd de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.print("Informe o tipo de combustível abastecido ( A- Álcool ou G - Gasolina): ");
        String tipoCombustivel = scan.next();

        double valorLTAlcool = 1.90;
        double valorLTGasolina = 2.50;
        double valorSemDesconto;
        double desconto;
        double valorTotalComDesconto = 0;

        if (tipoCombustivel.equalsIgnoreCase("A")) {

            valorSemDesconto = valorLTAlcool * litros;

            if (litros <= 20) {

                desconto = (valorSemDesconto / 100) * 3;
                valorTotalComDesconto = valorSemDesconto - desconto;

            } else if (litros > 20) {

                desconto = (valorSemDesconto / 100) * 5;
                valorTotalComDesconto = valorSemDesconto - desconto;
            }

        } else {

            valorSemDesconto = valorLTGasolina * litros;

            if (litros <= 20) {

                desconto = (valorSemDesconto / 100) * 4;
                valorTotalComDesconto = valorSemDesconto - desconto;

            } else if (litros > 20) {

                desconto = (valorSemDesconto / 100) * 6;
                valorTotalComDesconto = valorSemDesconto - desconto;
            }

        }

        System.out.println();
        if (tipoCombustivel.equalsIgnoreCase("A")) {
            System.out.println("Combustível abastecido: A - Álcool");
            System.out.printf(String.format("Preço por litro: R$ %.2f\n", valorLTAlcool).replace('.', ','));
        } else {
            System.out.println("Combustível abastecido: G - Gasolina");
            System.out.printf(String.format("Preço por litro: R$ %.2f\n", valorLTGasolina).replace('.', ','));
        }

        System.out.printf(String.format("Total abastecido: %.0f litros\n", litros).replace(",", "."));
        System.out.printf(String.format("Valor total: R$ %.2f\n", valorSemDesconto).replace('.', ','));
        System.out.printf(String.format("Valor total com desconto: R$ %.2f\n", valorTotalComDesconto).replace('.', ','));


    }
}
