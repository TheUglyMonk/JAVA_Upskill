package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, min, max, soma;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insere o máximo: ");
            max = ler.nextInt();
        } while (max <= 0);

        do {
            System.out.printf("Insere um valor: ");
            num = ler.nextInt();
        } while (num <= 0);

        min = num;
        soma = num;
        do {
            do {
                System.out.printf("Insere um valor: ");
                num = ler.nextInt();
            } while (num < 0);
            if (min > num)
                min = num;
            soma += num;
        } while (soma <= max);

        System.out.printf("O valor mínimo é: %d", min);
    }
}