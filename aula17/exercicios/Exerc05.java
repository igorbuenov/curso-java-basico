package com.igor.cursojava.aula17.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        /*
        * Altere o programa anterior permitindo ao o usuário informar as populações e as taxas de crescimento iniciais.
        * Valide a entrada e permita repetir a operação
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        String executarPesquisa;

        int anos = 0;

        do {

            // ENTRADA DE DADOS
            System.out.println();
            System.out.print("Informe o tamanho da população A: ");
            int paisA = scan.nextInt();
            System.out.print("Informe o tamanho da população B: ");
            int paisB = scan.nextInt();

            // VALIDAÇÃO
            if (paisA >= paisB) {

                System.out.println("A população do país A já é maior ou igual ao país B: ");
                System.out.println();
                System.out.println("População país A: " + paisA);
                System.out.println("População país B: " + paisB);

            } else {

                System.out.println();
                System.out.print("Informe o percentual de crescimento do país A: ");
                double percentualA = scan.nextDouble();
                System.out.print("Informe o percentual de crescimento do país B: ");
                double percentualB = scan.nextDouble();
                System.out.println();

                do {

                    double percentualCrescimentoA = (paisA / 100) * percentualA;
                    double percentualCrescimentoB = (paisB / 100) * percentualB;

                    paisA += percentualCrescimentoA;
                    paisB += percentualCrescimentoB;

                    anos++;

                } while( paisA < paisB );

                System.out.printf("O país A alcançou e/ou ultrapassou em tamanho de população o país B em %d anos.", anos);
                System.out.println();
                System.out.println("População do páis A: " + paisA + " habitantes");
                System.out.println("População do páis B: " + paisB + " habitantes");

            }

            System.out.println();
            System.out.print("Deseja executar a pesquisa novamente (s ou n)? ");
            executarPesquisa = scan.next();

        } while (executarPesquisa.equalsIgnoreCase("s"));



    }
}
