package com.igor.cursojava.aula36.exemplo;

public class Program {
    public static void main(String[] args) {



        Contato contato = new Contato ();

        contato.setNome("Igor");

        //Criar objeto endereço
        Endereco end = new Endereco ();
        end.setNomeRua ("Américo Lobo");
        end.setNumero ("2145");
        end.setComplemento ("302");
        end.setCidade ("Juiz de Fora");
        end.setEstado ("Minas Gerais");
        end.setCep ("36050-000");

        contato.setEndereco (end);

        //Criar objeto telefone
        Telefone tel = new Telefone ();
        tel.setTipo ("Celular");
        tel.setDdd ("32");
        tel.setNumero ("98857-6846");

        Telefone tel2 = new Telefone ();
        tel2.setTipo ("casa");
        tel2.setDdd ("32");
        tel2.setNumero ("4444-4444");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones (telefones);


        // Saída de dados
        System.out.println (contato.getNome ());

        if (contato != null && contato.getEndereco () != null) {
            System.out.println (contato.getEndereco ().getCidade ());

        }

        if (contato != null && contato.getTelefones () != null) {
            for (Telefone t : contato.getTelefones ()) {
                System.out.println (t.getDdd () + " " + t.getNumero ());
            }

        }

    }
}
