package com.igor.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exerc31 {
    public static void main(String[] args) {


        /*
        * O cardapio de uma lanchonete é o seguinte:
        *
        * Especificação      Código      Preço
        * Cachorro Quente    100         R$ 1,20
        * Bauru Simples      101         R$ 1,30
        * Bauru com ovo      102         R$ 1,50
        * Hambúrguer         103         R$ 1,20
        * Cheeseburguer      104         R$ 1,30
        * Refigerante        105         R$ 1,00
        *
        * Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor
        * a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar
        * quando o pedido deve ser encerrado.
        *
        */

        Scanner scan = new Scanner(System.in);

        String output = "";
        int codigoProduto;
        int qtdProduto = 0;
        String executarPrograma;




        do {

            System.out.print("Informe o código do produto: ");
            codigoProduto = scan.nextInt();


            if (codigoProduto < 100 || codigoProduto > 105) {
                output = "Produto não encontrado";
            } else {
                System.out.print("Informe a quantidade desejada: ");
                qtdProduto = scan.nextInt();
                System.out.println();
            }


            switch (codigoProduto){

                case 100:
                    output = String.format("Cachorro quente - R$ 1,20 * %d = %.2f", qtdProduto, (qtdProduto*1.20));
                    break;
                case 101:
                    output = String.format("Bauru Simples - R$ 1,30 * %d = %.2f", qtdProduto, (qtdProduto*1.30));
                    break;
                case 102:
                    output = String.format("Bauru com ovo - R$ 1,50 * %d = %.2f", qtdProduto, (qtdProduto*1.50));
                    break;
                case 103:
                    output = String.format("Hambúrguer - R$ 1,20 * %d = %.2f", qtdProduto, (qtdProduto*1.20));
                    break;
                case 104:
                    output = String.format("Cheeseburguer - R$ 1,30 * %d = %.2f", qtdProduto, (qtdProduto*1.30));
                    break;
                case 105:
                    output = String.format("Refrigerante - R$ 1,00 * %d = %.2f", qtdProduto, (qtdProduto*1.00));
                    break;

            }

            System.out.println(output);

            System.out.println();
            System.out.print("Deseja fazer outro pedido s/n? ");
            executarPrograma = scan.next();

        } while (executarPrograma.equalsIgnoreCase("s"));










    }
}
