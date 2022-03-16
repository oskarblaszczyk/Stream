package zadanie.durex;

import java.util.ArrayList;
import java.util.List;

public class Produkt {
	private String nazwa;
	private double cena;
	private String rozmiar;
	private Zakup zakup;
	private static List<Produkt> ekstensja = new ArrayList<>();

	public Produkt(String nazwa, double cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;

		ekstensja.add(this);
	}

	public Produkt(String nazwa, double cena, String rozmiar) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
		this.rozmiar = rozmiar;

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

	public String getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(String rozmiar) {
		this.rozmiar = rozmiar;
	}

	public Zakup getZakup() {
		return zakup;
	}

	public void setZakup(Zakup zakup) {
		this.zakup = zakup;
	}

	public static List<Produkt> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Produkt [nazwa=" + nazwa + ", cena=" + cena + "]";
	}

}
