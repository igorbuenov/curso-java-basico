package com.igor.cursojava.aula43.exercicios.exerc02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        PessoaFisica p1 = new PessoaFisica ();

        p1.setNome ("Igor");
        p1.setRendaBruta (1000);
        p1.setCpf ("110.084.956.46");

        PessoaJuridica p2 = new PessoaJuridica ();
        p2.setNome ("Sarana");
        p2.setRendaBruta(5000);
        p2.setCnpj ("21.892.822/0001-42");


        Contribuinte[] contribuintes = new Contribuinte[2];

        contribuintes[0] = p1;
        contribuintes[1] = p2;

        for (Contribuinte contribuinte : contribuintes) {
            System.out.println (contribuinte);
            System.out.println ();
        }

    }
}
