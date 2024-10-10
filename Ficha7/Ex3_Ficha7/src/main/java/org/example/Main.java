package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
        Formatter out = new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoOut.txt"));
        Scanner ler = new Scanner(System.in);
        int nCar;

        do{
            System.out.printf("Insere o número de carateres: ");
            nCar = ler.nextInt();
        } while (nCar <= 0);

        while(in.hasNext()){
            String line = in.nextLine();
            String[] dados = line.split(" ");
            for(int i = 0; i < dados.length; i++){
                if(dados[i].length() != nCar)
                    out.format("%s ", dados[i]);
            }
            out.format("\n");
        }
        out.close();
    }
}