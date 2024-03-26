package com.igor.cursojava.aula34.exercicios.exerc03;

import com.igor.cursojava.aula34.exercicios.exerc02.Calculadora;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        * Escreva um método para calcular factorialde um número usando a Classe Calculadora do exercício anterior
        */

        Scanner scan = new Scanner(System.in);


        int num;

        do {

            System.out.print("Entre com um número positivo: ");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Número inválido, tente novamente!");
                System.out.println();
            }

        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));


    }
}
