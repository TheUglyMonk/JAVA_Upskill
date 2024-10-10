package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N, num;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.printf("Inserir o número de valores a introduzir: ");
            N = ler.nextInt();
        } while (N <= 0);

        for(int i = 0; i < N; i++){
            do {
                System.out.printf("Insira o primeiro valor:");
                num = ler.nextInt();
            } while (num <= 0);

            int soma = 0;
            for(int aux = num; aux != 0; aux/= 10){
                if ((aux%10)%2==0)
                    soma += (aux % 10);
            }
            System.out.printf("A soma do algarismos pares é: %d\n", soma);
        }
    }
}