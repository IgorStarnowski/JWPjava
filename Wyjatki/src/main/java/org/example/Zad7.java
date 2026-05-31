package org.example;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź działanie (np. 5 + 3, przedzielone spacjami):");

        try {
            int a = Integer.parseInt(scanner.next());
            String operacja = scanner.next();
            int b = Integer.parseInt(scanner.next());

            switch (operacja) {
                case "+":
                    System.out.println("Wynik: " + (a + b));
                    break;
                case "-":
                    System.out.println("Wynik: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik: " + (a * b));
                    break;
                case "/":
                    if (b == 0) throw new ArithmeticException("Dzielenie przez 0");
                    System.out.println("Wynik: " + (a / b));
                    break;
                default:
                    System.out.println("Nieobsługiwany znak operacji: " + operacja);
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd! Przynajmniej jeden z argumentów nie jest liczbą całkowitą.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        }
    }
}
