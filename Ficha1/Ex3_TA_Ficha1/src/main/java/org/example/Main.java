package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double p;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insere o valor do perímetro: ");
            p = ler.nextDouble();
        } while (p <= 0);

        System.out.printf("A área é: %f", Math.pow(p,2)/(4*3.14));
    }
}