package com.igor.cursojava.aula35.exercicios.exerc01;

public class Calculadora {

    public static int fibonacci(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonacci (num - 1) + fibonacci (num - 2);

    }
}
