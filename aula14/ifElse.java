package com.igor.cursojava.aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade!");
        } else {
            System.out.println("Não é maior de idade!");
        }

        // barato <= 10
        // 10 < valor < 15 - pedir desconto
        // 15 <= valor 17 - pesquisar mais
        // >= 17 - muito caro

        System.out.println();
        System.out.print("Entre com o valor do produto: ");
        double valor = scan.nextDouble();
        
        if (valor <= 10) {
            System.out.println("Está barato, pode comprar!");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Peça desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Não comprar, está muito caro!");
        }
    }
}
