package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String sol;
        double raio, altura;

        while (true) {

            do {
                System.out.printf("Introduz o sólido: ");
                sol = ler.next();
                //System.out.printf("%b\n",sol.compareToIgnoreCase("fim") != 0 && sol.compareToIgnoreCase("esfera") != 0 && sol.compareToIgnoreCase("cilindro") != 0 && sol.compareToIgnoreCase("cone") != 0);
            } while ( sol.compareToIgnoreCase("fim") != 0 && sol.compareToIgnoreCase("esfera") != 0 && sol.compareToIgnoreCase("cilindro") != 0 && sol.compareToIgnoreCase("cone") != 0);

            if(sol.compareToIgnoreCase("fim") == 0)
                break;
            else if(sol.compareToIgnoreCase("esfera") == 0)
                System.out.printf("A àrea da esfera é %.3f.\n", volEsf(ler));
            else if(sol.compareToIgnoreCase("cilindro") == 0)
                System.out.printf("A àrea da cilindro é %.3f.\n", volCil(ler));
            else if(sol.compareToIgnoreCase("cone") == 0) {
                System.out.printf("A àrea da cone é %.3f.\n", volCone(ler));
            }
        }
    }
    public static double volEsf(Scanner ler){

        System.out.printf("Insere o raio: ");
        double raio = ler.nextDouble();

        return(Math.pow(raio,3)*3.14*4/3);
    }

    public static double volCil(Scanner ler){

        System.out.printf("Insere o raio: ");
        double raio = ler.nextDouble();
        System.out.printf("Insere a altura: ");
        double altura = ler.nextDouble();

        return(Math.pow(raio,2)*3.14*altura);
    }

    public static double volCone(Scanner ler){

        System.out.printf("Insere o raio: ");
        double raio = ler.nextDouble();
        System.out.printf("Insere a altura: ");
        double altura = ler.nextDouble();

        return(Math.pow(raio,2)*3.14*altura/3);
    }
}