package ZadaniaYouTube;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        String newline = System.lineSeparator();
        System.out.println("WZORY MATEMATYCZNE:");
        System.out.println("Wybierz wzór:" + newline + "1 lub 6) Obwód kwadratu" + newline + "2) Obwód prostokąta" + newline + "3) Pole prostokąta");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        String result = switch (option) {
            case 1, 6 -> {
                System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód: ");
                int sideLength = sc.nextInt();
                System.out.println("Obwód kwadratu to: " + (4 * sideLength));
                yield "Wybrałeś opcję: " + option;
            }
            case 2 -> {
                System.out.print("Podaj długość boku A prostokąta: ");
                int sideLengthA = sc.nextInt();
                System.out.print("Podaj długość boku B prostokąta: ");
                int sideLengthB = sc.nextInt();
                System.out.println("Obwód prostokąta: " + (2 * sideLengthA + 2 * sideLengthB));
                yield "Wybrałeś opcję: " + option;
            }
            case 3 -> {
                System.out.print("Podaj długość boku A prostokąta: ");
                double sideLengthAA = sc.nextDouble();
                System.out.print("Podaj długość boku B prostokąta: ");
                int sideLengthBB = sc.nextInt();
                System.out.println("Pole prostokąta: " + (sideLengthAA * sideLengthBB));
                yield "Wybrałeś opcję: " + option;
            }
            default -> {
                System.out.println("Brak takiej opcji!!!");
                yield "Brak opcji!";
            }
        };
    }
}
//dowiedziałem się jak stosować instrukcję switch case, poznałem różne składnie tej instrukcji