package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {


        /*
        * Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar se a média
        * de idade da turma vária entre 0 e 25 ,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
        * ou idosa, conforme a média calculada.
        */

        Scanner scan = new Scanner(System.in);

        int idade;
        int totalIdade = 0;
        int media;

        System.out.print("Digite a quantidade de pessoas na turma: ");
        int nPessoas = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= nPessoas; i++) {

            System.out.print("Digite a idade do " + i + "º aluno: ");
            idade = scan.nextInt();

            totalIdade += idade;

        }

        media = totalIdade / nPessoas;


        System.out.println();
        System.out.printf(String.format("A média de idade da turma é: %d", media));
        System.out.println();


        if (media > 0 && media <= 25) {
            System.out.println("A turma é jovem!");
        } else if (media >= 26 && media < 60) {
            System.out.println("A turma é adulta!");
        } else {
            System.out.println("A turma é idosa!");
        }




    }
}
