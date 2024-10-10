package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insira o valor: ");
            num = ler.nextInt();
        } while (num % 2 != 0 && num % 3 == 0);

        int aux = 0;
        for(int car = String.valueOf(num).length(); car != 0; car--){
            aux = (aux * 10) + (num % 10);
            num /= 10;
        }

        System.out.printf("%d", aux);

    }

}