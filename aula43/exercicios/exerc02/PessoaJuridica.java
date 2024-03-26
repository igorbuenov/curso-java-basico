package com.igor.cursojava.aula43.exercicios.exerc02;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {

        return this.getRendaBruta () * 0.1;

    }

    @Override
    public String toString() {
        return "Pessoa Jurídica \n" +
                super.toString () +
                "CNPJ: " + cnpj + "\n" +
                String.format("Imposto a ser pago: R$ %.2f", calcularImposto ());
    }
}
