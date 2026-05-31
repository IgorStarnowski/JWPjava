package org.example;

import java.util.List;
import java.util.Random;

abstract class Osoba{
    private String nazwisko;

    public Osoba(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Osoba() {
        this.nazwisko = "Domyślne";
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public abstract String getOpis();
}

class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, String kierunek) {
        super(nazwisko);
        this.kierunek = kierunek;
    }

    public Student(String kierunek) {
        super();
        this.kierunek = kierunek;
    }

    public Student() {
        super();
        this.kierunek = "Nieznany kierunek";
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }
    @Override
    public String getOpis() {
        return kierunek;
    }
}

class Pracownik extends Osoba{
    private double pensja;
    private int id;
    private static int nastepnyId;

    private static void przyznajId(Pracownik p) {
        p.id = nastepnyId++;
    }

    static {
        Random rand = new Random();
        nastepnyId = rand.nextInt(100);
    }

    { przyznajId(this); }

    public Pracownik(String nazwisko, double pensja) {
        super(nazwisko);
        this.pensja = pensja;
    }

    public Pracownik() {
        super();
        this.pensja = 0;
    }

    public Pracownik(double pensja) {
        super();
        this.pensja = pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    public int getId() {
        return id;
    }

    public static int getNastepnyId() {
        return nastepnyId;
    }

    public void podniesPensje(int procent) {
        this.pensja *= ((100 + procent) / 100.0);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public String getOpis() {
        return "" + this.getPensja();
    }
}

class Menadzer extends Pracownik{
    private double bonus;

    public Menadzer(String nazwisko, double pensja) {
        super(nazwisko,pensja);
        this.bonus = 0.0;
    }

    public Menadzer(double pensja) {
        super(pensja);
        this.bonus = 0.0;
    }

    public Menadzer() {
        super();
        this.bonus = 0.0;
    }

    public double getBonus() {
        return bonus;
    }

    public void zmienBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double getPensja(){
        return super.getPensja() + this.bonus;
    }
}


public class TestPracownik {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[9];

        osoby[0] = new Student();
        osoby[1] = new Student("Architektura");
        osoby[2] = new Student("Kowalski", "Informatyka stosowana");

        osoby[3] = new Pracownik();
        osoby[4] = new Pracownik(4000.30);
        osoby[5] = new Pracownik("Nowak", 6000.00);

        osoby[6] = new Menadzer();
        osoby[7] = new Menadzer(10000.00);
        osoby[8] = new Menadzer("Nowak", 3500.00);

        System.out.println("--- PRZETWARZANIE TABLICY POLIMORFICZNEJ ---\n");

        for (Osoba osoba : osoby) {
            System.out.println("Typ: " + osoba.getClass().getSimpleName());
            System.out.println("Nazwisko: " + osoba.getNazwisko());
            System.out.println("Opis z getOpis(): " + osoba.getOpis());

            if (osoba instanceof Student) {
                Student s = (Student) osoba;
                System.out.println("[Akcja Studenta] Odczyt kierunku: " + s.getKierunek());
            }

            if (osoba instanceof Pracownik) {
                Pracownik p = (Pracownik) osoba;
                p.podniesPensje(5);
                System.out.println("[Akcja Pracownika] ID: " + p.getId() + " | Przyznano podwyżkę 5%. Nowa baza: " + p.getPensja());
            }

            if (osoba instanceof Menadzer) {
                Menadzer m = (Menadzer) osoba;
                m.zmienBonus(1500);
                System.out.println("[Akcja Menadżera] Przypisano bonus w wysokości: " + m.getBonus());
                System.out.println("[Akcja Menadżera] Całkowita pensja z bonusem: " + m.getPensja());
            }
        }
    }
}