package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        inserirElementos(matriz);
        listarMatriz(matriz);
        mediaColuna(matriz);
    }

    public static void mediaColuna(int[ ][] m) {

        int soma, mediaAtual, mediaMax = 0;

        for (int i=0; i< m[0].length; i++){
            soma = 0;
            for (int j=0; j< m.length; j++) {
                soma += m[j][i];
            }
            mediaAtual = soma / m.length;
            if(mediaAtual > mediaMax)
                mediaMax = mediaAtual;
        }

        for (int i=0; i< m[0].length; i++){
            soma = 0;
            for (int j=0; j< m.length; j++) {
                soma += m[j][i];
            }
            mediaAtual = soma / m.length;
            if(mediaAtual == mediaMax) {
                System.out.printf("Elementos da coluna: ");
                    for (int l = 0; l < m.length; l++) {
                        System.out.printf("%d\t", m[l][i]);
                    }

            }
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