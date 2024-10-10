package org.example;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[5][4];
        int[] vetor = new int[20];
        int pos;

        inserirElementosMatriz(matriz);
        listarMatriz(matriz);

        if(ex2A(matriz) != 0)
            System.out.printf("A coluna com mais pares é %d.\n", ex2A(matriz));

        pos = ex2B(matriz,vetor);
        listarVetor(vetor,pos);
    }

    public static int ex2A(int[][] m){

        int cont, contMax = 0, pos = 0;

        for(int i = 0; i < m[0].length; i++){
            cont = 0;
            for(int j = 0; j < m.length; j++){
                if (m[j][i] % 2 == 0)
                    cont++;
            }
            if(cont >= contMax && cont != 0){
                contMax = cont;
                pos = i + 1;
            }
        }
        if(pos == 0) {
            System.out.printf("Não existem números pares na matriz!\n");
            return 0;
        }
        else
            return pos;
    }

    public static int ex2B(int[][] m, int v[]){

        int pos = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == 0){
                    v[pos] = 0;
                    pos++;
                }
            }
        }

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] < 0){
                    v[pos] = m[i][j];
                    pos++;
                }
            }
        }

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > 0){
                    v[pos] = m[i][j];
                    pos++;
                }
            }
        }
        return pos;
    }

    public static void inserirElementosMatriz(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d,%d]=", i + 1, j + 1);
                m[i][j] = ler.nextInt();
            }
        }
    }

    public static void listarMatriz(int[][] m){

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.printf("%d ", m[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void listarVetor(int[] v, int pos){

        for(int i = 0; i < pos ; i++){
            System.out.printf("%d ", v[i]);
        }
    }
}