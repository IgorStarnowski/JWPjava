package Lab01;
import java.util.Scanner;
public class ZLab09 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3";
        Scanner input = new Scanner(s);
        String imie = input.next();
        String nazwisko = input.next();
        int godziny = input.nextInt();
        double stawka = input.nextDouble();
        System.out.printf("%s %s %.2f\n", nazwisko, imie, godziny * stawka);
        input.close();
    }
}
