package wejsciowka01;
import java.util.Scanner;
public class RokPrzestepny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        int rok = input.nextInt();
        if(rok % 4 == 0 && rok % 100 != 0){
            System.out.println("Rok jest przestępny");
        } else if (rok % 400 == 0) {
            System.out.println("Rok jest przestępny");
        } else {
            System.out.println("Rok nie jest przestępny");
        }
        input.close();
    }
}
