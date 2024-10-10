package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dia, mes, diasFalta, diasPassados = 0;
        boolean flag = true;
        Scanner ler = new Scanner(System.in);

            System.out.printf(("Insira a data no seguinte formato: dia mês\n"));
            dia = ler.nextInt();
            mes = ler.nextInt();

        switch (mes){
            case 1:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia;
                break;
            case 2:
                if(dia > 29 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 31;
                break;
            case 3:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 60;
                break;
            case 4:
                if(dia > 30 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 91;
                break;
            case 5:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 121;
                break;
            case 6:
                if(dia > 30 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 152;
                break;
            case 7:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 182;
                break;
            case 8:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 213;
                break;
            case 9:
                if(dia > 30 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 244;
                break;
            case 10:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 274;
                break;
            case 11:
                if(dia > 30 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 305;
                break;
            case 12:
                if(dia > 31 || dia <= 0){
                    flag = false;
                    break;
                }
                diasPassados = dia + 335;
                break;
            default:
                flag = false;
        }

        diasFalta = 366 - diasPassados;

        if(flag)
            System.out.printf("Faltam %d dias.", diasFalta);
        else
            System.out.printf(("Mês ou dia incorreto!\n"));
    }
}