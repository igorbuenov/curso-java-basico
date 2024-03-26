package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {

        // Faça um programa que peça as 4 notas bimestrais e mostre a média

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro bimestre: ");
        int b1 = scan.nextInt();

        System.out.print("Digite a nota do segundo bimestre: ");
        int b2 = scan.nextInt();

        System.out.print("Digite a nota do terceiro bimestre: ");
        int b3 = scan.nextInt();

        System.out.print("Digite a nota do quarto bimestre: ");
        int b4 = scan.nextInt();

        int media = (b1 + b2 + b3 + b4) / 4;

        System.out.println("A média alcançada é de: " + media);
    }
}
