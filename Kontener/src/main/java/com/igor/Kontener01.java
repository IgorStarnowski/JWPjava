package com.igor;

import java.util.Arrays;

public class Kontener01 {
    private int[] tab;

    public Kontener01(int rozmiar) {
        this.tab = new int[rozmiar];
    }

    public int get(int index) {
        if (index < 0 || index >= tab.length) {
            throw new IndexOutOfBoundsException("Indeks poza zakresem tablicy: " + index);
        }
        return tab[index];
    }

    public void set(int index, int value) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Indeks nie może być mniejszy od 0: " + index);
        }
        if (index >= tab.length) {
            resize(index + 1);
        }
        tab[index] = value;
    }

    private void resize(int size) {
        int[] nowaTab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            nowaTab[i] = tab[i];
        }
        this.tab = nowaTab;
    }

    public static void main(String[] args) {
        System.out.println("--- Test Kontener01 ---");
        Kontener01 k1 = new Kontener01(3);

        k1.set(0, 10);
        k1.set(1, 20);
        k1.set(2, 30);

        System.out.println("Element na indeksie 1: " + k1.get(1));

        k1.set(5, 100);
        System.out.println("Element na indeksie 5 po resize: " + k1.get(5));
        System.out.println("Element na indeksie 4 (domyślny): " + k1.get(4));

        System.out.print("Zawartość wewnętrznej tablicy k1: ");
        for (int i : k1.tab) {
            System.out.print(i + " ");
        }
        System.out.println();

        try {
            k1.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Złapano oczekiwany wyjątek: " + e.getMessage());
        }
    }
}