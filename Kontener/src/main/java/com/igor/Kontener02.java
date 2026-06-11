package com.igor;

import java.util.Arrays;

public class Kontener02 {
    private Object[] tab;

    public Kontener02(int rozmiar) {
        this.tab = new Object[rozmiar];
    }

    public Object get(int index) {
        if (index < 0 || index >= tab.length) {
            throw new IndexOutOfBoundsException("Indeks poza zakresem: " + index);
        }
        return tab[index];
    }

    public void set(int index, Object value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks mniejszy od 0: " + index);
        }
        if (index >= tab.length) {
            resize(index + 1);
        }
        tab[index] = value;
    }

    private void resize(int size) {
        Object[] nowaTab = new Object[size];
        for (int i = 0; i < tab.length; i++) {
            nowaTab[i] = tab[i];
        }
        this.tab = nowaTab;
    }

    @Override
    public String toString() {
        return "Kontener02" + Arrays.toString(tab);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Kontener02 other = (Kontener02) obj;
        return Arrays.equals(this.tab, other.tab);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(tab);
    }

    public static void main(String[] args) {
        System.out.println("\n--- Test Kontener02 ---");
        Kontener02 k2 = new Kontener02(2);

        k2.set(0, "Java");
        k2.set(1, 125);
        k2.set(3, 45.67);

        System.out.println(k2.toString());

        String tekst = (String) k2.get(0);
        int liczba = (int) k2.get(1);
        System.out.println("Pobrany tekst: " + tekst);
        System.out.println("Pobrana liczba: " + liczba);

        System.out.print("Elementy tablicy obiektów: ");
        for (Object o : k2.tab) {
            System.out.print(o + " | ");
        }
        System.out.println();
    }
}