package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        /*
        * Altere o programa anterior para mostrar no final a soma dos números
        */

        Scanner scan = new Scanner(System.in);

        String executarPrograma;
        double n1, n2;
        double soma = 0;


        do {

            System.out.print("Informe o 1º número: ");
            n1 = scan.nextDouble();
            System.out.print("Informe o 2º número: ");
            n2 = scan.nextDouble();
            System.out.println();


            if (n1 == n2 ) {

                System.out.println("Os números são iguais!");

            } else if (n1 > n2) {

                while( n2 < n1) {

                    if ( n2 % 1 == 0) {
                        System.out.println("Número: " + (int) n2);
                    }

                    soma += n2;
                    n2++;

                }

                System.out.println();
                System.out.println("A soma dos números é: " + (int) soma);

            } else {

                while( n1 < n2) {

                    if ( n1 % 1 == 0) {
                        System.out.println("Número: " + (int) n1);
                    }

                    soma += n1;
                    n1++;

                }

                System.out.println();
                System.out.println("A soma dos números é: " + (int) soma);

            }

            System.out.println();
            System.out.print("Deseja executar o programa novamente s/n? ");
            executarPrograma = scan.next();


        } while (executarPrograma.equalsIgnoreCase("s"));

    }
}
