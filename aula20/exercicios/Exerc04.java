package com.igor.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {


        /*
         * Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas
         * podemos associar uma tarefa específica (compromisso agendado). O programa deve ter um menu onde o usuário indica o dia do mês que deseja alterar e a hora,
         * entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.
         */

        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[31][24];

        boolean sair = false;
        int opcao;


        while(!sair){

            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");

            opcao = scan.nextInt();
            System.out.println();

            if (opcao == 1){ // -> Adicionar compromisso

                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {


                    System.out.println("Informe o dia do mês: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= agenda.length) {

                        diaValido = true;

                    } else {

                        System.out.println("Dia inválido!");
                        System.out.println();

                    }

                }

                boolean horaValida = false;
                int hora = 0;

                while (!horaValida) {

                    System.out.println("Informe a hora do compromisso: ");
                    hora = scan.nextInt();

                    if (hora >= 0 && hora <= 24) {

                        horaValida = true;

                    } else {

                        System.out.println("Hora inválida!");
                        System.out.println();
                    }

                }
                System.out.println();

                dia--;

                System.out.println("Informe o compromisso: ");
                agenda[dia][hora] = scan.next();
                System.out.println();



            } else if (opcao == 2) { // Verificar compromisso

                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {


                    System.out.print("Informe o dia do mês: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= agenda.length) {

                        diaValido = true;

                    } else {

                        System.out.println("Dia inválido!");
                        System.out.println();

                    }

                }

                boolean horaValida = false;
                int hora = 0;

                while (!horaValida) {

                    System.out.print("Informe a hora do compromisso: ");
                    hora = scan.nextInt();

                    if (hora > 0 && hora <= 24) {

                        horaValida = true;

                    } else {

                        System.out.println("Hora inválida!");
                        System.out.println();
                    }

                }
                System.out.println();

                dia--;

                System.out.println("O compromisso agendado é: ");
                System.out.println(agenda[dia][hora]);
                System.out.println();




            } else if (opcao == 0) { // Sair do programa

                sair = true;

            } else {
                System.out.println("Opção inválida, digite novamente!");

            }

        }
    }
}
