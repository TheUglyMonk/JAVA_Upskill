package org.example;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomes = new String[20];
        double[] vencimentos = new double[20];

        nomes = lerNomes(vencimentos);

        for(int i = 0; i < nomes.length && nomes[i] != null; i++)
            System.out.printf("%s %.2f$\n", nomes[i], vencimentos[i]);

        double percentagemMenor = perc(vencimentos);
        System.out.printf("A percentagem é: %.2f%%.", percentagemMenor);
    }

    public static String[] lerNomes(double[] venc){

        String[] nms = new String[20];
        String aux;
        int i = 0;
        System.out.printf("Insira nome:");
        aux = ler.next();




        while (aux.compareToIgnoreCase("fim") != 0 && i < 20) {
            nms[i] = aux;
            do {
                System.out.printf("Insira o vencimento:");
                venc[i] = ler.nextDouble();
            } while (venc[i] <= 0);
            i++;
            System.out.printf("Insira nome:");
            aux = ler.next();
        }

        return (nms);
    }

    public static double perc(double[] v){

        double valor;
        int count = 0;
        int i;

        do {
            System.out.printf("Insira o valor:");
            valor = ler.nextDouble();
        } while (valor <= 0);

        for (i = 0; i < v.length && v[i] != 0; i++){ //falta null
            if(valor > v[i]){
                count++;
            }
        }

        return (((double)count/i)*100);
    }
}