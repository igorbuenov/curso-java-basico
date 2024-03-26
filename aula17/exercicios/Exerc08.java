package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {


        /*
        * Faça um programa que leia 5 números e informe a soma e a media dos números
        */

        String executarPrograma;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.print("Informe o 1º número: ");
            int n1 = scan.nextInt();
            System.out.print("Informe o 2º número: ");
            int n2 = scan.nextInt();
            System.out.print("Informe o 3º número: ");
            int n3 = scan.nextInt();
            System.out.print("Informe o 4º número: ");
            int n4 = scan.nextInt();
            System.out.print("Informe o 5º número: ");
            int n5 = scan.nextInt();
            System.out.println();

            int soma = n1 + n2 + n3 + n4 + n5;
            int media = (n1 + n2 + n3 + n4 + n5) / 5;

            System.out.println("A soma dos números é: " + soma);
            System.out.println("A média dos números é: " + media);
            System.out.println();

            System.out.print("Deseja executar o programa novamente s/n?");
            executarPrograma = scan.next();
            System.out.println();


        } while(executarPrograma.equalsIgnoreCase("s"));

    }
}
