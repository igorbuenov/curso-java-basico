package com.igor.cursojava.aula15.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        /*
        * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        * sabendo que a decisão é sempre pelo mais barato.
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: ");
        double produto1 = scan.nextDouble();
        System.out.print("Digite o valor do segundo produto: ");
        double produto2 = scan.nextDouble();
        System.out.print("Digite o valor do terceiro produto: ");
        double produto3 = scan.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Produto 1 está com o preço mais em conta, pode comprar!");
        } else if (produto2 < produto3 && produto2 < produto1) {
            System.out.println("Produto 2 está com o preço mais em conta, pode comprar!");
        } else {
            System.out.println("Produto 3 está com o preço mais em conta, pode comprar!");
        }
    }
}
