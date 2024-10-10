package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num, min, cont = 0, somaPar = 0, contPar = 0, contImpar = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Introduzir um valor: ");
        num = ler.nextInt();
        min = num;

        while (cont < 100 && num >= 0) {
            cont++;
            if (min < num)
                min = num;
            if (num % 2 == 0) {
                somaPar+=num;
                contPar++;
            } else
                contImpar++;
            if (cont < 100) {
                System.out.printf("Introduzir um valor: ");
                num = ler.nextInt();
            }
        }
        if (cont > 0) {
            if (contPar > 0)
                System.out.printf("A média dos números pares é: %.2f\n", somaPar/contPar);
            else
                System.out.printf("Não existem números pares.");
            System.out.printf("A perCentagem de Impares é: %.2f", contImpar*100/cont);
        } else
            System.out.printf("Não foram introduzidos números válidos!");


    }
}