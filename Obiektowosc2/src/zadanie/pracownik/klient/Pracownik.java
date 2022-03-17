package zadanie.pracownik.klient;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import obiektowosc.pierwsza.Pracownicy;

public class Pracownik implements Comparable<Pracownik> {

	private String imie;
	private String nazwisko;
	private String adres;
	private Double pensja;

	private static List<Pracownik> ekstensja = new ArrayList<>();

	public Pracownik(String imie, String nazwisko, String adres, double pensja) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.pensja = pensja;

		ekstensja.add(this);
	}

	public static List<Pracownik> pracownicyTop3(List<Pracownik> pracownicy) {
		List<Pracownik> top3 = new ArrayList<>();
		top3.addAll(pracownicy);
		return top3.subList(0, 3);
	}

	public int ileWyjazdow() {
		int ilosc = 0;
		for (WyjazdAutem w : WyjazdAutem.getEkstensja()) {
			if (w.getPracownik().equals(this)) {
				ilosc++;
			}
		}
		return ilosc;
	}

	public int ileWyjazdow(Samochod samochod) {
		int ilosc = 0;
		for (WyjazdAutem w : WyjazdAutem.getEkstensja()) {
			if (w.getPracownik().equals(this) && w.getSamochod().equals(samochod)) {
				ilosc++;
			}
		}
		return ilosc;
	}

	public Duration czasWyjazdu(WyjazdAutem wyjazd) { // jak to dziala? co dalej?
		return Duration.between(wyjazd.getDataWyjazdu(), wyjazd.getDataPowrotu());
	}

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

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	public static List<Pracownik> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

	@Override
	public int compareTo(Pracownik o) {
		int porownaniePensji = pensja.compareTo(o.pensja);
		return porownaniePensji;
	}

}
