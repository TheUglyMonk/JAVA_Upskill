package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < 100 && !testCapicua(num) ; i++){
            System.out.printf("Insere o valor a testar:");
            num = ler.nextInt();
        }
        if(testCapicua(num))
            System.out.printf("O número %d é capicua!", num);
        else
            System.out.printf("Não foram encontradas capicuas!");

    }

    public static boolean testCapicua(int num){
        int aux = num, num1 = 0, dig;

        while (aux != 0){
            dig = aux % 10;
            aux /= 10;
            num1 = (num1 * 10) + dig;
        }
        return (num == num1);
    }
}