package com.igor.cursojava.aula34.exercicios.exerc06;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        /*
        *
        * Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão aproximada das unidades de velocidade segundo a lista abaixo
        *
        * -> 1 minuto = 60 segundos
        * -> 1 hora = 60 minutos
        * -> 1 dia = 24 horas
        * -> 1 semana = 7 dias
        * -> 1 mês = 30 dias
        * -> 1 ano = 365.25 dias
        */

        Scanner scan = new Scanner (System.in);

        System.out.print("Digite um número: ");
        double num = scan.nextDouble();

        System.out.println ();
        System.out.printf("%.0f minuto(s) = %.0f segundos\n", num, ConversaoDeUnidadesDeTempo.minutoParaSegundos (num));
        System.out.printf("%.0f hora(s) = %.0f minutos\n", num, ConversaoDeUnidadesDeTempo.horaParaMinutos (num));
        System.out.printf("%.0f dia(s) = = %.0f horas\n", num, ConversaoDeUnidadesDeTempo.diaParaHoras (num));
        System.out.printf("%.0f semana(s) = %.0f dias\n", num, ConversaoDeUnidadesDeTempo.semanaParaDias (num));
        System.out.printf("%.0f mês(es) = %.0f dias\n", num,ConversaoDeUnidadesDeTempo.mesParaDias (num));
        System.out.printf("%.0f ano(s) = %.2f dias", num, ConversaoDeUnidadesDeTempo.anoParaDias (num));

    }
}
