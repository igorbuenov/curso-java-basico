package com.igor.cursojava.aula15.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        /*
        * Faça um programa que leia um número e exiba o dia correspondente da semana. (1 - Domingo, 2- Segunda, etc.)
        * Se digitar outro valor deve aparecer valor inválido.*/

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o dia da semana (1-7): ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia válido!");
                break;
        }
    }
}
