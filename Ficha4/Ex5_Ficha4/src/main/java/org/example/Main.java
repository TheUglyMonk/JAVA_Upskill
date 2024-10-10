package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;
        Scanner  ler = new Scanner(System.in);

            System.out.printf("Introduza o comprimento dos lados do triangulo:\n");
            System.out.printf("a = ");
            a = ler.nextDouble();
            System.out.printf("b = ");
            b = ler.nextDouble();
            System.out.printf("c = ");
            c = ler.nextDouble();
        if ( a + b < c || a + c < b || c + b < a )
            System.out.printf("Impossível formar um triângulo com os valores introduzidos.\n");
        else {
            System.out.printf("Ângulo (a,b) = %.2fº\n", angulo(a,b,c,"ab"));
            System.out.printf("Ângulo (a,c) = %.2fº\n", angulo(a,b,c,"ac"));
            System.out.printf("Ângulo (b,c) = %.2fº\n", angulo(a,b,c,"bc"));
        }
    }

    public static double angulo(double a, double b, double c, String ang){

        double angulo;

        if(ang == "ab")
            angulo = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)));
        else if (ang == "ac")
            angulo = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c)));
        else
            angulo = Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*c*b)));

        return(angulo);
    }
}