package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);


    public static void main(String[] args) {

        int[] vec;
        int n;

        System.out.printf("Insira o número de valores a introduzir: ");
        n = ler.nextInt();
        vec = new int[n];

        n = lerInt(vec, n);
        System.out.printf("Vetor original: \n");
        n = listar(vec,n);

        System.out.printf("\nVetor invertido: \n");
        vec = invert(vec,n);
        n = listar(vec,n);

        System.out.printf("\nVetor depois do push: \n");
        vec = push(vec,n);
        n = listar(vec,n);



    }

    private static int lerInt(int[] nms, int N) {
// Lê uma sequência de nomes terminada com a palavra FIM.
// Armazena os nomes em vec e retorna o número desses nomes.
        int i;

        for (i = 0; i < N; i++) {
            System.out.printf("Insira o valor:");
            nms[i] = ler.nextInt();
        }

        return (i);
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

    private static int listar(int[] nms, int n) {
        // Apresenta os primeiros n elementos de vec
        int i;

        for(i = 0; i < n; i++){
            System.out.printf("%d ", nms[i]);
        }
        return i;
    }

    public static int[] push(int[] nms, int N){

        int[] p = new int[N];
        int i = 0;

        p[i] = nms[N-1];
        for(i = 1; i < N; i++)
            p[i] = nms[i-1];

        return (p);
    }
}