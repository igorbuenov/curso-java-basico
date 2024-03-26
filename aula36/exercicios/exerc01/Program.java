package com.igor.cursojava.aula36.exercicios.exerc01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);


        System.out.print("Entre com o nome da agenda: ");
        String nome = scan.nextLine ();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Entre com as informações do contato " + (i+1));
            Contato c = new Contato();

            System.out.print("Nome: ");
            c.setNome(scan.nextLine());

            System.out.print("Telefone: ");
            c.setTelefone(scan.nextLine());

            System.out.print("Email: ");
            c.setEmail(scan.nextLine());

            contatos[i] = c;
            System.out.println();

        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }


    }
}
