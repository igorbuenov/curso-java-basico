package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc29 {
    public static void main(String[] args) {


        /*
        * O Sr. Manoel possui uma grande loja de artigos de R$1,99, com cerca de 10 caixas. Para agilizar
        * o calculo de quanto cada cliente deve pagar, ele desenvolveu uma tabela que contém o números de
        * itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa precisa
        * apenas contar a quantidade de itens que o cliente está levando e olhar na tabela de preços.
        * Você foi contratado para desenvolver o programa que monta esta tabela de preços, que conterá os
        * preços de 1 até 50 produtos, conforme o exemplo abaixo:
        *
        * Lojas Quase Dois - Tabela de preços
        * 1 - R$ 1,99
        * 2 - R$ 3,98
        * ...
        * 50 - R$ 99,50
        */
        Scanner scan = new Scanner(System.in);

        int qtdProdutos;
        double precoProdutos = 1.99;
        String executarPrograma;

        do {

            System.out.println();
            System.out.print("Informe quantos produtos o cliente está levando: ");
            qtdProdutos = scan.nextInt();
            System.out.println();

            if (qtdProdutos < 1 || qtdProdutos > 50) {

                System.out.println("Quantidade inválida! Informe a quantidade entre de 1 até 50 produtos.");

            } else {

                System.out.println("Loja Quase Dois - Tabela de Preços");
                for (int i = 1; i <= qtdProdutos ; i++) {
                    System.out.printf("%d - R$ %.2f\n", i, (i * precoProdutos));
                }
                System.out.println();

            }



            System.out.print("Deseja executar o programa novamente s/n? ");
            executarPrograma = scan.next();

        } while(executarPrograma.equalsIgnoreCase("s"));



    }
}
