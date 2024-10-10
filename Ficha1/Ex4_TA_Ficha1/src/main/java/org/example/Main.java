package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira o valor de x: ");
        x = ler.nextDouble();

        if( x <= 0)
            System.out.printf("f(x)=%.2f", x);
        else
            System.out.printf("f(x)=%.2f", Math.pow(x,2)-2*x);
    }
}