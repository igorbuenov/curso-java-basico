package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {

        /*
        * Faça um programa que verifique se uma letra digitada é vogal ou consoante.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        if (letra == 'a' || letra == 'A' ||
                letra == 'e' || letra == 'E' ||
                letra == 'i' || letra == 'I' ||
                letra == 'o' || letra == 'O' ||
                letra == 'u' || letra == 'U'
        ) {
            System.out.println(" A letra digitada é uma vogal");
        } else {
            System.out.println("A letra digitada é uma consoante");
        }
    }
}
