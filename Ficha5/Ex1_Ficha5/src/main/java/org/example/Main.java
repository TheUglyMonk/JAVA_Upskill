package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, s = 0, c = 0;
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);
        for (i = 0; i < v.length; i++) {
            System.out.printf("Número?");
            v[i] = ler.nextInt();
        }
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
            }
        }
        if (c != 0)
            System.out.println(((double) s) / c);
        else
            System.out.println("Operação impossível de realizar");

        System.out.printf("O valor ínimo é %d.", minVal(v));
    }

    public static int minVal(int[] vetor) {

        int min = vetor[0];

        for(int tam = 1; tam < vetor.length && tam != 0; tam ++){
            if(min > vetor[tam])
                min = vetor[tam];
        }
        for(int tam = 1; tam < vetor.length && tam != 0; tam ++){
            if(min == vetor[tam])
                System.out.printf("Índice do menor valor: %d.\n", tam);
        }
        return (min);
    }
}