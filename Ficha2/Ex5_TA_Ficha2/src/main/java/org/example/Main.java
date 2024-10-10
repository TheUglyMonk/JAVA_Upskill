package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double produto, max, limit, num;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insere o valor máximo do produto: ");
            limit = ler.nextDouble();
        } while( limit <= 0);

        do {
            System.out.printf("Insere um valor: ");
            num = ler.nextDouble();
        } while( num <= 0);

        produto = num;
        max = num;

        while (produto <= limit){

            do {
                System.out.printf("Insere um valor: ");
                num = ler.nextDouble();
            } while( num <= 0);
            produto *= num;
            if (num > max)
                max = num;
        }
        System.out.printf("O valor máximo é: %.2f", max);
    }
}