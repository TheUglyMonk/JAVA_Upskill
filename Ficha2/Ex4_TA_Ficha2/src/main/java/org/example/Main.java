package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contFUNC = 0;
        double salario, horasExtra, soma = 0, salarioTotal;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.printf("Inserir horas extras feitas:");
            horasExtra = ler.nextDouble();
        } while ( horasExtra<0 && horasExtra!= -1);

        if( horasExtra == -1)
            System.out.printf("Não form lidos valores.");
        else {
            while (horasExtra != -1){
                do {
                    System.out.printf("Inserir o salário: ");
                    salario = ler.nextDouble();
                } while (salario <= 0);
                System.out.printf("Salário mensal: %.2f\n", horasExtra*(0.02*salario)+salario);
                soma += horasExtra*(0.02*salario)+salario;
                contFUNC++;
                do {
                    System.out.printf("Inserir horas extras feitas:");
                    horasExtra = ler.nextDouble();
                } while ( horasExtra<0 && horasExtra!= -1);
            }
        }
        if (contFUNC > 0)
            System.out.printf("A média dos salários é:  %.2f", soma/contFUNC);
    }
}