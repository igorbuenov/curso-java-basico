package com.igor.cursojava.aula50;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        System.out.print("Entre com um número decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Você digitou " + num);

        } catch (java.lang.Exception e) {

            System.out.println("Entrada inválida!");
            e.printStackTrace();
        }


    }

    public static double lerNumero() throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        return num;
    }
}
