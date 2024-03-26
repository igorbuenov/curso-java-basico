package com.igor.cursojava.aula20;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double[][] notasAlunos = new double[30][4];


        for (int i = 0; i < notasAlunos.length; i++) {

            System.out.println(" - Digite as notas do aluno " + (i+1) + " -");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print((j+1) + "º bimestre: ");
                notasAlunos[i][j] = scan.nextDouble();
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++) {

            System.out.println("Notas do aluno " + (i+1));
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println((j+1) + "º bimestre: " + notasAlunos[i][j]);
            }
            System.out.println();

        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;

            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }

            System.out.printf(String.format("Média do aluno %d = %.2f\n", (i+1), (soma/4)));

            if (soma/4 >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
            System.out.println();

        }





    }
}
