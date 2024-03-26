package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc08exemplo2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int media;
        int num;


        for (int i = 1; i <= 5 ; i++) {


            System.out.print("Digite um número: ");
            num = scan.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A mpedia dos números é: " + media);
    }
}
