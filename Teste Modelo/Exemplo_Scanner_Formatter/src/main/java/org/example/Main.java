package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
    String [ ]vec=new String[10];
    Scanner in=new Scanner(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoIn.txt"));
    Formatter out= new Formatter(new File("C:\\Users\\lomba\\Desktop\\UPSKILL\\Teste Modelo\\TextoOut.txt"));
    int nEl=0;
    while (in.hasNext()) {
        vec[nEl]=in.nextLine(); nEl++;}
    String x;
    /*for(int i=0;i<nEl-1;i++)
        for(int j=i+1;j<nEl;j++)
            if(vec[i].compareTo(vec[j])>0)
            {
                x=vec[i]; vec[i]=vec[j]; vec[j]=x;
            }*/
    //out.format("%s","Listagem Ordenada");
    for(int i=0;i<nEl;i++)
        out.format("%s\n", vec[i]);
    out.close();
}

}