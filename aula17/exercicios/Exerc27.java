package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {


        /*
        * Faça um programa que calcule o número médio de alunos por turma. Para isso, peça a quantidade de alunos
        * para cada turma. As turmas não podem ter mais que 40 alunos.
        */

        Scanner scan = new Scanner(System.in);

        int media;
        int qtdTurmas;
        int qtdAlunos;
        int totalAlunos = 0;
        boolean qtdPermitida;

        System.out.print("Digite a quantidade de turma: ");
        qtdTurmas = scan.nextInt();
        System.out.println();


        for (int i = 1; i <= qtdTurmas; i++) {

            do {

                System.out.print("Digite a quantidade de alunos para a turma " + i + ": ");
                qtdAlunos = scan.nextInt();

                if (qtdAlunos > 40) {
                    System.out.println("Limite excedido! É permitido apenas 40 alunos por turma.");
                    System.out.println();
                    qtdPermitida = false;

                } else {

                    qtdPermitida = true;

                }


            } while (!qtdPermitida);

            totalAlunos += qtdAlunos;

        }

        media = totalAlunos / qtdTurmas;

        System.out.println();
        System.out.println("A média de alunos por turma é de: " + media);


    }
}
