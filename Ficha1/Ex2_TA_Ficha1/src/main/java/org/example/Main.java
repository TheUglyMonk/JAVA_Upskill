package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x1, x2, y1, y2, d;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insere as coordenadas do primeiro ponto(x, y):\n");
        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        do {
            System.out.printf("Insere as coordenadas do segundo ponto(x, y):\n");
            x2 = ler.nextDouble();
            y2 = ler.nextDouble();
        } while(x1 == x2 && y1 == y2);

        d = Math.sqrt((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2)));
        System.out.printf("A distância entre os pontos é %.3f. ", d);
    }
}