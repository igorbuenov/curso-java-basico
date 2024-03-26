package com.igor.cursojava.aula34.exercicios.exerc01;

public class Contador {

    private static int contador = 0;
    private static int classeInstanciada = 0;

    public Contador() {
        contador++;
        classeInstanciada++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public static int getClasseInstanciada() {
        return classeInstanciada;
    }

    public static void setClasseInstanciada(int classeInstanciada) {
        Contador.classeInstanciada = classeInstanciada;
    }

    public static void zerarContador() {
        setContador(0);
    }

    public static void incremenarContador() {
        setContador(contador + 1);
    }


}
