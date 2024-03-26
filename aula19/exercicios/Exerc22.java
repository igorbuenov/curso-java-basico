package com.igor.cursojava.aula19.exercicios;

public class Exerc22 {
    public static void main(String[] args) {


        /*
        * Gerar aleatóriamente um vetor A com 10 elementos inteiros iguais a 0 e 1,
        * sugestão: A[i] = (int) Math.round(Math.round() * 1); Pede-se para implementar um programa que determine
        * o percentual de números 0's e 1's existentes no vetor A
        */

        int[] vetorA = new int[10];
        int num0 = 0;
        int num1 = 0;
        double porcentagem0 = 0;
        double porcentagem1 = 0;


        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (vetorA[i] == 0) {
                num0++;
            }
            if (vetorA[i] == 1) {
                num1++;
            }

            System.out.println(vetorA[i]);


        }
        System.out.println();

        porcentagem0 = (double) num0 / vetorA.length * 100;
        porcentagem1 = (double) num1 / vetorA.length * 100;

        System.out.println("Porcentagem de números 0: " + porcentagem0 + "%.");
        System.out.println("Porcentagem de números 1: " + porcentagem1 + "%.");

    }
}
