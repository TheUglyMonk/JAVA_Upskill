package org.example;



public class Main {
    public static void main(String[] args) {

        for(int y = 1; y <= 10000; y++){
            if(perfeito(y))
                System.out.printf("O número %d é perfeito.\n", y);
        }
    }

    public static boolean perfeito(int y){
        int somaDiv = 0;
        for (int x = 1; x <= (y/2); x++) {
            if (y % x == 0) {
                somaDiv = somaDiv + x;
            }
        }
        if (y == somaDiv)
            return(true);
        else
            return(false);
    }
}

