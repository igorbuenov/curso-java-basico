package com.igor.cursojava.aula24.exercicios.exerc01;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {


        /*
        * Escreva uma classe para representar uma lâmpada que está à venda em um super mercado
        */


        Lampada bulbo = new Lampada();

        bulbo.marca = "Avant";
        bulbo.tipoLuz = "LED";
        bulbo.potencia = 20;
        bulbo.base = "E27";
        bulbo.voltagem = 200;
        bulbo.fabricante = "AVANT";

        System.out.println(bulbo.marca);
        System.out.println(bulbo.tipoLuz);
        System.out.println(bulbo.potencia);
        System.out.println(bulbo.base);
        System.out.println(bulbo.voltagem);
        System.out.println(bulbo.fabricante);
    }
}
