package com.igor.cursojava.aula36.exercicios.exerc02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // ENTRADA DE DADOS PARA O CURSO
        System.out.print("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.print("Entre com o horario do curso: ");
        String horario = scan.nextLine();

        System.out.print("Entre com o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.print("Entre com  o departamento: ");
        String dep = scan.nextLine();

        System.out.print("Entre com  o e-mail: ");
        String email = scan.nextLine();

        // INSTANCIANDO DADOS DOS OBJETOS CURSO - PROFESSOR - ALUNO
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        // PROFESSOR
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(dep);
        professor.setEmail(email);

        curso.setProfessor(professor);

        // ALUNOS
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            scan.nextLine();

            System.out.print("Entre com o nome do aluno " + (i+1) + ": ");
            String nomeAluno = scan.nextLine();

            System.out.print("Entre com a matrícula do aluno " + (i+1) + ": ");
            String matriculaAluno = scan.nextLine();
            System.out.println();

            double[] notas = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.print("Entre com a nota " + (j+1) + ": ");
                notas[j] = scan.nextDouble();

            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
            System.out.println();


        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());









    }
}
