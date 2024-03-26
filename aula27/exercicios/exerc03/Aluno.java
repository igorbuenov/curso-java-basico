package com.igor.cursojava.aula27.exercicios.exerc03;

public class Aluno {

    String nome;
    String matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notas = new double[disciplinas.length][4];



    public boolean aprovado(int indice) {

        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++) {

            soma += notas[indice][i];

        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        }

        return false;

    }

    void dadosAluno() {

        System.out.println(
                "Nome: " + nome + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Curso: " + curso + "\n" +
                "Disciplinas: \n");

                for (String disciplina : disciplinas) {
                    System.out.println(disciplina);

                }
                System.out.println();

                for (int i = 0; i < notas.length; i++) {
                    System.out.println("Notas da disciplina " + disciplinas[i]);
                    for (int j = 0; j < notas[i].length; j++) {
                        System.out.println((j+1) + "ª nota: " + notas[i][j]);

                    }
                    System.out.println();

                }


    }

}
