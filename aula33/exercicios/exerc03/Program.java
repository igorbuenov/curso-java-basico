package com.igor.cursojava.aula33.exercicios.exerc03;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.setNome(scan.nextLine());

        System.out.print("Curso: ");
        aluno.setCurso(scan.nextLine());

        System.out.print("Matrícula do aluno: ");
        aluno.setMatricula(scan.nextLine());
        System.out.println();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {

            System.out.print("Informe a " + (i+1) + "ª disciplina matrículada: ");
            aluno.setDisciplinaPosicao(i, scan.nextLine());

        }
        System.out.println();

        for (int i = 0; i < aluno.getNotas().length; i++) {

            System.out.println("Informe as notas da disciplina " + aluno.getDisciplinas()[i] + ": ");
            for (int j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.print((j+1) + "ª nota: ");
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
            System.out.println();

        }
        System.out.println();

        aluno.dadosAluno();

        for (int i = 0; i < aluno.getNotas().length; i++) {

            if (aluno.aprovado(i)) {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - APROVADO");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - REPROVADO");
            }

        }


    }
}
