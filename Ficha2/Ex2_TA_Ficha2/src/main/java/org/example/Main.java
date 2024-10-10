package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int max, min, num1, num2;

        do {
            System.out.printf("Introduz um valor: ");
            num1 = ler.nextInt();
            System.out.printf("Introduz outro valor: ");
            num2 = ler.nextInt();
        } while( num1==num2);

        if (num1>num2){
            max=num1;
            min=num2;
        }
        else {
            max=num2;
            min=num1;
        }
        while(min < max){
            if(min % 3 == 0 && min % 2 ==0)
                System.out.printf("Número: %d\n", min);
            min++;
        }
    }
}