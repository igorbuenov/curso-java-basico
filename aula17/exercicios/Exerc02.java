package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {


        /*
        * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
        * mostrando uma mensagem de erro e voltando a pedir informações
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite a senha: ");
        String senha = scan.next();

        int tentativas = 0;

        while (senha.equalsIgnoreCase(nome)) {

            System.out.println("Erro! A senha não pode ser mesma que o nome!");

            System.out.println();
            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            System.out.println("Digite a senha: ");
            senha = scan.next();

            tentativas++;

        }

        System.out.println("Cadastro confirmado!");
    }
}
