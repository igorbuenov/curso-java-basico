package com.igor.cursojava.aula46.exercicios;

public class Program {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado ();
        quadrado.setNome ("Quadrado");
        quadrado.setLado (2);

        Circulo circulo = new Circulo ();
        circulo.setNome ("Circulo");
        circulo.setRaio (2);

        Triangulo triangulo = new Triangulo ();
        triangulo.setNome ("Triangulo");
        triangulo.setAltura (2);
        triangulo.setBase (3);

        Cubo cubo = new Cubo ();
        cubo.setNome ("Cubo");
        cubo.setLado (3);

        Cilindro cilindro = new Cilindro ();
        cilindro.setNome ("Cilindro");
        cilindro.setAltura (3);
        cilindro.setRaio (2);

        Piramide piramide = new Piramide ();
        piramide.setNome ("Piramide");
        piramide.setAltura (3);
        piramide.setApotema (4);
        piramide.setArestaBase (2);
        piramide.setNumPoliBase (4);
        piramide.setBase (quadrado);

        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[6];

        figurasGeometricas[0] = quadrado;
        figurasGeometricas[1] = circulo;
        figurasGeometricas[2] = triangulo;
        figurasGeometricas[3] = cubo;
        figurasGeometricas[4] = cilindro;
        figurasGeometricas[5] = piramide;

        for (FiguraGeometrica figura : figurasGeometricas) {
            System.out.println ("---------------------");
            System.out.println (figura.getNome());

            if (figura instanceof Figura2D) {
                Figura2D figura2D = (Figura2D) figura;
                System.out.println (figura2D.calcularArea ());
            }

            if (figura instanceof Figura3D) {
                Figura3D figura3D = (Figura3D) figura;
                System.out.println (figura3D.calcularArea ());
                System.out.println (figura3D.calcularVolume ());
            }

        }

    }
}
