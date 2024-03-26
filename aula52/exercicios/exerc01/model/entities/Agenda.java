package com.igor.cursojava.aula52.exercicios.exerc01.model.entities;

import com.igor.cursojava.aula52.exercicios.exerc01.model.exceptions.AgendaCheiaException;
import com.igor.cursojava.aula52.exercicios.exerc01.model.exceptions.ContatoNaoExisteException;

import java.util.Arrays;
import java.util.List;

public class Agenda {


    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato contato) throws AgendaCheiaException {


        boolean agendaCheia = true;

        for (int i = 0; i < contatos.length; i++) {

            if(contatos[i] == null) {
                contatos[i] = contato;
                agendaCheia = false;
                break;
            }

        }

        if(agendaCheia) {
            throw new AgendaCheiaException();
        }

    }

    public int consultaContatoPorNome (String nome) throws ContatoNaoExisteException {

        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                if(contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }

        throw new ContatoNaoExisteException(nome);

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Contato c : contatos) {
            if(c != null) {
                stringBuilder.append(c.toString() + "\n");
            }
        }

        return stringBuilder.toString();


    }
}
