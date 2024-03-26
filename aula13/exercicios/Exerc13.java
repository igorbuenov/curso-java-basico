package com.igor.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        // Tendo como dados de entrada a altura e sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal,
        // utilizando as seguintes fórmulas:
        // A. Homens -> (72.7 * altura) - 58; Mulheres -> (62.1 * altura) - 44.7
        // B. Peça o peso da pessoa e informe se ele está dentro, acima ou abaixo do peso;

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Digite o sexo (M ou F): ");
        char sexo = scan.next().charAt(0);

        if (sexo != 'M' || sexo != 'm' || sexo != 'F' || sexo != 'f') {

            System.out.println("Você digitou o sexo errado!");

        } else {

            System.out.print("Digite o seu peso: ");
            double peso = scan.nextDouble();
            System.out.println();

            double pesoIdeal = calculoPesoIdeal(altura, sexo);

            System.out.println(String.format("Peso ideal: %.2f", pesoIdeal));

            if (peso > pesoIdeal) {
                System.out.println("Você está acima do peso!");
            } else if (peso < pesoIdeal) {
                System.out.println("Você está abaixo do peso!");
            } else {
                System.out.println("Vcoê está com peso ideal");
            }

        }



    }

    public static double calculoPesoIdeal(double altura, char sexo) {

        double peso = 0;

        if (sexo == 'M' || sexo == 'm') {
            peso = (72.7 * altura) - 58;
            return peso;
        }

        return (62.1 * altura) - 44.7;
    }
}
