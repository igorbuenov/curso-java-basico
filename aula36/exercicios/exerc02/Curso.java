package com.igor.cursojava.aula36.exercicios.exerc02;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterInfo() {

        String info = "Nome do curso: " + nome + "\n";

        if (professor != null) {
            info += professor.toString();
        }

        if (alunos != null) {

            info += "\n.:: Alunos ::..\n";

            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }

            info += "\nMédia da turma: " + obterMediaTurma();

        }

        return info;
    }

    public double obterMediaTurma() {

        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }

        return soma / alunos.length;
    }
}
