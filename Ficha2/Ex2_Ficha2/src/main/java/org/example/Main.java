package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota, somaNeg = 0;
        double N, nPos = 0, nNeg = 0;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Introduz o número de alunos: \n");
            N = ler.nextInt();
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            do {
                System.out.printf("Introduz a nota do %dº aluno: \n", i);
                nota = ler.nextInt();
            } while (nota < 0 || nota > 20);
            if (nota >= 10)
                nPos++;
            else {
                somaNeg += nota;
                nNeg++;
            }
        }
        if (nNeg > 0)
            System.out.printf("A média de notas negativas é %.2f valores. \n", somaNeg / nNeg);
        else
            System.out.printf("Não há notas negativas.\n");

        System.out.printf("A percentagem de positivas é %.2f%%.\n", (nPos * 100) / N);

    }
}