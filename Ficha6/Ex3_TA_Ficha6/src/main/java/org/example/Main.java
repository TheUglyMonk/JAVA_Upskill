package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {


        int[][] matriz = new int[4][5];

        inserirElementos(matriz);
        listarMatrizVazio(matriz);
    }
    public static void inserirElementos(int[ ][] m) {

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                System.out.printf ("[%d,%d]=",i+1,j+1);
                m[i][j]=ler.nextInt();
            }
        }
    }

    public static void listarMatrizVazio( int[ ][ ] m) {
        System.out.printf("Listagem da matriz\n");

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++){
                if(i == 0 || j == 0 || i == m.length - 1 || j == m[i].length - 1)
                    System.out.printf("%d\t",m[i][j]);
                else
                    System.out.printf(" \t");
            }
            System.out.printf("\n");
        }
    }
}