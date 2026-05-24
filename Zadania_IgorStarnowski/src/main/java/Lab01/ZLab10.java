package Lab01;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ZLab10 {
    public static void main(String[] args) throws IOException {
        File f = new File("dane.txt");
        Scanner input = new Scanner(f);
        System.out.println("--- Lista płac ---");
        while (input.hasNext()) {
            String imie = input.next();
            String nazwisko = input.next();
            int godziny = input.nextInt();
            double stawka = input.nextDouble();
            double wyplata = godziny * stawka;
            System.out.printf("Pracownik: %s %s | Wynagrodzenie: %.2f%n", nazwisko, imie, wyplata);
        }
        input.close();
    }
}
