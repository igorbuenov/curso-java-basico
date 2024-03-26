package com.igor.cursojava.aula34.exercicios.exerc01;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {



        /*
        * Escreva uma classe chamada Contador, que tem um atributo estático (static) que é incrementado sempre que a classe for instanciada. Crie métodos para zerar,
        * incrementar e retornar o valor do contador. Desenvolva um programa para testar essa classe
        */

        System.out.println();
        System.out.println("..:: CLASSES INSTANCIADAS = " + Contador.getClasseInstanciada() + " ::..");
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Contador contador4 = new Contador();

        System.out.println("..:: CLASSES INSTANCIADAS = " + Contador.getClasseInstanciada() + " ::..");
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        System.out.println("..:: MÉTODO ZERAR CONTADOR ACIONADO ::..");
        Contador.zerarContador();
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        Contador contador5 = new Contador();

        System.out.println("..:: CLASSES INSTANCIADAS = " + Contador.getClasseInstanciada() + " ::..");
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        System.out.println("..:: MÉTODO INCREMENTAR CONTADOR ACIONADO ::..");
        Contador.incremenarContador();
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        System.out.println("..:: MÉTODO INCREMENTAR CONTADOR ACIONADO ::..");
        Contador.incremenarContador();
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();

        System.out.println("..:: CLASSES INSTANCIADAS = " + Contador.getClasseInstanciada() + " ::..");
        System.out.println("Contador = " + Contador.getContador());
        System.out.println();



    }
}
