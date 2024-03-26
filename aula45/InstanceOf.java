package com.igor.cursojava.aula45;

import com.igor.cursojava.aula39e40.exemplo.Aluno;
import com.igor.cursojava.aula39e40.exemplo.Pessoa;
import com.igor.cursojava.aula39e40.exemplo.Professor;

public class InstanceOf {
    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor ();


        if (pessoa instanceof Pessoa) {
            System.out.println ("é do tipo Pessoa");
        }

        if (aluno instanceof Aluno) {
            System.out.println ("é do tipo Aluno");
        }

        if (professor instanceof Professor) {
            System.out.println ("é do tipo Professor");
        }


    }
}
