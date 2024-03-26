package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {

        /*
        * Altere o programa de calculo fatorial, permitindo ao usuária calcular o fatorial várias vezes
        * e limitando o fatorial a números inteiros positivos e menores que 16
        */

        Scanner scan = new Scanner(System.in);
        int fatorial = 1;
        int num;
        boolean numValido;
        int numOriginal;
        String executarPrograma;

        do {

            do {

                numValido = true;

                System.out.print("Digite um número para calcular o seu fatorial: ");
                num = scan.nextInt();

                if (num % 1 != 0 ) {
                    numValido = false;
                    System.out.println("O número deve ser inteiro!");
                }

                if ( num <= 0) {
                    numValido = false;
                    System.out.println("O número deve ser maior que 0!");
                }

                if (num >= 16) {
                    numValido = false;
                    System.out.println("O número deve ser menor que 16!");
                }

                System.out.println();


            } while(!numValido);


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
