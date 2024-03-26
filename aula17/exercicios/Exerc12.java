package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {


        /*
        * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro de 1 a 10
        * O usuário deve informar de qual número ele deseja ver a tabuada
        */

        Scanner scan = new Scanner(System.in);
        String executarPrograma;

        do {

            System.out.print("Informe o número que você deseja ver a tabuada: ");
            int tabuada = scan.nextInt();
            System.out.println();


            if (tabuada > 10){

                System.out.println("Informe um número entre 1 e 10!");

            } else {

                System.out.println("Tabuada do número " + tabuada);
                System.out.println();

                for (int i = 1; i <= 10 ; i++) {

                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

                }

            }




            System.out.println();
            System.out.print("Deseja executar o programa novamente s/n ? ");
            executarPrograma = scan.next();
            System.out.println();

        } while (executarPrograma.equalsIgnoreCase("s"));


    }
}
