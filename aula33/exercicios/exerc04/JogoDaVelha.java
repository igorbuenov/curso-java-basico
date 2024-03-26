package com.igor.cursojava.aula33.exercicios.exerc04;

public class JogoDaVelha {

    private char[][] jogoDaVelha;
    private int jogada;


    public JogoDaVelha() {
        jogoDaVelha = new char[3][3];
        jogada = 1;
    }


    public char[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(char[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {

            return false;

        } else {

            jogoDaVelha[linha][coluna] = sinal;
            jogada++;
            return true;

        }

    }

    public void imprimirTabuleiro() {

        for (int i = 0; i < jogoDaVelha.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }
            System.out.println();

        }

    }

    public boolean verificarGanhador(char sinal) {

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

    public boolean vezJogador1() {

        if (jogada % 2 == 1) {
            return true;
        }

        return false;

    }
}
