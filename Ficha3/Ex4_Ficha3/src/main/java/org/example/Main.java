package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insira numero:");
            num = ler.nextInt();
        } while (num <= 0);

        int aux = 0;
        int aux1 = num;
        for(int car = String.valueOf(num).length(); car != 0; car--){
            aux = (aux * 10) + (num % 10);
            num /= 10;
        }

        if (aux1 == aux)
            System.out.printf("É capicua!");
        else
            System.out.printf("Não é capicua!");

    }
}