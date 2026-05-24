package Lab01;

public class ZLab01 {
    public static void main(String[] args) {
        System.out.println("Kody liczbowe (48-124) i odpowiadajace im znaki ASCII:");
        System.out.println("------------------------------------------------------");

        for (int i = 48; i <= 124; i++) {
            char znak = (char) i;
            System.out.println("Kod: " + i + " \t-> Znak: " + znak);
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Wyswietlenie napisu za pomoca kodow ASCII (slowo: KOT):");
        System.out.print((char) 75);
        System.out.print((char) 79);
        System.out.println((char) 84);
    }
}
