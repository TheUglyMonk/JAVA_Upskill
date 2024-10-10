package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 1, res;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira o fatorial a calcular: ");
        num = ler.nextInt();

        while (num > 0) {
            res = 1;
            int aux = num;
            while (aux > 0) {
                res *= aux;
                aux--;
            }
            System.out.printf("O resultado do factorial é: %d\n", res);
            System.out.printf("Insira o fatorial a calcular: ");
            num = ler.nextInt();
        }
    }
}