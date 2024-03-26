package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc02exemplo2 {
    public static void main(String[] args) {

        /*
         * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
         * mostrando uma mensagem de erro e voltando a pedir informações
         */

        Scanner scan = new Scanner(System.in);

        boolean acessoPermitido = false;

        do {

            System.out.println("Digite o seu nome: ");
            String nome = scan.next();

            System.out.println("Digite a senha: ");
            String senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("A senha não pode ser igual ao nome! Tente novamente!\n");
            } else {
                acessoPermitido = true;
            }


        } while (!acessoPermitido);

        System.out.println("Cadastro realizado com sucesso!");
    }
}
