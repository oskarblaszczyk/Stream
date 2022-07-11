package slodycze;

import java.util.*;
import java.util.function.Predicate;

public class Slodycz {
    private String nazwa;
    private List<Dziecko> dzieci = new ArrayList<>();
    private static List<Slodycz> ekstensja = new ArrayList<>();

    public Slodycz(String nazwa) {
        this.nazwa = nazwa;
        ekstensja.add(this);
    }


    // zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
    // malych liter

    public static String nazwyScalone(List<Slodycz> slodycze){
        return Optional.ofNullable(slodycze)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Slodycz::getNazwa)
                .reduce( "", (x,y) -> x + y.toLowerCase());
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Dziecko> getDzieci() {
        return dzieci;
    }


    public static List<Slodycz> getEkstensja() {
        return ekstensja;
    }

}
