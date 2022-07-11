package osoby;

import com.sun.source.tree.OpensTree;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    private static List<Osoba> ekstensja = new ArrayList<>();


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        ekstensja.add(this);
    }


    // Stwórz klase osoba, osoba ma imie, miasto, wiek i napisz ponizsze metody

    // policz ile jest osob starszych niz podany wiek

    public static long ileOsobParametr(List<Osoba> osoby, int wiek){
        return Optional.ofNullable(osoby)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(o -> o.getWiek() > wiek)
                .count();
    }
    //znajdz najstarsza osobe z listy, jesli nie ma to rzuc wyjatkiem NoOldestException

    public static Osoba najstarsza(List<Osoba> osoby){
        return Optional.ofNullable(osoby)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Osoba::getWiek))
                .orElseThrow(NoOldestException::new);
    }


    //znajdz najstarsza kobiete, jesli takiej ni ema to rzuc wyjatkiem NoWomenException

    public static Osoba najstarszaKobieta(List<Osoba> osoby){
        return Optional.ofNullable(osoby)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(o -> o.getImie().endsWith("a"))
                .max(Comparator.comparing(Osoba::getWiek))
                .orElseThrow(NoWomenException::new);
    }

    //oblicz sredni wiek mezczyzn

    public static double sredniWiekMezczyzn(List<Osoba> osoby){
        return Optional.ofNullable(osoby)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(o -> !o.getImie().endsWith("a"))
                .collect(Collectors.averagingDouble(Osoba::getWiek));
    }

    // * - metode ktora agreguje dwie metody powyzej (tzn: jako drugi parametr
    // przyjmuje funkcje ktora okresla plec)

    public static double sredniWiek(List<Osoba> osoby, Predicate<Osoba> plec){
        return Optional.ofNullable(osoby)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(plec)
                .collect(Collectors.averagingDouble(Osoba::getWiek));
    }

    //  metode ktora zwroci wszystkie rozne miasta z listy osob(rozne tzn: bez powtorzen)

    // metode ktora znajdze miasto w ktorym zyje najwiecej ludzi

    // stworz klase dziecko (imie) oraz slodycz (nazwa) i asocjacje * -- * pomiedzy nimi

    // zwroc lista wszystkich slodyczy ktore kupily dzieci

    // zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci

    // ile słodyczy podanego typu kupily dzieci

    // znajdz pierwsze dziecko które ma przynajmniej 2 slodycze

    // sprawdz czy ktorekolwiek dziecko ma gume

    // chcemy zwrócic dziecko które ma najwiecej slodyczy podanego typu
    // czyli np d1 ma s1,s1,s2,s3,s4,s4,s4
    // d2 ma s1,s1,s1,s1,s3,s4,s5
    // to metoda dla parametru s1 powinna dac d2, dla parametru s4 powinna dac d1

    // znajdz n-ty najpopularniejszy slodycz wsrod dzieci

    // zwroc wszystkie nazwy slodyczy, bezpowtórzen, scalone w jednego stringa z
    // malych liter



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public static List<Osoba> getEkstensja() {
        return ekstensja;
    }


}
