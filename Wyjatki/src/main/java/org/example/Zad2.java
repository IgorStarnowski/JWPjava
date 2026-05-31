package org.example;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int licznik = 0;

        System.out.println("Wprowadź 5 liczb całkowitych (błędy zostaną zignorowane):");

        while (licznik < 5) {
            String input = scanner.next();
            try {
                int liczba = Integer.parseInt(input);
                suma += liczba;
                licznik++;
            } catch (NumberFormatException e) {
                System.out.println("Zignorowano (to nie jest liczba całkowita): " + input);
            }
        }
        System.out.println("Suma 5 poprawnych liczb wynosi: " + suma);
    }
}
