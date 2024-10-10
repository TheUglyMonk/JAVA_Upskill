package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=0;
        String nomes[] = new String[100];
        Scanner ler = new Scanner(System.in);
        String nome;
        String m=" 1-Ler Nomes\n2-Elimina Nome\n3-Terminar\n\nEscolha uma opção:";
        char op;
        do {
            System.out.println(m);
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    n = lerNomes(nomes);
                    break;
                case '2':
                    System.out.printf("Nome:");
                    nome = ler.next();
                    n = enigma(nomes,nome,n);
                    break;
                case '3':
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '3');
    }

    private static int lerNomes(String[] nms) {
// Lê uma sequência de nomes terminada com a palavra FIM.
// Armazena os nomes em vec e retorna o número desses nomes.
        String aux;
        int i = 0;
        Scanner ler = new Scanner(System.in);

        System.out.printf("Insira nome:");
        aux = ler.next();

        while (aux.compareToIgnoreCase("fim") != 0 && i < 100) {
            nms[i] = aux;
            i++;
            System.out.printf("Insira nome:");
            aux = ler.next();
        }

        return (i);
    }
    private static int listar(String[] vec, int n) {
    // Apresenta os primeiros n elementos de vec
        int i;

        for(i = 1; i < n && vec[i] != null; i++){
            System.out.printf("%dº elemento: %s\n", i+1, vec[i]);
        }
        return i;
    }

    // Elimina um nome, dado pelo utilizador, do array
    private static int enigma(String[] nomes, String nome, int n)
    {
        int i=0;
        while (i<n && !nomes[i].equalsIgnoreCase(nome)) {
            i++;
        }
        if(i==n)
            return n;
        else{
            for (int j = i; j < n-1; j++)
                nomes[j]=nomes[j+1];
            return --n;
        }
    }
}