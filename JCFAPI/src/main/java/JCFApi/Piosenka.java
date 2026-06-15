package JCFApi;

import java.util.Objects;

public class Piosenka implements Comparable<Piosenka> {
    private String tytul;
    private String artysta;
    private String ocena;
    private String bpm;

    public Piosenka(String tytul, String artysta, String ocena, String bpm) {
        this.tytul = tytul;
        this.artysta = artysta;
        this.ocena = ocena;
        this.bpm = bpm;
    }

    public String getTytul() { return tytul; }
    public String getArtysta() { return artysta; }
    public String getOcena() { return ocena; }
    public String getBpm() { return bpm; }

    @Override
    public String toString() {
        return tytul + " - " + artysta;
    }

    @Override
    public int compareTo(Piosenka innaPiosenka) {
        return this.tytul.compareTo(innaPiosenka.getTytul());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piosenka piosenka = (Piosenka) o;
        return Objects.equals(tytul, piosenka.tytul) && Objects.equals(artysta, piosenka.artysta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, artysta);
    }
}