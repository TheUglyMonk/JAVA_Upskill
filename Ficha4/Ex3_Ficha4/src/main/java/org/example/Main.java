package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double x, xc, y, yc, dist, r;
        int cont = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira as coordenadas da circunferência:\n");
        System.out.printf("X = ");
        xc = ler.nextDouble();
        System.out.printf("Y = ");
        yc = ler.nextDouble();

        do {
            System.out.printf("Insira o raio da circunferência:");
            r = ler.nextDouble();
        } while (r <= 0);

        do{
            System.out.printf("Insira as coordenadas do ponto:\n");
            System.out.printf("X = ");
            x = ler.nextDouble();
            System.out.printf("Y = ");
            y = ler.nextDouble();
            if (distancia(xc,yc,x,y) <= r && distancia(xc,yc,x,y) != 0)
                cont++;
        } while (distancia(xc,yc,x,y) !=0);

        System.out.printf("%d pontos dentro da circunferência.", cont);
    }
    public static double distancia(double xc, double yc, double x, double y){
        // System.out.printf("%.2f", Math.sqrt((Math.pow((x - xc), 2)) + (Math.pow((y - yc), 2))));
        return (Math.sqrt((Math.pow((x - xc), 2)) + (Math.pow((y - yc), 2))));
    }
}