package com.igor.cursojava.aula11;

public class TiposPrimitivos {
    public static void main(String[] args) {


        // Tipos INTEIROS
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Inteiros -> Byte, short, int e long:");
        System.out.println("Valor variavel idade01 = " + idade01);
        System.out.println("Valor variavel idade02 = " + idade02);
        System.out.println("Valor variavel idade03 = " + idade03);
        System.out.println("Valor variavel idade04 = " + idade04);
        System.out.println();

        // Tipos FLUTUANTES
        double valorPassagem = 3.75;
        float valorTomate = 3.95f; // Por conversão da linguagem, se usa F/f no fim da declaração de uma variável do tipo float

        System.out.println("Flutuantes -> Double e float:");
        System.out.println("Valor da passagem = " + valorPassagem);
        System.out.println("Valor do tomate = " + valorTomate);
        System.out.println();

        // Tipos CHAR
        //char o = 'o';
        //char i = 'i';
        char o = 111;
        char i = 105;
        char interrogacao = '\u003F';

        System.out.println("Char:");
        System.out.println("" + o + i + interrogacao);
        System.out.println();

        // Tipos BOOLEAN
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("Boolean:");
        System.out.println("O valor de verdadeiro é = " + verdadeiro);
        System.out.println("O valor de falso é = " + falso);
        System.out.println();
    }
}
