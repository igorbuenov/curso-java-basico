package com.igor.cursojava.aula52.exercicios.exerc01.model.exceptions;

public class AgendaCheiaException extends Exception{

    private static final long serialVersionUID = 1L;


    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }



}
