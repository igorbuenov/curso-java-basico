package com.igor.cursojava.aula24.exercicios.exerc06;

public class Program {
    public static void main(String[] args) {

        /*
        * Crie uma classe que represente um contato da agenda do seu celular
        */

        Contato contato1 = new Contato();

        contato1.nome = "Igor";
        contato1.endereco = "Américo Lobo, 2145";
        contato1.email = "ib_ventura@hotmail.com";
        contato1.telefones[0] = "32-988576846";
        contato1.telefones[1] = "2120-1800";

        System.out.println("Nome: " + contato1.nome);
        System.out.println("Endereço: " + contato1.endereco);
        System.out.println("Email: " + contato1.email);
        for (String telefone : contato1.telefones) {

            if (telefone != null) {
                System.out.println("Telefone: " + telefone);
            }
        }
    }
}
