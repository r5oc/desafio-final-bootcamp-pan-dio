package org.example;

public class ContaEspacosEVogais {
    public static void main(String[] args) {
        String str = new java.util.Scanner(System.in).nextLine().toLowerCase();

        int espacos = str.split(" ").length - 1, vogais = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vogais++;

        }
        System.out.println("Espacos em branco: " + espacos + " Vogais: " + vogais);
    }
}
