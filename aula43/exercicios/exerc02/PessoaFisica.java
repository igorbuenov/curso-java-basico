package com.igor.cursojava.aula43.exercicios.exerc02;

public class PessoaFisica extends Contribuinte{

    private String cpf;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public double calcularImposto() {

        double renda = this.getRendaBruta();

        if (renda <= 1400) {
            return 0;
        }

        if (renda > 1400 && renda <= 2100) {
            return (renda * 0.1) - 100;
        }

        if (renda > 2100 && renda <= 2800 ) {
            return  (renda * 0.15) - 270;
        }

        if (renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }

        return (renda * 0.3) - 700;
    }

    @Override
    public String toString() {
        return "Pessoa Física \n" +
                super.toString () +
                "CPF: " + cpf + "\n" +
                String.format("Imposto a ser pago: R$ %.2f", calcularImposto ());
    }
}
