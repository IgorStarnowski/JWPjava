package ZadaniaYouTube;

public class Zad6 {
    public static void main(String[] args) {

        int a = 3;
        System.out.println("A:" + a);

        int b = 3;
        System.out.println("B:" + b);

        System.out.println("A == B:" + (a==b));

        Integer aVar = 127;
        System.out.println("A:" + aVar);

        Integer bVar = Integer.valueOf(127);
        System.out.println("B:" + bVar);

        System.out.println("A == B:" + (aVar.equals(bVar)));

        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        System.out.println("s1 == s2" + (s1 == s2));
        System.out.println("s1 == s3" + (s1 == s3));
        System.out.println("s1 == s3" + (s3.equals(s1)));
    }
}
//== porównuje adresy w pamięci a equals()  porównuje wartości
//tworzenie zmiennych z new powoduje rozbieżności przez to że trafiają one do string poola