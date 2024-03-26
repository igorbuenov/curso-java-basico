package com.igor.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        // Linha inteira
        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
        System.out.println();

        // Primeira palavra
        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        System.out.println();

        // Inteiro
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
        System.out.println();

        // Double
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);
        System.out.println();
        */

        // Todos os dados de uma vez só
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animais: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        int quantidadeFilhos = scan.nextInt();
        double altura = scan.nextDouble();
        int animais = scan.nextInt();

        System.out.println("Primeiro nome: " + primeiroNome + "\n" +
                "Idade: " + idade + "\n" +
                "Filhos: " + quantidadeFilhos + "\n" +
                "Altura: " + altura + "\n" +
                "Animais: " + animais);
    }
}
