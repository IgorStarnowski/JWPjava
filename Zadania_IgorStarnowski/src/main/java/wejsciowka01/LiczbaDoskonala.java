package wejsciowka01;

import java.util.Scanner;

public class LiczbaDoskonala {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą do sprawdzenia: ");
        int n = in.nextInt();
        int suma = 0;
        for(int i = 1; i <n; i++){
            if(n%i == 0){
                suma += i;
            }
        }
        if ( suma == n){
            System.out.println("Liczba jest doskonała");
        }else{
            System.out.println("Liczba nie jest doskonała");
        }
    }
}
