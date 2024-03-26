package com.igor.cursojava.aula49;

public class TestandoFinally {
    public static void main(String[] args) {



        int[] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println (numeros[i] + " / " + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException exception) {
                System.out.println ("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println ("Posição do array inválida");
            }
            finally {
                System.out.println ("Essa linha é sempre impressa após o try ou o catch");
            }
        }

    }
}
