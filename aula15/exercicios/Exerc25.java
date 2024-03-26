package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {


        /*
        * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        *
        * Telefonou para a vítima?
        * Esteve no local do crime?
        * Mora perto da vítima?
        * Devia para a vítima?
        * Já trabalhou com a vítima?
        *
        * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
        * Se a pessoa responder positivamente a 2 questões ele deve ser classificada como "Suspeita"
        * Entre 3 a 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

        Scanner scan = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;


        System.out.println("Telefonou para a vítima? ");
        String resposta1 = scan.next();

        System.out.println("Esteve no local do crime? ");
        String resposta2 = scan.next();

        System.out.println("Mora perto da vítima? ");
        String resposta3 = scan.next();

        System.out.println("Devia para a vítima? ");
        String resposta4 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scan.next();


        if (resposta1.equalsIgnoreCase("sim")) {
            positivo++;
        } else {
            negativo++;
        }

        if (resposta2.equalsIgnoreCase("sim")) {
            positivo++;
        } else {
            negativo++;
        }

        if (resposta3.equalsIgnoreCase("sim")) {
            positivo++;
        } else {
            negativo++;
        }

        if (resposta4.equalsIgnoreCase("sim")) {
            positivo++;
        } else {
            negativo++;
        }

        if (resposta5.equalsIgnoreCase("sim")) {
            positivo++;
        } else {
            negativo++;
        }


        System.out.println();
        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
        System.out.println();

        if (positivo == 2) {
            System.out.println("Suspeito");
        } else if (positivo == 3  || positivo == 4) {
            System.out.println("Cúmplice");
        } else if (positivo == 5){
            System.out.println("Culpado!");
        } else {
            System.out.println("Inocente!");
        }


    }
}
