package org.example;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą (do odwrotności bez wyjątków): ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("Nie istnieje odwrotność liczby 0.");
            } else {
                System.out.println("Odwrotność wynosi: " + (1.0 / n));
            }
        } else {
            String s = scanner.next();
            System.out.println("To nie jest liczba całkowita: " + s);
        }
    }
}
