package dyplom;

import java.util.ArrayList;
import java.util.List;

public class Ocena {
    private final Wartosc ocena;
    private final Przedmiot przedmiot;
    private final Dyplom dyplom;

    private static List<Ocena> ekstensja = new ArrayList<>();

    public Ocena(Wartosc ocena, Przedmiot przedmiot, Dyplom dyplom) {
        if (dyplom == null) {
            throw new IllegalArgumentException("nie moze byc null");
        }
        this.ocena = ocena;
        this.przedmiot = przedmiot;
        this.dyplom = dyplom;
        dyplom.getOceny().add(this);
        ekstensja.add(this);
    }

    public Wartosc getOcena() {
        return ocena;
    }


    public Przedmiot getPrzedmiot() {
        return przedmiot;
    }


    public Dyplom getDyplom() {
        return dyplom;
    }


    public static List<Ocena> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "ocena=" + ocena +
                ", przedmiot=" + przedmiot +
                '}';
    }
}
