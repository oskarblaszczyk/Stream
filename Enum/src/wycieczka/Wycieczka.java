package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Wycieczka {
    private String nazwa;
    private String kraj;
    private double cena;
    private List<Dodatek> dodatki = new ArrayList<>();
    private List<Zakup> wyjazdy = new ArrayList<>();
    private List<Wycieczka> ekstensja = new ArrayList<>();

    public Wycieczka(String nazwa, String kraj, double cena) {
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.cena = cena;
        ekstensja.add(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public List<Dodatek> getDodatki() {
        return dodatki;
    }

    public void setDodatki(List<Dodatek> dodatki) {
        this.dodatki = dodatki;
    }

    public List<Zakup> getWyjazdy() {
        return wyjazdy;
    }

    public void setWyjazdy(List<Zakup> wyjazdy) {
        this.wyjazdy = wyjazdy;
    }

    public List<Wycieczka> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
