package org.example;

import java.util.Scanner;

public class Quitandas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        final double ateCincoQuilosDeMorango = 2.5d;
        final double maisDeCincoQuilosDeMorango = 2.2d;

        final double ateCincoQuilosDeMaca = 1.8d;
        final double maisDeCincoQuilosDeMaca = 1.5d;

        int kgFrutas = Integer.sum(morangos, macas);

        double totalMorango = 0d;
        double totalMacas = 0d;
        double valorTotal = 0d;

        if (macas > 5) {
            totalMorango = morangos * maisDeCincoQuilosDeMorango;
        }
        else {
            totalMorango = morangos * ateCincoQuilosDeMorango;
        }

        if (macas > 5) {
             totalMacas = macas * maisDeCincoQuilosDeMaca;
        }
        else {
            totalMacas = macas * ateCincoQuilosDeMaca;
        }

        valorTotal = Double.sum(totalMorango, totalMacas);

        if (kgFrutas > 8 || valorTotal > 25d){
            valorTotal = valorTotal - (valorTotal * 10) / 100;
        }

        System.out.println(valorTotal);
    }
}
