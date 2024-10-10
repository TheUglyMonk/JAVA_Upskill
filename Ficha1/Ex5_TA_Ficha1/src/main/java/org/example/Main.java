package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;
        Scanner ler=new Scanner(System.in);

        System.out.printf("Insira o 1º valor: ");
        x = ler.nextInt();

        do{
            System.out.printf("Insira o 2º valor: ");
            y = ler.nextInt();
        } while(y == x);

        if(x % y == 0)
            System.out.printf("%d é múltiplo de %d.", x, y);
        else if(y % x == 0)
            System.out.printf("%d é múltiplo de %d.", y, x);
        else
            System.out.printf("%d não é múltiplo nem divisor de %d.", x, y);
    }
}