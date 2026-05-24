package Lab01;
import java.util.Scanner;
public class ZLab07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj temperature w stopniach Celsjusza (\u00B0C): ");
        if (input.hasNextDouble()) {
            double celsius = input.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("Wynik: %.1f\u00B0C = %.1f\u00B0F%n", celsius, fahrenheit);
        } else {
            System.out.println("Blad: Wprowadzono nieprawidlowa wartosc. Pamietaj o uzyciu przecinka!");
        }
        input.close();
    }
}
