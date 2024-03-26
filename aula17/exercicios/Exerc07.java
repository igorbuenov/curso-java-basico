package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        /*
        * Faça um programa que leia 5 números e informe qual é o maior
        */

        Scanner scan = new Scanner(System.in);
        boolean numeroEncontrado = false;


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

            if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {

                System.out.println("O maior número é: " + n1);
                numeroEncontrado = true;

            } else if ( n2 > n3 && n2 > n4 && n2 > n5 && n2 > n1 ) {

                System.out.println("O maior número é: " + n2);
                numeroEncontrado = true;

            } else if ( n3 > n4 && n3 > n5 && n3 > n1 && n3 > n2 ) {

                System.out.println("O maior número é: " + n3);
                numeroEncontrado = true;

            } else if ( n4 > n5 && n4 > n1 && n4 > n2 && n4 > n3 ) {

                System.out.println("O maior número é: " + n4);
                numeroEncontrado = true;

            } else if (n5 > n1 && n5 > n2 && n4 > n3 && n5 > n4){

                System.out.println("O maior número é: " + n5);
                numeroEncontrado = true;

            } else {

                System.out.println("Todos os números são iguais");
                System.out.println();

            }


        } while(!numeroEncontrado);


    }
}
