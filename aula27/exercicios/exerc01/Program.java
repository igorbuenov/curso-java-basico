package com.igor.cursojava.aula27.exercicios.exerc01;


public class Program {
    public static void main(String[] args) {


        /*
        * Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.
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
        bulbo.ascenderLampada();
        bulbo.apagarLampada();
    }
}
