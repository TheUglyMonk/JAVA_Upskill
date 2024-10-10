package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3, aux;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os três números:");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n3 < n2) {
                aux = n3;
                n3 = n2;
                n2 = aux;
            }
        } else if (n2 < n1 && n2 < n3) {
            aux = n1;
            n1 = n2;
            n2 = aux;
            if (n3 < n2) {
                aux = n3;
                n3 = n2;
                n2 = aux;
            }
        } else {
            aux = n1;
            n1 = n3;
            n3 = aux;
            if (n3 < n2) {
                aux = n3;
                n3 = n2;
                n2 = aux;
            }
        }
        System.out.printf("%d %d %d", n1, n2, n3);
    }
}