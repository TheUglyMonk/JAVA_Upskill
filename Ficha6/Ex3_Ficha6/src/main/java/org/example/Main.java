package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];
        int[][] res;

        inserirElementos(matriz);
        listarMatriz(matriz);

        res=resu(matriz);
        //listarMatriz(res);

    }

    public static int[][] resu(int[][] m){

        int[][] r = new int[2][12];
        int pos = 0;
        boolean flag = false;

        for (int i=0; i< m.length; i++){
            for (int j=0; j< m[i].length; j++) {
                for (int k=0; k< r[0].length; k++) {
                    if(r[0][k] == m[i][j]) {
                        r[1][k]++;
                        flag = true;
                    }
                }
                if(!flag){
                    r[1][pos] = 1;
                    r[0][pos] = m[i][j];
                    pos ++;
                }
                flag = false;
            }
        }
        for (int i=0; i< r.length; i++) {
            for (int j = 0; j < pos + 1; j++) {
                System.out.printf("%d\t", r[i][j]);
            }
            System.out.printf("\n");
        }
        return r;
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