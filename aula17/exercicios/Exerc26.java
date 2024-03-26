package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {


        /*
        * Numa eleição existem 3 candidatos. Faça um programa que peça o número total de eleitores.
        * Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
        */

        Scanner scan = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int eleitores;
        int voto;
        boolean votoValido = true;

        System.out.print("Informe a quantidade de eleitores: ");
        eleitores = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= eleitores; i++) {

            do {

                System.out.print("Digite o voto para seu candidato - 1 , 2 ou 3: ");
                voto = scan.nextInt();
                System.out.println();

                if (voto != 1 && voto != 2 && voto != 3) {
                    votoValido = false;
                    System.out.println("Voto inválido, tente novamente!");
                } else {
                    votoValido = true;
                }

            } while(!votoValido);


            if (voto == 1) {
                candidato1++;
            }

            if (voto == 2) {
                candidato2++;
            }

            if (voto == 3) {
                candidato3++;
            }
        }


        System.out.println("Votos para o candidato 1: " + candidato1);
        System.out.println("Votos para o candidato 2: " + candidato2);
        System.out.println("Votos para o candidato 3: " + candidato3);


    }
}
