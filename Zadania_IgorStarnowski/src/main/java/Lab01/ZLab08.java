package Lab01;
import java.util.Scanner;
public class ZLab08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Obliczanie dlugosci przeciwprostokatnej ---");
        System.out.print("Podaj dlugosc pierwszej przyprostokatnej (a): ");
        if (!input.hasNextDouble()) {
            System.out.println("Blad: Wprowadzono nieprawidlowa wartosc.");
            return;
        }
        double a = input.nextDouble();
        System.out.print("Podaj dlugosc drugiej przyprostokatnej (b): ");
        if (!input.hasNextDouble()) {
            System.out.println("Blad: Wprowadzono nieprawidlowa wartosc.");
            return;
        }
        double b = input.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.println("Blad: Dlugosci bokow musza byc wieksze od zera!");
        } else {
            double c = Math.sqrt(a * a + b * b);
            System.out.printf("Dlugosc przeciwprostokatnej wynosi: %.3f%n", c);
        }
        input.close();
    }
}
