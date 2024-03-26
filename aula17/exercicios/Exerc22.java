package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args) {


        /*
        * Altere o programa de números primos, informando, caso o número não seja primo, por quais
        * números ele é divisível
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                System.out.println("Não é um número primo. Divisível por " + i);
                primo = false;

            }
        }

        if (primo) {
            System.out.println(num + " é um número primo.");
        }

    }
}
