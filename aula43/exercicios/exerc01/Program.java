package com.igor.cursojava.aula43.exercicios.exerc01;

import static com.igor.cursojava.aula43.exercicios.exerc01.Helpers.*;

public class Program {
    public static void main(String[] args) {


        System.out.println ("..:: Conta Bancaria  ::..");

        // TESTE CLASSE MÃE - CONTA BANCARIA
        ContaBancaria contaSimples = new ContaBancaria ();
        contaSimples.setNomeCliente ("Cliente Conta Simples");
        contaSimples.setNumConta ("403451");
        System.out.println (contaSimples);
        System.out.println ();

        // TESTE SUBCLASSE - CONTA POUPANÇA
        ContaPoupanca contaPoupanca = new ContaPoupanca ();
        contaPoupanca.setNomeCliente ("Cliente Conta Poupança");
        contaPoupanca.setNumConta ("333344");
        contaPoupanca.depositar (50);
        contaPoupanca.setDiaRendimento (4);
        System.out.println (contaPoupanca);
        System.out.println ();

        if (contaPoupanca.calcularNovoSaldo (0.5)) {
            System.out.println (String.format ("Rendimento aplicado, novo saldo é de R$ %.2f.", contaPoupanca.getSaldo ()));
        } else {
            System.out.println ("Hoje não é dia de rendimento!");
        }
        System.out.println ();

        // TESTE SUBCLASSE - CONTA ESPECIAL
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("221100");
        contaEspecial.setLimite(500);
        contaEspecial.setSaldo (700);
        realizarSaque(contaEspecial, 1000);
        System.out.println(contaEspecial);






    }


}
