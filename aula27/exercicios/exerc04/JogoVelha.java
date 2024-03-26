package com.igor.cursojava.aula27.exercicios.exerc04;

public class JogoVelha {

    char[][] jogoDaVelha = new char[3][3];
    int jogada = 1;

    boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {

            return false;

        } else {

            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;

        }

    }

    void imprimirTabuleiro() {

        for (int i = 0; i < jogoDaVelha.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();

        }

    }

    boolean verificarGanhador(char sinal) {

        if ((jogoDaVelha[0][0] == sinal && jogoDaVelha[0][1] == sinal && jogoDaVelha[0][2] == sinal) ||
                (jogoDaVelha[1][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[1][2] == sinal) ||
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[2][1] == sinal && jogoDaVelha[2][2] == sinal) ||
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][0] == sinal && jogoDaVelha[2][0] == sinal) ||
                (jogoDaVelha[0][1] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][1] == sinal) ||
                (jogoDaVelha[0][2] == sinal && jogoDaVelha[1][2] == sinal && jogoDaVelha[2][2] == sinal) ||
                (jogoDaVelha[0][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[2][2] == sinal) ||
                (jogoDaVelha[2][0] == sinal && jogoDaVelha[1][1] == sinal && jogoDaVelha[0][2] == sinal) ) {

            return true;
        }

        return false;

    }

    boolean vezJogador1() {

        if (jogada % 2 == 1) {
            return true;
        }

        return false;

    }

}
