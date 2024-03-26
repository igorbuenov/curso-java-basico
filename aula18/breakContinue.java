package com.igor.cursojava.aula18;

import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.print("Entre com um número: ");
        int num = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int max = scan.nextInt();
        System.out.println();



        //BREAK

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                System.out.println("BREAK");
                System.out.println(" O valor de i é: " + i);
                break;
            }

        }
        System.out.println();


        /*
        for (int i = 0; i <= 4 ; i++) {

            rotulo1: {
                rotulo2: {
                    rotulo3: {

                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }

                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);

        }
        */

        // CONTINUE

        System.out.println("CONTINUE");
        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                continue;
            }
            System.out.println(" O valor de i é: " + i);

        }



    }
}
