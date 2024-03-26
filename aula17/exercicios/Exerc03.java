package com.igor.cursojava.aula17.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {


        /*Faça um programa que leia e valide as seguintes informações:
        * A. Nome: maior que 3 caracteres
        * B. Idade: entre 0 e 150
        * C. Salário: maior que zero
        * D. Sexo: f ou m
        * E. Estado civil: s, c, v ou d;
        */

        Scanner scan = new Scanner(System.in);

        int tentativa = 0;

        System.out.print("Digite o nome: ");
        String nome = scan.next();
        System.out.println();

        while (nome.trim().length() <= 3) {

            System.out.println("O nome deve conter mais que três caracteres!");
            System.out.print("Digite novamente: ");
            nome = scan.next();
            tentativa++;
            System.out.println();

        }

        System.out.print("Digite a idade: ");
        int idade = scan.nextInt();
        System.out.println();

        while (idade < 0 || idade > 150) {

            System.out.println("Erro! Digite uma idade entre 0 e 150.");
            System.out.print("Digite a idade novamente: ");
            idade = scan.nextInt();
            tentativa++;
            System.out.println();

        }

        System.out.print("Digite o salário: ");
        double salario = scan.nextDouble();
        System.out.println();

        while (salario < 0) {

            System.out.println("Erro! O salário deve ser maior que 0!");
            System.out.print("Digite o salário novamente: ");
            salario = scan.nextInt();
            tentativa++;
            System.out.println();

        }

        System.out.print("Digite o sexo (F ou M): ");
        String sexo = scan.next();
        System.out.println();

        while (!Objects.equals(sexo, "f") && !Objects.equals(sexo, "F") && !Objects.equals(sexo, "m") && !Objects.equals(sexo, "M")) {

            System.out.println("Erro! Sexo inválido!");
            System.out.print("Digite o sexo novamente (f ou m): ");
            sexo = scan.next();
            tentativa++;
            System.out.println();

        }

        System.out.print("Digite o estado civil (S - C - V ou D): ");
        String estadoCivil = scan.next();
        System.out.println();

        while (!Objects.equals(estadoCivil, "s") &&
                !Objects.equals(estadoCivil, "S") &&
                !Objects.equals(estadoCivil, "c") &&
                !Objects.equals(estadoCivil, "C") &&
                !Objects.equals(estadoCivil, "v") &&
                !Objects.equals(estadoCivil, "V") &&
                !Objects.equals(estadoCivil, "d") &&
                !Objects.equals(estadoCivil, "D")) {

            System.out.println("Erro! Estado civil inválido!");
            System.out.print("Digite novamente (s - c - v ou d): ");
            estadoCivil = scan.next();
            tentativa++;
            System.out.println();

        }






    }
}
