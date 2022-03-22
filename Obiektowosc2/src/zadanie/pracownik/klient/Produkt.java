package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.List;


public class Produkt {
	private String nazwa;
	private double cena;
	private List<Klient> klienci = new ArrayList<>();

	private static List<Produkt> ekstensja = new ArrayList<>();

	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;

		ekstensja.add(this);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public List<Klient> getKlienci() {
		return klienci;
	}

//	public Set<Klient> getKlienci2() {
//		return klienci2;
//	}
//
//	public Map<Klient, Integer> getKlienci3() {
//		return klienci3;
//	}

	public static List<Produkt> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Produkt [nazwa=" + nazwa + ", cena=" + cena + "]";
	}

}
