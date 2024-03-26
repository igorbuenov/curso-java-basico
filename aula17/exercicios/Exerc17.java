package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {


        /*
        * Faça um número que calcule o fatorial de um número inteiro fornecido pelo usuário
        * Ex: 5! = 5.4.3.2.1 = 120
        */

        Scanner scan = new Scanner(System.in);
        int fatorial = 1;
        int numOriginal;
        String executarPrograma;

        do {

            System.out.print("Digite um número para calcular o seu fatorial: ");
            int num = scan.nextInt();
            numOriginal = num;

            System.out.print(numOriginal + "! = " + numOriginal);

            while (num > 1) {

                fatorial *= num;
                num--;

                System.out.print(" * " + num);

            }

            System.out.println(" = " + fatorial);

            System.out.println();
            System.out.print("Deseja executar o programa novamente s/n? ");
            executarPrograma = scan.next();
            System.out.println();

            fatorial = 1;

        } while (executarPrograma.equalsIgnoreCase("s"));



    }
}
