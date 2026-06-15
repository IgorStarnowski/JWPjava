package JCFApi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Piosenki {

    // ---KOD Z ZADANIA 3---
    /*
    static class ArtystaCompare implements Comparator<Piosenka> {
        @Override
        public int compare(Piosenka p1, Piosenka p2) {
            return p1.getArtysta().compareTo(p2.getArtysta());
        }
    }
    */

    public static void main(String[] args) {
        /*
           ZADANIE 1
        ArrayList<String> tytulyZad1 = new ArrayList<>();
        try {
            Scanner skaner1 = new Scanner(new File("ListaPiosenek.txt"));
            while (skaner1.hasNextLine()) {
                String[] dane = skaner1.nextLine().split("/");
                if (dane.length > 0) tytulyZad1.add(dane[0].trim());
            }
            skaner1.close();
        } catch (FileNotFoundException e) { e.printStackTrace(); }
        Collections.sort(tytulyZad1);
        System.out.println(tytulyZad1);
        */

        /*
            ZADANIE 2
        ArrayList<Piosenka> listaZad2 = new ArrayList<>();
        try {
            Scanner skaner2 = new Scanner(new File("ListaPiosenek.txt"));
            while (skaner2.hasNextLine()) {
                String[] dane = skaner2.nextLine().split("/");
                if (dane.length == 4) {
                    listaZad2.add(new Piosenka(dane[0].trim(), dane[1].trim(), dane[2].trim(), dane[3].trim()));
                }
            }
            skaner2.close();
        } catch (FileNotFoundException e) { e.printStackTrace(); }
        Collections.sort(listaZad2);
        System.out.println(listaZad2);
        */
        /*
        ZADANIE 3
        ArrayList<Piosenka> listaZad3 = new ArrayList<>(listaZad2); // Wykorzystanie wczytanej listy
        Collections.sort(listaZad3, new ArtystaCompare());
        System.out.println(listaZad3);
        */
        /*
        ZADANIE 4
        ArrayList<Piosenka> listaZad4 = new ArrayList<>();
        try {
            Scanner skaner4 = new Scanner(new File("PelnaListaPiosenek.txt"));
            while (skaner4.hasNextLine()) {
                String[] dane = skaner4.nextLine().split("/");
                if (dane.length == 4) {
                    listaZad4.add(new Piosenka(dane[0].trim(), dane[1].trim(), dane[2].trim(), dane[3].trim()));
                }
            }
            skaner4.close();
        } catch (FileNotFoundException e) { e.printStackTrace(); }

        HashSet<Piosenka> zbiorHashSet = new HashSet<>();
        zbiorHashSet.addAll(listaZad4);
        System.out.println(zbiorHashSet);
        */
        //ZADANIE 5
        ArrayList<Piosenka> wczytanaLista = new ArrayList<>();
        try {
            File plik = new File("PelnaListaPiosenek.txt");
            Scanner skaner = new Scanner(plik);
            while (skaner.hasNextLine()) {
                String[] dane = skaner.nextLine().split("/");
                if (dane.length == 4) {
                    wczytanaLista.add(new Piosenka(dane[0].trim(), dane[1].trim(), dane[2].trim(), dane[3].trim()));
                }
            }
            skaner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pliku z piosenkami!");
            return;
        }

        TreeSet<Piosenka> drzewoPiosenek = new TreeSet<>();
        drzewoPiosenek.addAll(wczytanaLista);

        System.out.println("--- ZADANIE 5: TreeSet (Brak duplikatów i ułożone po tytule) ---");
        for (Piosenka p : drzewoPiosenek) {
            System.out.println(p);
        }
    }
}