package com.igor.cursojava.aula17.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc03exemplo2 {
    public static void main(String[] args) {

        /*Faça um programa que leia e valide as seguintes informações:
         * A. Nome: maior que 3 caracteres
         * B. Idade: entre 0 e 150
         * C. Salário: maior que zero
         * D. Sexo: f ou m
         * E. Estado civil: s, c, v ou d;
         */

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        boolean dadosValidos = false;
        ArrayList<String> Erros = new ArrayList<>();

        do {

            System.out.print("Digite o nome: ");
            nome = scan.next();

            System.out.print("Digite a idade: ");
            idade = scan.nextInt();

            System.out.print("Digite o salário: ");
            salario = scan.nextDouble();

            System.out.print("Digite o sexo (F ou M): ");
            sexo = scan.next();

            System.out.print("Digite o estado civil (S - C - V ou D): ");
            estadoCivil = scan.next();

            System.out.println();


            if (nome.trim().length() <= 3) {

                Erros.add("O nome deve conter mais que três caracteres!");

            }

            if (idade <= 0 || idade > 150) {

                Erros.add("Digite uma idade entre 0 e 150.");

            }

            if (salario < 0) {

                Erros.add("O salário deve ser maior que 0!");

            }

            if (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {

                Erros.add("Sexo inválido!");

            }

            if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {

                Erros.add("Estado civil inválido!");

            }

            if (!Erros.isEmpty()) {

                System.out.println("Erros: " + Erros.size());
                for (String Erro : Erros) {
                    System.out.println(Erro);
                };
                System.out.println();

                // Excluíndo erros após tentativas
                Erros.clear();

            } else {

                dadosValidos = true;

            }


        } while(!dadosValidos);

        System.out.println();
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();

        // SAÍDA DE DADOS
        System.out.println("Nome: " + nome);
        System.out.printf("Idade: %d anos.\n", idade);
        System.out.printf("Salário: R$ %.2f\n", salario);

        if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo: Masculino.");
        }

        if (estadoCivil.equalsIgnoreCase("c")) {
            System.out.println("Estado civil: Casado.");
        } else if (estadoCivil.equalsIgnoreCase("s")) {
            System.out.println("Estado civil: Solteiro.");
        } else if (estadoCivil.equalsIgnoreCase("v")) {
            System.out.println("Estado civil: Viúvo.");
        } else {
            System.out.println("Estado civil: Divorciado.");
        }

    }
}
