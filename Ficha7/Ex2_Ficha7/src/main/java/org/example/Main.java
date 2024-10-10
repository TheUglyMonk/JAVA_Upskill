package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in=new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
        Formatter out= new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoOut.txt"));
        Scanner ler = new Scanner(System.in);

        String[] alunos = new String[20];
        double[] notas = new double[20];
        int nAln = 0;
        double media = 0;

        do{
            System.out.printf("Insere o nome do aluno:");
            alunos[nAln] = ler.next();
            if (alunos[nAln].compareToIgnoreCase("fim") != 0){
                System.out.printf("Insere a nota do aluno:");
                notas[nAln] = ler.nextDouble();
                media += notas[nAln];
            }
            nAln++;
        } while ((alunos[nAln - 1].compareToIgnoreCase("fim") != 0) && nAln < 20);

        if(nAln == 0)
            System.out.printf("Não foram introduzidos alunos!");
        else{
            media /= nAln;
            out.format("Média: %.2f\n", media);
            for (int i = 0; i < nAln; i ++){
                if( notas[i] > media){
                    out.format("%s:%.2f\n", alunos[i], notas[i]);
                }
            }
            out.close();
        }
    }
}