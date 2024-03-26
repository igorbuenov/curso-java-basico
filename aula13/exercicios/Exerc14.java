package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {


        /*
        João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
        Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estadp de SP (50kg)
        deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável
        peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o
        valor da multa que João deverá pagar. caso contrário mostrar tais variáveis com o conteúdo 0;
         */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double excesso = 0, multa = 0;

        System.out.print("Digite o peso de peixes: ");
        double peso = scan.nextDouble();
        System.out.println();

        if (peso > 50) {

            excesso = peso - 50;
            multa = excesso * 4;

            System.out.printf(String.format("Peso total de peixes: Kg %.2f\n", peso));
            System.out.printf(String.format("Peso excedido: Kg %.2f\n", excesso));
            System.out.printf(String.format("Multa a ser paga: R$ %.2f\n", multa));

        } else {

            System.out.printf(String.format("Peso total de peixes: Kg %.2f\n", peso));
            System.out.printf(String.format("Peso excedido: Kg %.2f\n", excesso));
            System.out.printf(String.format("Multa a ser paga: R$ %.2f\n", multa));

        }


    }
}
