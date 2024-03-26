package com.igor.cursojava.aula26;

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

        double autonomia = van.obterAutonomia();

        System.out.println("A autonomia do carro é: " + autonomia);
    }
}
