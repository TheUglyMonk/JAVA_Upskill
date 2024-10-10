package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, soma=0, milhas;
        Scanner ler = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            do{
                System.out.printf("Insere a %dª distância: ", i);
                milhas = ler.nextDouble();
            } while (milhas <= 0);
            soma += milhas;
        }

        km = soma*1.609;
        System.out.printf("A média em km é %.3f.", km/5);
    }
}