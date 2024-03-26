package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {


        /*
        * Faça um programa que lê as duas notas parciais obtidas por um aluno
        * numa disciplina ao longo de um semestre, e calcule a sua média. A
        * atribuição de conceitos obedece à tabela abaixo
        *
        * Média de aproveitamento      Conceito
        * Entre 9.0 e 10.0             A
        * Entre 7.5 e 9.0              B
        * Entre 6.0 e 7.5              C
        * Entre 4.0 e 6.0              D
        * Entre 4.0 e 0                E
        *
        * O algoritmo deve mostrar na tela as notas, a média, o conceito
        * correspondente e a mensagem "APROVADO" se o conceito for A, B ou C
        * ou "REPROVADO" se o conceito for D ou E.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println();

        String conceito = null;
        String status = null;

        // CALCULO
        double media = (nota1 + nota2) / 2;

        if (media >= 9.0 && media <= 10.0) {

            conceito = "A";


        } else if (media >= 7.5 && media < 9.0) {

            conceito = "B";


        } else if (media >= 6.0 && media < 7.5) {

            conceito = "C";


        } else if (media >= 4.0 && media < 6.0) {

            conceito = "D";


        } else {

            conceito = "E";

        }

        if (conceito.equalsIgnoreCase("a") || conceito.equalsIgnoreCase("b") || conceito.equalsIgnoreCase("c")) {
            status = "APROVADO";
        } else {
            status = "REPROVADO";
        }

        System.out.println("Nota 1 = " + nota1);
        System.out.println("Nota 2 = " + nota2);
        System.out.println("Media de aproveitamneto = " + media);
        System.out.println("Conceito = " +  conceito);
        System.out.println("Status = " + status);
    }
}
