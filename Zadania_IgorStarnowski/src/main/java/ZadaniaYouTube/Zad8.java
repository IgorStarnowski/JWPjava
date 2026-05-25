package ZadaniaYouTube;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args)
    {
        System.out.print("WZORY MATEMATYCZNE");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Podaj długość boku kwadratu aby wyliczyć jego obwód");
//        int sideLength = sc.nextInt();
//        System.out.print("Obwód kwadratu to: " + (4*sideLength));
//        System.out.print("Podaj długość boku A prostokąta");
//        int sideLengthA = sc.nextInt();
//        System.out.print("Podaj długość boku B prostokąta");
//        int sideLengthB = sc.nextInt();
//        System.out.print("Obwód prostokąta: " + (2 * sideLengthA * sideLengthB));
        System.out.print("Podaj długość boku A prostokąta");
        int sideLengthA = sc.nextInt();
        System.out.print("Podaj długość boku B prostokąta");
        int sideLengthB = sc.nextInt();
        System.out.print("Pole prostokąta: " + (sideLengthA * sideLengthB));
    }
}
//dowiedziałem się jak działa Scanner, zapoznałem się ze składnią