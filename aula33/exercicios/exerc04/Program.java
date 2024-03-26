package com.igor.cursojava.aula33.exercicios.exerc04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String executarPrograma;

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        boolean ganhou = false;
        char sinal;
        int linha = 0;
        int coluna = 0;



        do {

            System.out.println ();
            System.out.println("..:: JOGO da VELHA::..");
            System.out.println();
            System.out.println("Jogador 1 = X");
            System.out.println("Jogador 2 = O");
            System.out.println();


            while(!ganhou) {

                if (jogoDaVelha.vezJogador1()) {

                    System.out.println("Vez do jogador 1 - Escolha linha e coluna ( 1 - 3 )");
                    sinal = 'X';

                } else {

                    System.out.println("Vez do jogador 2 - Escolha linha e coluna ( 1 - 3 )");
                    sinal = 'O';

                }

                linha = valor("Linha", scan);
                coluna = valor("Coluna", scan);
                System.out.println();

                if (!jogoDaVelha.validarJogada (linha, coluna, sinal)){
                    System.out.println("Posição já escolhida, tente novamente!\n");
                }


                jogoDaVelha.imprimirTabuleiro();
                System.out.println();

                if (jogoDaVelha.verificarGanhador('X')) {
                    ganhou = true;
                    System.out.println("Parabéns, jogador 1 ganhou!");
                } else if (jogoDaVelha.verificarGanhador('O')) {
                    ganhou = true;
                    System.out.println("Parabéns, jogador 2 ganhou!");
                } else if (jogoDaVelha.getJogada() > 9) {
                    ganhou = true;
                    System.out.println("A partida terminou em empate!");
                }


            }
            System.out.println();


            System.out.print("Deseja jogar novamente s/n: ");
            executarPrograma = scan.next();

            if (executarPrograma.equalsIgnoreCase("s")) {
                ganhou = false;
            }

        } while (executarPrograma.equalsIgnoreCase("s"));

    }

    // HELPERS
    public static int valor(String tipoValor, Scanner scan) {

        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {

            System.out.print("Entre com a " + tipoValor + " 1, 2 ou 3: ");
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3) {

                valorValido = true;

            } else {

                System.out.println("Entrada inválida! Tente novamente.");

            }
        }
        valor--;
        return valor;
    }

}
