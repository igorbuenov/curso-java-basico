package com.igor.cursojava.aula10;

public class Variaveis {
    public static void main(String[] args) {


        // Convenção JAVA
        int idade = 30;
        String nome = "Igor";
        String nomeDoMeuCachorro = "Bob";
        String ano = "2023";

        // Aceito, mas não utilizado
        int _idade;
        int $idade;

        // Não é convenção JAVA
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // Má prática
        int a = 10;
        String b = "Igor";
    }
}

// Dê significado as suas váriaveis, siga boas práticas e utilize os padrões das empresas em seus projetos