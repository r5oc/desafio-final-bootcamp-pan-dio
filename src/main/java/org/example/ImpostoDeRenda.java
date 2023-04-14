package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.00;
        double diferenca;

        if (renda > 4500.00){
            imposto = 1000.00 * 0.080 + 1500.00 * 0.18;
            diferenca = renda - 4500;
            imposto += diferenca * 0.28;
        }

        else if (renda > 3000){
            imposto = 1000 * 0.08;
            diferenca = renda - 3000;
            imposto += diferenca * 0.18;
        }

        else if (renda > 2000){
            diferenca = renda - 2000;
            imposto = diferenca * 0.08;
        }

        if (renda <= 2000) {
            System.out.println("Isento");
        }
        else{
            System.out.println(String.format("R$ %.2f%n", imposto));
        }
    }
}
