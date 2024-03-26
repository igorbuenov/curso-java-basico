package com.igor.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {


        /*
         * Faça um programa para jogar jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha,
         * usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça('O' ou 'X'
         * O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi o vencedor(jogador 1 ou jogador 2)
         * A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.
         */

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0;
        int coluna = 0;

        String executarPrograma;

        do {

            System.out.println("..:: JOGO da VELHA::..");
            System.out.println();
            System.out.println("Jogador 1 = X");
            System.out.println("Jogador 2 = O");
            System.out.println();




            while(!ganhou) {

                // IMPRIMIR TABULEIRO
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    System.out.print(" | ");
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        System.out.print(jogoDaVelha[i][j] + " | ");
                    }
                    System.out.println();

                }
                System.out.println();

                if (jogada % 2 != 0) {

                    System.out.println("Vez do jogador 1 - Escolha linha e coluna ( 1 - 3 )");
                    sinal = 'X';

                } else {

                    System.out.println("Vez do jogador 2 - Escolha linha e coluna ( 1 - 3 )");
                    sinal = 'O';

                }
                System.out.println();


                boolean linhaValida = false;
                while (!linhaValida) {

                    System.out.print("Entre com a linha 1, 2 ou 3: ");
                    linha = scan.nextInt();

                    if (linha >= 1 && linha <= 3) {

                        linhaValida = true;

                    } else {

                        System.out.println("Entrada inválida! Tente novamente.");

                    }
                }

                boolean colunaValida = false;
                while (!colunaValida) {

                    System.out.print("Entre com a coluna 1, 2 ou 3: ");
                    coluna = scan.nextInt();

                    if (coluna >= 1 && coluna <= 3) {

                        colunaValida = true;

                    } else {

                        System.out.println("Entrada inválida! Tente novamente.");

                    }
                    System.out.println();
                }

                linha--;
                coluna--;

                // VERIFICAÇÃO DE JOGADA
                if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {

                    System.out.println("Posição já usada, tente novamente.");

                } else {

                    jogoDaVelha[linha][coluna] = sinal;
                    jogada++;

                }


                //VERIFICAR GANHADOR
                if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
                        (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
                        (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                        (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
                        (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
                        (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
                        (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
                        (jogoDaVelha[2][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[0][2] == 'X') ) {

                    ganhou = true;
                    System.out.println("Parabéns, jogador 1 ganhou!");

                } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
                        (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
                        (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                        (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
                        (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
                        (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
                        (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                        (jogoDaVelha[2][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[0][2] == 'O')) {

                    ganhou = true;
                    System.out.println("Parabéns, jogador 2 ganhou!");

                } else if (jogada > 9) {

                    ganhou = true;
                    System.out.println("A partida terminou empatada!");

                }

            }
            System.out.println();


            System.out.print("Deseja jogar novamente s/n: ");
            executarPrograma = scan.next();

        } while(executarPrograma.equalsIgnoreCase("s"));








    }
}
