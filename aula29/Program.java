package com.igor.cursojava.aula29;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = scan.next();
        System.out.print("Modelo: ");
        String modelo = scan.next();
        System.out.print("Capacidade de passageiros: ");
        int numPassageiros = scan.nextInt();
        System.out.print("Capacidade de combustível: ");
        double capCombustivel = scan.nextDouble();
        System.out.print("Consumo de combustível: ");
        double consumoCombustivel = scan.nextDouble();

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 5);

        Carro van2 = new Carro(marca, modelo, numPassageiros, capCombustivel, consumoCombustivel);

    }
}
