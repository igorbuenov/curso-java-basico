package com.igor.cursojava.aula24;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);

    }
}
