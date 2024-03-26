package com.igor.cursojava.aula19;

import java.util.Date;
import java.util.Scanner;

public class ArraysVetores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double[] temperaturas = new double[365];

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite a temperatura do dia " + i + ": ");
            temperaturas[i-1] = scan.nextDouble();


        }
        System.out.println();

        System.out.println("Tamanho do Array/Vetor : " + temperaturas.length);
        System.out.println();

        System.out.println("Valores do Array/Vetor : ");
        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] == 0) {
                break;
            }
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);

        }
        System.out.println();

        for (double temperatura : temperaturas) {

            if (temperatura == 0) {
                break;
            }
            System.out.println("A temperatura do dia é: " + temperatura);

        }
    }
}
