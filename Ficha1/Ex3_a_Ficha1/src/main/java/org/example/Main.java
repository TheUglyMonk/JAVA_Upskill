package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os três números:");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        if(n1 < n2 && n1 < n3) {
            System.out.println(n1);
            if (n2 < n3) {
                System.out.println(n2);
                System.out.println(n3);
            }
            else {
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        else if(n2 < n3 && n2 < n1){
            System.out.println(n2);
            if(n1 < n3) {
                System.out.println(n1);
                System.out.println(n3);
            }
            else {
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        else {
            System.out.println(n3);
            if (n1 < n2){
                System.out.println(n1);
                System.out.println(n2);
            }
            else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }
    }
}