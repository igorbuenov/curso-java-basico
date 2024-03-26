package com.igor.cursojava.aula27.exercicios.exerc03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        /*
        * Escreva uma classe para representar um Aluno. Adicione atributos relaxionados às características de um Aluno, como nome, matricula, curso que
        * esta matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado
        * (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao
        * final informe o nome das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.
        */


        Scanner scan = new Scanner(System.in);


        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = scan.nextLine();

        System.out.print("Curso: ");
        aluno.curso = scan.nextLine();

        System.out.print("Matrícula do aluno: ");
        aluno.matricula = scan.nextLine();
        System.out.println();

        for (int i = 0; i < aluno.disciplinas.length; i++) {

            System.out.print("Informe a " + (i+1) + "ª disciplina matrículada: ");
            aluno.disciplinas[i] = scan.nextLine();

        }
        System.out.println();

        for (int i = 0; i < aluno.disciplinas.length; i++) {

            System.out.println("Informe as notas da disciplina " + aluno.disciplinas[i] + ": ");
            for (int j = 0; j < aluno.notas[i].length; j++) {
                System.out.print((j+1) + "ª nota: ");
                aluno.notas[i][j] = scan.nextDouble();
            }
            System.out.println();

        }
        System.out.println();

        aluno.dadosAluno();

        for (int i = 0; i < aluno.notas.length; i++) {

            if (aluno.aprovado(i)) {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - APROVADO");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - REPROVADO");
            }

        }


    }
}
