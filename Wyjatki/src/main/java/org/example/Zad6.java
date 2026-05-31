package org.example;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Podaj liczbę całkowitą: ");
            int m = Integer.parseInt(scanner.next());
            System.out.print("Podaj liczbę całkowitą: ");
            int n = Integer.parseInt(scanner.next());

            System.out.printf("%d:%d = %d r. %d\n", m, n, m / n, m % n);

        } catch (NumberFormatException e) {
            System.out.println("Błąd! Wprowadzone dane nie są poprawnymi liczbami całkowitymi.");
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez 0");
        }
    }
}
