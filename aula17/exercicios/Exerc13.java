package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado
        * ao segundo número. Não utilize a função de potência da linguagem.
        */

        Scanner scan = new Scanner(System.in);
        String executarPrograma;
        int base, expoente;

        do {

            int calculo = 1;

            System.out.print("Informe o valor da base: ");
            base = scan.nextInt();
            System.out.print("Informe o valor do expoente: ");
            expoente = scan.nextInt();
            System.out.println();

            for (int i = 0; i < expoente; i++) {

                calculo *= base;

            }

            System.out.println("O calculo de " + base + " elevado a " + expoente + " = " + calculo);

            System.out.println();
            System.out.println("Deseja executar o programa novamente s/n?");
            executarPrograma = scan.next();
            System.out.println();

        } while(executarPrograma.equalsIgnoreCase("s"));


    }
}
