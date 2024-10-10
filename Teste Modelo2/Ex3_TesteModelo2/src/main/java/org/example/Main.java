package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
        Formatter out= new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\Out.txt"));

        String[][] melhores = new String[100][30];
        int contLinhas = 0;

        while (in.hasNext()){

            String line = in.nextLine();
            String[] dados = line.split(",");

            int melhorNota = -1;


            melhores[contLinhas][0] = dados[0]; // Adiciona a disciplina

            for(int i = 2; i < dados.length; i+=2){
                if(melhorNota < Integer.valueOf(dados[i]))
                    melhorNota = Integer.valueOf(dados[i]);
            }
            int j = 1;
            for(int i = 2; i< dados.length; i+=2){

                if(melhorNota == Integer.valueOf(dados[i])){
                    melhores[contLinhas][j]=dados[i - 1];
                    melhores[contLinhas][j+1]=dados[i];
                    j+=2;
                }
            }
            contLinhas++;
        }

        for (int i = 0; i < contLinhas; i++){
            out.format("%s", melhores[i][0]);
            for (int j = 1; melhores[i][j] != null; j+=2){
                out.format("-%s-%s", melhores[i][j], melhores[i][j+1]);
            }
            out.format("%n");
        }
        out.close();
        in.close();
    }
}