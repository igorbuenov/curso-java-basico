package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        /*
        * Faça um programa que pergunte em que turno você estuda. Peça para digitar M - matutino
        * V -  vespertino ou N - noturno. Imprima a mensagem "Bom dia", "Boa tarde" ou "Boa noite"
        * ou "Valor inválido", conforme o caso.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe em qual turno você estuda");
        System.out.print("M - matutino, V - vespertino ou N - noturno: ");
        char turno = scan.next().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia!");
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa tarde!");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
