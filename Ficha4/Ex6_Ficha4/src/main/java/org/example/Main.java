package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N, num;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.printf("Insere o número de valores: ");
            N = ler.nextInt();
        } while (N <= 0);

        for(int i = 0; i < N; i++){
            System.out.printf("Introduza o primeiro valor: ");
            num = ler.nextInt();
            System.out.printf("O quociente de persistência de %d é %d.\n", num, qPers(num));
        }
    }
    public static int qPers(int num){

        int cont = 0, produto, aux;

        if( num < 0)
            num*= -1;

        while (String.valueOf(num).length() > 1){

            produto = 1;
            aux = num;
             do{
                 produto *= (aux % 10);
                 aux /= 10;
             } while ( aux > 0);
             num = produto;
             cont++;
             System.out.printf("%d\n", num);
        }
        return (cont);
    }
}