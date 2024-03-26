package com.igor.cursojava.aula52.exercicios.exerc01.application;

import com.igor.cursojava.aula52.exercicios.exerc01.model.entities.Agenda;
import com.igor.cursojava.aula52.exercicios.exerc01.model.entities.Contato;
import com.igor.cursojava.aula52.exercicios.exerc01.model.exceptions.AgendaCheiaException;
import com.igor.cursojava.aula52.exercicios.exerc01.model.exceptions.ContatoNaoExisteException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while(opcao != 3) {

            opcao = obterOpcaoMenu(scan);

            if(opcao == 1) {
                consultarContato(scan, agenda);
            }
            else if(opcao == 2) {
                adicionarContato(scan, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try {

            System.out.println("Criando um contato, entre com as informações: ");
            System.out.print("Entre com o nome do contato: ");
            String nome = scan.nextLine();
            System.out.print("Entre com o telefone do contato: ");
            String telefone = scan.nextLine();
            System.out.print("Entre com o email do contato: ");
            String email = scan.nextLine();

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println();
            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);
            System.out.println();

        }
        catch (AgendaCheiaException e) {

            System.out.println(e.getMessage());
            System.out.println("..:: Contatos da agenda::.. ");

        }




    }

    public static void consultarContato(Scanner scan, Agenda agenda) {

        String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado: ");

        try {
            if(agenda.consultaContatoPorNome(nomeContato) >= 0 ) {
                System.out.println("Contato existe");
                System.out.println();
            }
        }
        catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String lerInformacaoString(Scanner scan, String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {


        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println();
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato ");
            System.out.println("3 - Sair");

            try {
                String entrada =  scan.nextLine();
                opcao = Integer.parseInt(entrada);


                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida!");
                }
            }
            catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente!");
            }
            System.out.println();

        }






        return opcao;

    }
}
