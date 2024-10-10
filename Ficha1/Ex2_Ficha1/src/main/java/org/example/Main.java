package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int horaS, minS, horaD, minD, horaC, minC;
        int nextDay = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira hora e minutos de saída:");
        do{
            horaS = ler.nextInt();
            minS = ler.nextInt();
        } while (horaS>24 ||horaS < 0 || minS >= 60 || minS < 0);

        System.out.println("Insira hora e minutos de duração:");
        do{

            horaD = ler.nextInt();
            minD = ler.nextInt();
        } while (horaD < 0 || minD >= 60 || minD < 0);


        horaC = horaS + horaD;
        minC = minS + minD;

        if(minC >= 60){
            horaC += 1;
            minC -= 60;
        }
        while(horaC >= 24){
            horaC -= 24;
            nextDay++;
        }

        if(nextDay > 0)
            System.out.println("O comboio chega " + nextDay + " dia depois às " + horaC + "h" + minC +".");
        else
            System.out.println("O comboio chega no mesmo dia às " + horaC + "h" + minC +".");


    }
}