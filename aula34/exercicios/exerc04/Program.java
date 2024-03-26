package com.igor.cursojava.aula34.exercicios.exerc04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        * Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo
        *
        *
        * -> 1 metro quadrado = 10.76 pés quadrados
        * -> 1 pé quadrado = 929 centímetros quadrados
        * -> 1 milha quadrada = 640 acres
        * -> 1 acre = 43.560 pés quadrados
        */


        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um número: ");
        double num = scan.nextDouble();


        System.out.println(num + " metro(s) quadrado(s) = " + ConversaoDeUnidadesDeArea.metroParaPesQuadrados(num) + " pés quadrados");
        System.out.println(num + " pé(s) quadrado(s) = " + ConversaoDeUnidadesDeArea.pesQuadradosParaCentimetros (num) + " centímetros quadrados");
        System.out.println(num + " milha(s) quadrado(s) = " + ConversaoDeUnidadesDeArea.milhaParaAcre (num) + " acres");
        System.out.println(num + " acre(s) = " + ConversaoDeUnidadesDeArea.acreParaPesQuadrados (num) + " pés quadrados");


    }
}
