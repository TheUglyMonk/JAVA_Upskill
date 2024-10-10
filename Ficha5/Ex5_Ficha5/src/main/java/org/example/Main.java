package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int N = 7;
        int[] chave = new int[N];
        int numMax = 50, numMin = 1, estrelaMax = 12, estrelaMin = 1;

        for(int i = 0; i < 5; i++)
            chave[i] = rand.nextInt(numMax - numMin + 1) + numMin;

        for(int i = 5; i < 7; i++)
            chave[i] = rand.nextInt(estrelaMax - estrelaMin + 1) + estrelaMin;

        listar(chave,N);
    }

    private static void listar(int[] nms, int n) {
        // Apresenta os primeiros n elementos de vec
        int i;

        System.out.printf("Números:");
        for(i = 0; i < 5; i++){
            System.out.printf("%d ", nms[i]);
        }
        System.out.printf("\nEstrelas:");
        for(i = 5; i < 7; i++){
            System.out.printf("%d ", nms[i]);
        }
    }
}