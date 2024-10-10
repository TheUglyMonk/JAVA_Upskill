package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int N, num, res;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Insira o número de valores a introduzir: ");
            N = ler.nextInt();
        } while(N <= 0);

        for(int i = 1; i <= N; i++){
            res = 1;
            do {
                System.out.printf("Insira o fatorial a calcular: ");
                num = ler.nextInt();
            } while(num <= 0);
            while(num > 0){
                res *= num;
                num--;
            }
            System.out.printf("O resultado do %dº factorial é: %d\n", i, res);
        }
    }
}