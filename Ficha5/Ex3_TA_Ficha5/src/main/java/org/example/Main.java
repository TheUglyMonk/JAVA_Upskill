package org.example;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[] vet;
        int n = 0, num;

        System.out.printf("Insere um número a adicionar ao vetor: ");
        num = ler.nextInt();
        n = String.valueOf(num).length();

        vet = new int[n];

        n = insere(vet, n, num);

        n = listar(vet, n);

    }

    private static int insere(int[] nms, int n, int num){

        int i;
        int[] aux = new int[n];

        for( i = 0; num != 0; i++){
            nms[i] = num % 10;
            num /= 10;
        }

        invert(nms, String.valueOf(num).length());

        return (i);
    }
    private static int listar(int[] vec, int n) {
        // Apresenta os primeiros n elementos de vec
        int i;

        for(i = 0; i < n; i++){
            System.out.printf("%dº elemento: %d\n", i+1, vec[i]);
        }
        return i;
    }

    private static int[] invert(int[] nms, int N) {

        int[] nms_inv = new int[N];

        int j = N - 1;
        for(int i = 0; i < N; i++){
            nms_inv[i] = nms[j];
            j--;
        }
        return (nms_inv);
    }
}