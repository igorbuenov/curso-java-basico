package com.igor.cursojava.aula24.exercicios.exerc03;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {


        /*
        * Usando o resultado do exercício anterior como base, crie uma classe LivroDeLivraria que represente os dados básicos de um livro que está
        * a venda em uma livraria
        */

        Scanner scan = new Scanner(System.in);

        LivroDeLivraria algoritmo = new LivroDeLivraria();

        algoritmo.nome = "Estrutura de dados";
        algoritmo.autor = "Loiane Groner";
        algoritmo.editora = "Novatec";
        algoritmo.ano = 2019;
        algoritmo.genero = "Programação";
        algoritmo.paginas = 408;
        algoritmo.preco = 93.26;

        System.out.println("Nome: "+ algoritmo.nome);
        System.out.println("Autor(a): " + algoritmo.autor);
        System.out.println("Editora: " + algoritmo.editora);
        System.out.println("Ano de publicação: " + algoritmo.ano);
        System.out.println("Gênero: " + algoritmo.genero);
        System.out.println("Número de páginas: " + algoritmo.paginas);
        System.out.println("Preço: R$ " + algoritmo.preco);
    }
}
