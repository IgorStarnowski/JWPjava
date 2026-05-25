package ZadaniaYouTube;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        String newline = System.lineSeparator();
        System.out.println("WZORY MATEMATYCZNE:");
        System.out.println("Wybierz wzór:" + newline + "1) Obwód kwadratu" + newline + "2) Obwód prostokąta" + newline + "3) Pole prostokąta");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód: ");
            int sideLength = sc.nextInt();
            System.out.println("Obwód kwadratu to: " + (4 * sideLength));
        } else if (option == 2) {
            System.out.print("Podaj długość boku A prostokąta: ");
            int sideLengthA = sc.nextInt();
            System.out.print("Podaj długość boku B prostokąta: ");
            int sideLengthB = sc.nextInt();
            System.out.println("Obwód prostokąta: " + (2 * sideLengthA + 2 * sideLengthB));
        } else if (option == 3) {
            System.out.print("Podaj długość boku A prostokąta: ");
            double sideLengthAA = sc.nextDouble();
            System.out.print("Podaj długość boku B prostokąta: ");
            int sideLengthBB = sc.nextInt();
            System.out.println("Pole prostokąta: " + (sideLengthAA * sideLengthBB));
        } else {
            System.out.println("Brak takiej opcji");
        }
    }
}
//nie dowiedziałem się nic nowego, wiem jak działa instrukcja warunkowa