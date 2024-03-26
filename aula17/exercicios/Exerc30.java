package com.igor.cursojava.aula17.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc30 {
    public static void main(String[] args) {


        /*
        * O Sr. manoel acaba de adquir uma panificadora e pretende implantar a metodologia da tabelinha.
        * Que já é sucesso na sua lojinha de R$ 1,99. Você foi contratado para desenvolver o programa
        * que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo
        * usuário, conforme o exemplo abaixo:
        *
        * Preço do pão: R$ 0,18
        * Panificadora Pão de Ontem - Tabela de preços
        * 1 - R$ 0,18
        * 2 - R$ 0,36
        * ...
        * 50 - R$ 9,00 */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int qtdProdutos;
        double precoProdutos;
        String executarPrograma;

        do {

            System.out.println();
            System.out.print("Informe quantos produtos o cliente está levando: ");
            qtdProdutos = scan.nextInt();
            System.out.println();

            if (qtdProdutos < 1 || qtdProdutos > 50) {

                System.out.println("Quantidade inválida! Informe a quantidade entre de 1 até 50 produtos.");

            } else {

                System.out.print("Preço do pão: ");
                precoProdutos = scan.nextDouble();
                System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
                for (int i = 1; i <= qtdProdutos ; i++) {
                    System.out.printf(String.format("%d - R$ %.2f\n", i, (i * precoProdutos)).replace(".", ","));
                }
                System.out.println();

            }



            System.out.print("Deseja executar o programa novamente s/n? ");
            executarPrograma = scan.next();

        } while(executarPrograma.equalsIgnoreCase("s"));
    }
}
