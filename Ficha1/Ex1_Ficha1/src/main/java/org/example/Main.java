package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dig1, dig2, dig3, num;
        Scanner ler = new Scanner(System.in);

        do{
            num = ler.nextInt();
        }while (num<100 || num>999);

        dig1 = num % 10;
        num /= 10;
        dig2 = num % 10;
        num /= 10;
        dig3 = num % 10;
        num /= 10;

        System.out.println(dig3 + " " + dig2 + " " + dig1);
        if(dig1 % 2 == 0)
            System.out.println("Número par.");
        else
            System.out.println("Número impar.");
    }
}