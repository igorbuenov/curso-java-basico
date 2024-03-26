package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {


        /*
        * Um fruteira está vendendo frutas com a seguinte tabela de preços:
        *
        *
        *                     Até 5Kg                        Acima de 5kg
        * Morango          R$ 2,50 por Kg                   R$ 2,20 por Kg
        * Maçã             R$ 1,80 por Kg                   R$ 1,50 por Kg
        *
        *
        *
        * Se o cliente comprar mais de 8 Kg em frutas ou valor total da compra ultrapassar R$ 25,00
        * receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade
        * (em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a qtd em kg de morango: ");
        double qtdMorango = scan.nextDouble();

        System.out.print("Informe a qtd em kg de maça: ");
        double qtdMaca = scan.nextDouble();

        double precoMorango;
        double precoMaca;

        if (qtdMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (qtdMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double valorTotalMorango = precoMorango * qtdMorango;
        double valorTotalMaca = precoMaca * qtdMaca;
        double pesoTotal = qtdMaca + qtdMorango;
        double valorTotalCompra = valorTotalMorango + valorTotalMaca;
        double desconto = 0;
        double valorFinalCompraComDesconto = 0;

        if (pesoTotal > 8 || valorTotalCompra > 25) {

            desconto = (valorTotalCompra / 100) * 10;
            valorFinalCompraComDesconto = valorTotalCompra - desconto;

        }

        System.out.println();
        System.out.printf(String.format("Preço do morango: R$ %.2f\n", precoMorango).replace(".", ","));
        System.out.printf(String.format("Preço da maçã: R$ %.2f\n", precoMaca).replace(".", ","));
        System.out.printf(String.format("Peso do morango: Kg %.0f\n", qtdMorango).replace(",", "."));
        System.out.printf(String.format("Peso da maçã: Kg %.0f\n", qtdMaca).replace(",", "."));
        System.out.printf(String.format("Peso total: Kg %.0f\n", pesoTotal).replace(",", "."));
        System.out.printf(String.format("Valor total: R$ %.2f\n", valorTotalCompra).replace(".", ","));
        if (desconto > 0) {
            System.out.printf(String.format("Valor total com desconto: R$ %.2f\n", valorFinalCompraComDesconto).replace(".", ","));
        }


    }
}
