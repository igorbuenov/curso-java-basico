package com.igor.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {

        /*
        * Faça um programa que verifique se uma letra digitada é "F" ou "M".
        * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo inválido.
        * */


        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o sexo, F - feminino ou M - masculino: ");
        char sexo = scan.next().charAt(0);

        if (sexo == 'F' || sexo == 'f') {
            System.out.println(sexo + " - Feminino");
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println(sexo + " - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
