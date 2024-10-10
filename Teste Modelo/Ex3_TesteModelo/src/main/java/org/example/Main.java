package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {

        Scanner in=new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
        Formatter out= new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\Out.txt"));

        String[] produtos = new String[100];
        String[][] cidade = new String[100][100];
        String[][] stock = new String[100][100];
        int nLine = 0;

        while (in.hasNext()){
            String linha = in.nextLine();
            String[] dados = linha.split(",");
            produtos[nLine] = dados[0];
            int aux1, aux2, aux3;
            int cidCont = 0;

            for(int i = 1; i < dados.length && cidCont < 100; i+=4){
                cidade[nLine][cidCont] = dados[i];
                aux1 = Integer.valueOf(dados[i+1]);
                aux2 = Integer.valueOf(dados[i+2]);
                aux3 = Integer.valueOf(dados[i+3]);

                if(aux1 > aux2 && aux1 > aux3)                  // 1º número é o maior
                        stock[nLine][cidCont] = dados[i+1];
                else if(aux2 > aux3 && aux2 > aux1)             // 2º número é o maior
                    stock[nLine][cidCont] = dados[i+2];
                else                                            // 3º número é o maior
                    stock[nLine][cidCont] = dados[i+3];
                cidCont++;

            }
            nLine++;
        }
        for(int i = 0; i < nLine; i++){
            out.format("%s,", produtos[i]);
            for(int j = 0; cidade[i][j] != null ; j++){
                out.format("%s:%s", cidade[i][j].trim(), stock[i][j].trim());
                if(cidade[i][j+1] != null)
                    out.format(",");
            }
            out.format("%n");
        }
        out.close();
        in.close();
    }
}