package org.example;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int licznik = 0;

        System.out.println("Wprowadź 5 liczb całkowitych (sposób ze Scannerem):");

        while (licznik < 5) {
            if (scanner.hasNextInt()) {
                suma += scanner.nextInt();
                licznik++;
            } else {
                String blednyToken = scanner.next();
                System.out.println("Zignorowano (to nie jest liczba całkowita): " + blednyToken);
            }
        }
        System.out.println("Suma 5 poprawnych liczb wynosi: " + suma);
    }
}
