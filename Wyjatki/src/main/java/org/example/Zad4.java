package org.example;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą (do obliczenia odwrotności): ");
        String s = scanner.next();

        try {
            int n = Integer.parseInt(s);
            if (n == 0) {
                throw new ArithmeticException("Nie istnieje odwrotność liczby 0.");
            }
            double odwrotnosc = 1.0 / n;
            System.out.println("Odwrotność wynosi: " + odwrotnosc);

        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba całkowita: " + s);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
