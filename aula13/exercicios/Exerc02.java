package com.igor.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        // Faça um programa que peça um número e então mostre a mensagem "O número informado foi [numero]".

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        System.out.println("O número informado foi " + numero);
    }
}
