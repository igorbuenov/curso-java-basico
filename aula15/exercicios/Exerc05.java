package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        /*
        * Faça um programa para a leitura de duas notas parciais de um aluno.
        * O programa deve calcular a média alcançada por aluno e apresentar:
        * A mensagem "Aprovado", se a média alcançada for maior ou igual a 7
        * A mensagem "Reprovado", se a média for menor que 7
        * A mensagem "Aprovado com distinção", se a média for igual a 10.
        * */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
