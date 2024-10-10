package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        inserirElementos(matriz);
        listarMatriz(matriz);

        System.out.printf("A média é %.2f.\n", mediaDiagonal(matriz));
        System.out.printf("A perentagem de pares é %.2f%%.", paresDiagonal(matriz));
    }


    public static double mediaDiagonal(int[][] m){

        double soma = 0;

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                if(i == j)
                    soma += m[i][j];
            }
        }
        return (soma/m.length);
    }

    public static double paresDiagonal(int[][] m){

        double soma = 0;

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                if(i == j)
                    if(m[i][j] % 2 == 0)
                        soma ++;
            }
        }
        return ((soma*100)/m.length);
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