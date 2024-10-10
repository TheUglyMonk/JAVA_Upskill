package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int num;

        System.out.printf("Inserir número para converter: ");
        num = ler.nextInt();
        while (testOctal(num)){
            System.out.printf("%d > %d\n", num, convertToDec(num));
            System.out.printf("Inserir número para converter: ");

            num = ler.nextInt();
        }
    }

    public static boolean testOctal(int num){
        while(num != 0){
            int aux = num % 10;
            if (aux >= 8)
                return(false);
            num /= 10;
        }
        return(true);
    }

    public static int convertToDec(int num){
        int dec = 0;
        for(int i = 0; num != 0; i++){
            dec += Math.pow(8,i)*(num%10);
            num /= 10;
        }
        return (dec);
    }
}