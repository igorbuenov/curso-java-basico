package com.igor.cursojava.aula33.exercicios.exerc03;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[disciplinas.length][4];
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        disciplinas = new String[3];
        notas = new double[disciplinas.length][4];
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

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

    public void setDisciplinaPosicao(int pos, String nomeDsisciplina) {

        this.disciplinas[pos] = nomeDsisciplina;

    }

    public void setNotaPosIJ(int posI, int posJ, double nota) {
        this.notas[posI][posJ] = nota;
    }

    public void dadosAluno() {

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
