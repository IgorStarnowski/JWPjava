package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double liczba = 0;
        boolean poprawnie = false;
        do {
            try {
                System.out.print("Podaj liczbę zmiennoprzecinkową: ");
                liczba = sc.nextDouble();
                poprawnie = true;
            } catch (InputMismatchException e) {
                System.out.println("Błąd, wpisano złą liczbę");
                sc.next();
            }
        } while (!poprawnie);
        System.out.println("Wczytano poprawnie: " + liczba);
    }
}
