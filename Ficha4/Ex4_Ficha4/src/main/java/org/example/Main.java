package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int soma = 0, num, cont = 0;
        double media;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Introduzir número:");
        num = ler.nextInt();

        while (num > 0)
        {
            soma += soma(num);
            cont++;
            System.out.printf("Introduzir número:");
            num = ler.nextInt();
        }
        if (cont != 0) {
            media = soma /cont;
            System.out.printf("Média: %f", media);
        }
        else
            System.out.printf("Valor introduzido é inválido!");
    }
    public static int soma(int numero){

        int cont = 1, soma = 0;

        while(cont <= numero){
            if(cont % 2 == 0 && numero % cont == 0)
                soma += cont;
            cont++;
        }
        return (soma);
    }
}