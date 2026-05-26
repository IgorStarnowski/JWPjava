import java.util.Scanner;

public class Liczba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę do sprawdzenia: ");
        int liczba = sc.nextInt();
        int suma = 0;
        for (int i = 1; i < liczba; i++){
            if (liczba % i == 0) {
                suma += i;
            }
        }
        if(suma == liczba) System.out.println("Liczba jest doskonała");
        else System.out.println("Liczba nie jest doskonala");
        sc.close();
    }
}
