package com.igor.cursojava.aula34.exercicios.exerc05;

import com.igor.cursojava.aula34.exercicios.exerc04.ConversaoDeUnidadesDeArea;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        * Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para conversãodas unidades de volume segundo a lista abaixo
        *
        * -> 1 litro = 1000 centímetros cúbicos
        * -> 1 metro cúbico = 1000 litros
        * -> 1 metro cúbico = 35.32 pés cúbicos
        * -> 1 galão americano = 231 polegadas cúbicas
        * -> 1 galão americano = 3.785 litros
        */

        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um número: ");
        double num = scan.nextDouble();

        System.out.println(num + " litro(s) = " + ConversaoDeUnidadesDeVolume.litroParaCMcubicos (num) + " centímetros cúbicos");
        System.out.println(num + " metro(s) cúbico(s) = " + ConversaoDeUnidadesDeVolume.metrosCubicosParaLitros (num) + " litros");
        System.out.println(num + " metro(s) cúbico(s) = " + ConversaoDeUnidadesDeVolume.metrosCubicosParaPesCubicos (num) + " pés cúbicos");
        System.out.println(num + " galão(es) americano(s) = " + ConversaoDeUnidadesDeVolume.galoesParaPolegadas (num) + " polegadas cúbicas");
        System.out.println(num + " galão(es) americano(s) = " + ConversaoDeUnidadesDeVolume.galoesParalitros (num) + " litros");


    }
}
