package com.igor.cursojava.aula24.exercicios.exerc04;

import java.util.Date;

public class Exerc04 {
    public static void main(String[] args) {


        /*
         * Usando o resultado do exercício anterior como base, crie uma classe LivroDeBblioteca que represente os dados básicos de um livro de um biblioteca
         * que pode ser emprestado a leitores.
         */

        LivroDeBiblioteca algoritmo = new LivroDeBiblioteca();

        algoritmo.nome = "Estrutura de dados";
        algoritmo.autor = "Loiane Groner";
        algoritmo.editora = "Novatec";
        algoritmo.ano = 2019;
        algoritmo.genero = "Programação";
        algoritmo.paginas = 408;
        algoritmo.emprestado = true;
        algoritmo.dataEntrega = new Date();


        System.out.println("Nome: "+ algoritmo.nome);
        System.out.println("Autor(a): " + algoritmo.autor);
        System.out.println("Editora: " + algoritmo.editora);
        System.out.println("Ano de publicação: " + algoritmo.ano);
        System.out.println("Gênero: " + algoritmo.genero);
        System.out.println("Número de páginas: " + algoritmo.paginas);
        if (algoritmo.emprestado) {
            System.out.println("Data de entrega: " + algoritmo.dataEntrega);

        }

    }
}
