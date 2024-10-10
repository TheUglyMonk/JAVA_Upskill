package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {


        String[] funcionarios = new String[20];
        String[] salarios = new String[20];

        Scanner in=new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
        Formatter out= new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoOut.txt"));

        int nEl=0;
        int media = 0;

        while (in.hasNext()) {

            String linha;

            linha = in.next();
            String regex = "[,\\.\\s ]";
            String[] dados = linha.split(regex);

            funcionarios[nEl] = dados[0];
            salarios[nEl] = dados[1];
            media += Integer.parseInt(salarios[nEl]);
            nEl++;
        }

        media /= nEl;

        for(int i = 0; i < nEl; i++){
            if(Integer.parseInt(salarios[i]) > media)
                System.out.printf("%s \n", funcionarios[i]);
        }
    }
}