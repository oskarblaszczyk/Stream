package produkty;

import java.math.BigDecimal;
import java.util.*;

public class Produkt {
    private String nazwa;
    private double waga;
    private BigDecimal cena;
    private int ocena;
    private static List<Produkt> ekstensja = new ArrayList<>();

    public Produkt(String nazwa, double waga, BigDecimal cena, int ocena) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.cena = cena;
        this.ocena = ocena;
        ekstensja.add(this);
    }
    // znajdz najdrozszy produkt

    public static Produkt najdrozszyProdukt(List<Produkt> produkty) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Produkt::getCena))
                .orElseThrow();
    }

    // znajdz najtanszy produkt ale lzejszy niz podana waga

    public static Produkt najtanszyLzejszy(List<Produkt> produkty, double waga) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> p.waga < waga)
                .min(Comparator.comparing(Produkt::getCena))
                .orElseThrow();

    }


    // napisz metode która zwróci liste produktow o cena > 3000, ocena > 6, waga <
    // 23

    public static List<Produkt> produktyParametry(List<Produkt> produkty, BigDecimal cena, int ocena, double waga) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getCena().compareTo(cena) > 0)
                .filter((p -> p.getOcena() > ocena))
                .filter(p -> p.getWaga() < waga)
                .toList();
    }

    // oblicz srednia wage produktow z listy

    public static double sredniaWaga(List<Produkt> produkty) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .mapToDouble(i -> i.getWaga())
                .average()
                .orElseThrow();
    }

    // napisz metode która zwroci liste nazw produktow z wielkich liter, tych
    // ktorych dlugosc nazwy jest dluzsza niz 5 oraz waga > 10
    // wszystko pisane z wielkich liter


    public static List<String> wielkieLiteryParametry(List<Produkt> produkty, int dlugosc, int waga) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getNazwa().length() > dlugosc)
                .filter(p -> p.getWaga() > waga)
                .filter(p -> p.getNazwa() != null)
                .map(p -> p.getNazwa().toUpperCase())
                .toList();
    }

    // zwroc liste produktow posortowanych po nazwie

    public static List<Produkt> posortowaneNazwa(List<Produkt> produkty) {
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Produkt::getNazwa))
                .toList();
    }


    // zwroc liste produktow posorotwanych w zaleznosci od parametru

    public static  List<Produkt> sortowaneParametr(List<Produkt> produkty, Comparator<Produkt> parametr){
        return Optional.ofNullable(produkty)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .sorted(parametr)
                .toList();

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public List<Produkt> getEkstensja() {
        return ekstensja;
    }
}
