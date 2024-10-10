package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.printf("Introduz o tamanho da sequência: ");
            N = ler.nextInt();
        } while (N <= 0);

        printFibo(N);
    }

    public static void printFibo(int N){

        int a = 1, b = 1;

        for(int i = 0; i < N; i++){
            System.out.printf("%d+%d=%d\n", a, b, a+b);
            int aux = a + b;
            a = b;
            b = aux;
        }
    }
}