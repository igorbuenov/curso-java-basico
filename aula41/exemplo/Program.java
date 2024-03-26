package com.igor.cursojava.aula41.exemplo;

public class Program {
    public static void main(String[] args) {



        Pessoa aluno = new Aluno ();
        Pessoa professor = new Professor ();

        aluno.setEndereco ("Rua 2, num 2");
        professor.setEndereco ("Rua 3, num 3");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
