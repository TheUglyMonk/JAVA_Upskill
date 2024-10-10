package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num, contPar = 0, contImp = 0, cont = 0, somaImp = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Introduz um valor");
        num = ler.nextDouble();

        while (num > 0) {
            if (num % 2 == 0)
                contPar++;
            else {
                contImp++;
                somaImp += num;
            }
            cont++;
            System.out.printf("Introduz um valor");
            num = ler.nextDouble();
        }
        if (cont > 0) {
            System.out.printf("Percentagem de pares: %.2f%%\n", contPar*100/cont);
            if (contImp > 0)
                System.out.printf("Média de ímpares: %.2f\n ", somaImp/contImp);
            else
                System.out.printf("Não há números ímpares.\n");
        } else
            System.out.printf("Primeiro valor foi inválido.");
    }
}