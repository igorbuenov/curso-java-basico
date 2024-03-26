package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        // Faça um programa que mostre a mensagem "Alo mundo" na tela.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma mensagem: ");
        String mensagem = scan.nextLine();

        System.out.println("Mensagem do dia: " + mensagem);
    }
}
