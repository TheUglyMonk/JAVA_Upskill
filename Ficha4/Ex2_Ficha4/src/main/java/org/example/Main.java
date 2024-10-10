package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insira o número de disciplinas: ");
            N = ler.nextInt();
        } while (N <= 0);

        String[] disc = new String[N];
        int[] pos = new int[N];
        int[] neg = new int[N];

        for(int i = 0; i< N; i++){

                System.out.printf("Insira o nome da disciplinas: ");
                disc[i] = ler.next();

            do {
                System.out.printf("Insira o número de positivas: ");
                pos[i] = ler.nextInt();
            } while (pos[i] < 0);

            do {
                System.out.printf("Insira o número de negativas: ");
                neg[i] = ler.nextInt();
            } while (neg[i] < 0);
        }
        imprime(pos,neg,disc,N);
    }

    public static void imprime(int pos[], int neg[], String disc[], int N){
        for(int i = 0; i < N; i++){
            System.out.printf("Disciplina: %s\n", disc[i]);
            System.out.printf("Positivas:");
            for(int j = 0; j < pos[i]; j++)
                System.out.printf("*");
            System.out.printf("\n");
            System.out.printf("Negativas:");
            for(int j = 0; j < neg[i]; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}