package org.example;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double soma;

        if (isTriangle(A, B, C)){
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);
        }

        else {
            System.out.println("Area = " + (Double.sum(A, B) * C) / 2);
        }
    }
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }


}
