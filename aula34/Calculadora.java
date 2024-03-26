package com.igor.cursojava.aula34;

public class Calculadora {

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static int soma(int[] vetorInteiros) {

        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {

            total += vetorInteiros[i];

        }

        return total;
    }
}
