package com.igor.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {


        /*
        * Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores
        * "Nota1 e Nota2" do tipo real(double). Escreva um programa que calcule a média aritmética simples das notas
        * informadas armazenando o resultado em um vetor "Result" de mesmo tipo e tamanho. Ao mostrar os resultados
        * exibir a situação de cada aluno. Se a média calculada for superior a 7 o aluno estará aprovado, caso
        * contrario, a situação do aluno será reprovado.
        */

        Scanner scan = new Scanner(System.in);

        int[] alunos = new int[10];
        double[] notas1 = new double[alunos.length];
        double[] notas2 = new double[alunos.length];
        double[] result = new double[alunos.length];


        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite as notas do aluno " + (i+1));

            System.out.print("Nota 1º bimestre: ");
            notas1[i] = scan.nextDouble();
            System.out.print("Nota 2º bimestre: ");
            notas2[i] = scan.nextDouble();
            System.out.println();

            // CALCULO DE MEDIA PARA CADA ALUNO
            result[i] = (notas1[i] + notas2[i]) / 2;

        }
        System.out.println();


        // VALIDAÇÃO DE MÉDIA
        for (int i = 0; i < result.length; i++) {

            System.out.println("Média do aluno(a) " + (i+1) + ": " + result[i]);
            if (result[i] >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
            System.out.println();


        }



    }
}
