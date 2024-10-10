package org.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];

        inserirElementos(matriz);
        listarMatriz(matriz);
        linhasPares(matriz);
    }

    public static void linhasPares (int[][] m){

        int contPar, maxPar = 0;

        for(int i = 0; i < m.length; i++){
            contPar = 0;
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] % 2 == 0)
                    contPar++;
            }
            if (contPar > maxPar)
                maxPar = contPar;
        }

        for(int i = 0; i < m.length; i++){
            contPar = 0;
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] % 2 == 0)
                    contPar++;
            }
            if (contPar == maxPar)
                System.out.printf("A linha %d tem o maior nùmero de pares.\n", i+1);
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