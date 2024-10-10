package org.example;


import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        double[] nms = new double[50];
        int n;

        n = lerInt(nms);
        System.out.printf("\nMédia: %.2f.", vetMedia(nms,n));

        maxMin(nms,n);

    }

    private static int lerInt(double[] nms) {

        int i;

        for (i = 0; i < 10; i++) {
            System.out.printf("Insira o valor:");
            nms[i] = ler.nextDouble();
        }

        return (i);
    }

    private static double vetMedia(double[] vet, int N){

        int i;
        double media = 0;
        for(i = 0; i < N; i++){
            media += vet[i];
        }

        media /= i;

        return (media);
    }

    private static void maxMin (double[] vet, int n){

        double max = vet[0], min = vet[0];

        for(int i = 0; i < n; i ++){
            if(max < vet[i])
                max = vet[i];
            if(min > vet[i])
                min = vet[i];
        }

        for(int i = 0; i < n; i ++){
            if(max == vet[i])
                System.out.printf("Máx %.2f na posição %d.\n", max, i+1);
            if(min == vet[i])
                System.out.printf("Min %.2f na posição %d.\n", min, i+1);
        }
    }
}