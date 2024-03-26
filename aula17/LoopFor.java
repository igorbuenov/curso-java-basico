package com.igor.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            System.out.println("Tabuada de " + i + ": ");
            System.out.println();

            for (int j = 1; j <= 10; j++) {

                System.out.println( i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
