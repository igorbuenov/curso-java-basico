package com.igor.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {


        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int nota : notas) {

            System.out.println("Nota: " + nota);

        }
        System.out.println();

        // OutPut - Matrizes
        double [][] notasAlunos = new double[3][4];

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                notasAlunos[i][j] = random.nextInt(10);
            }

        }

        for (double[] notaAluno : notasAlunos) {
            for (double notaIndividual : notaAluno) {
                System.out.println("Nota individual: " + notaIndividual);
            }
            System.out.println();
        }

    }
}
