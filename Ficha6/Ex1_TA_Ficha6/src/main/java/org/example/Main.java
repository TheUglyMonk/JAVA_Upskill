package org.example;

import java.util.Scanner;

public class Main {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        inserirElementos(matriz);
        listarMatriz(matriz);

        maiorElem(matriz);
    }

    static public void maiorElem(int[][] m) {

        int maior;

        for (int i=0; i< m.length; i++){

            maior = m[i][0];
            for (int j=0; j< m[i].length; j++) {
                if(maior < m[i][j])
                    maior = m[i][j];
            }
            System.out.printf("O maior número da linha %d é %d.\n", i, maior);
        }
    }

    public static void inserirElementos(int[ ][] m) {

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                System.out.printf ("[%d,%d]=",i+1,j+1);
                m[i][j]=ler.nextInt();
            }
        }
    }

    public static void listarMatriz( int[ ][ ] m) {
        System.out.printf("Listagem da matriz\n");

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                System.out.printf("%d\t",m[i][j]);
            }
            System.out.printf("\n");
        }
    }
}