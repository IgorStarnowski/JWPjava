package wejsciowka01;

import java.util.Scanner;

public class KalkulatorDniTygonia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj numer dnia: ");
        int day = s.nextInt();
        String dzien = switch (day) {
            case 1 ->"Poniedziałek";
            case 2 ->"Wtorek";
            case 3 ->"Środa";
            case 4 ->"Czwartek";
            case 5 ->"Piątek";
            case 6 ->"Sobota";
            case 7 ->"Niedziela";
            default ->"Niepoprawny numer dnia";
        };
        System.out.println(dzien);
        s.close();
    }
}
