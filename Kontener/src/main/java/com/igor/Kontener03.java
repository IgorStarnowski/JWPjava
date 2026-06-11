package com.igor;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Kontener03 implements Iterable<Object> {
    private Object[] tab;

    public Kontener03(int rozmiar) {
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
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < tab.length;
            }

            @Override
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Brak kolejnych elementów w kontenerze.");
                }
                return tab[position++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operacja usuwania nie jest wspierana.");
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("\n--- Test Kontener03 z użyciem Iteratora ---");
        Kontener03 k3 = new Kontener03(4);

        k3.set(0, "Poniedziałek");
        k3.set(1, "Wtorek");
        k3.set(2, "Środa");
        k3.set(3, "Czwartek");

        System.out.println("Przeglądanie kontenera pętlą foreach:");
        for (Object element : k3) {
            System.out.println("- " + element);
        }
    }
}
