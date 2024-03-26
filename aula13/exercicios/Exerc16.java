package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {

        /*
        * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
        * pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida
        * em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem
        * compradas e o preço total.
        * */

        Scanner scan = new Scanner(System.in);


        System.out.print("Informe em metros quadrados o tamanho da área a ser pintada: ");
        double metrosQuadrados = scan.nextDouble();


        double qtdPorLataDeTinta = 18;
        double valorLataDeTinta = 80.00;
        double qtdLataASerComprada = 0;
        double valorTotal = 0;

        // CALCULO
        double qtdUsada = metrosQuadrados / 3;

        if (qtdUsada > qtdPorLataDeTinta) {

        }else {

        }











    }
}
