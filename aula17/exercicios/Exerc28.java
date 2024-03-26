package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc28 {
    public static void main(String[] args) {


        /*
        * Faça um programa que calcule um valor total investido por um colecionador em sua coleção de CDs
        * e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor
        * para cada um.
        */

        Scanner scan = new Scanner(System.in);

        double valorTotal = 0;
        double valorCD;
        double media;

        System.out.print("Informe a quantidade de CDs: ");
        int qtdCd = scan.nextInt();


        for (int i = 1; i <= qtdCd; i++) {

            System.out.print("Digite o valor do " + i + "º CD: ");
            valorCD = scan.nextDouble();

            valorTotal += valorCD;

        }

        media = valorTotal / qtdCd;

        System.out.println();
        System.out.printf(String.format("O valor total gasto com os CDs é de R$ %.2f\n", valorTotal));
        System.out.printf(String.format("A média de gastos com cada CD é de R$ %.2f", media));

    }
}
