package com.igor.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        /*Modifique o programa anterior de maneira a guardar os compromissos de todo o ano, organizado por mês, dia e hora
        * (só 8 horas por dia)
        */

        Scanner scan = new Scanner(System.in);


        String[][][] agenda = new String[12][31][8];

        boolean sair = false;
        int opcao;


        while(!sair) {

            System.out.println("1 - Adicionar compromisso");
            System.out.println("2 - Verificar compromisso");
            System.out.println("0 - Sair");

            opcao = scan.nextInt();
            System.out.println();

            if (opcao == 1) { // -> Adicionar compromisso

                boolean mesValido = false;
                int mes = 0;

                while (!mesValido) {


                    System.out.println("Informe o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {

                        mesValido = true;

                    } else {

                        System.out.println("Dia inválido!");
                        System.out.println();

                    }

                }

                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {


                    System.out.println("Informe o dia do mês: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {

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

                    if (hora >= 0 && hora <= 8) {

                        horaValida = true;

                    } else {

                        System.out.println("Hora inválida!");
                        System.out.println();
                    }

                }
                System.out.println();

                mes--;
                dia--;

                System.out.println("Informe o compromisso: ");
                agenda[mes][dia][hora] = scan.next();
                System.out.println();


            } else if (opcao == 2) { // Verificar compromisso

                boolean mesValido = false;
                int mes = 0;

                while (!mesValido) {


                    System.out.println("Informe o mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12) {

                        mesValido = true;

                    } else {

                        System.out.println("Dia inválido!");
                        System.out.println();

                    }

                }

                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {


                    System.out.print("Informe o dia do mês: ");
                    dia = scan.nextInt();

                    if (dia > 0 && dia <= 31) {

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

                    if (hora > 0 && hora <= 8) {

                        horaValida = true;

                    } else {

                        System.out.println("Hora inválida!");
                        System.out.println();
                    }

                }
                System.out.println();

                mes--;
                dia--;

                System.out.println("O compromisso agendado é: ");
                System.out.println(agenda[mes][dia][hora]);
                System.out.println();


            } else if (opcao == 0) { // Sair do programa

                sair = true;

            } else {

                System.out.println("Opção inválida, digite novamente!");

            }
        }
    }
}
