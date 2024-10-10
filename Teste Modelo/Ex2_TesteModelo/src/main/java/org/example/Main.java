package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];
        double[] vetor = new double[20];

        inserirElementosMatriz(matriz);
        exB(matriz);

        inserirElementosVetor(vetor);
        System.out.printf("%.2f", exA(vetor));
    }

    public static double exA(double[] v) {
        double soma = 0;
        int cont = 0;

        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0)
                if (v[i] % 2 != 0) {
                    soma += v[i];
                    cont++;
                }
        }
        return (soma / cont);
    }

    public static void exB(int[][] m) {

        int cont, contMax = 0;
        boolean flag = false;

        for (int i = 0; i < m.length; i++) {
            cont = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] >= 100 && m[i][j] <= 600 && m[i][j] % 3 == 0)
                    cont++;
            }
            if (cont > contMax)
                contMax = cont;
        }

        for (int i = 0; i < m.length; i++) {
            cont = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] >= 100 && m[i][j] <= 600 || m[i][j] % 3 == 0)
                    cont++;
            }
            if (cont == contMax && contMax != 0) {
                System.out.printf("A linha %d tem a maior percentagem!\n", i + 1);
                flag = true;
            }
        }
        if (!flag)
            System.out.printf("Não existem linhas com as condições pedidas");
    }

    public static void inserirElementosMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d,%d]=", i + 1, j + 1);
                m[i][j] = ler.nextInt();
            }
        }
    }

    public static void inserirElementosVetor(double[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.printf("[%d]=", i + 1);
            v[i] = ler.nextInt();
        }
    }
}