package obiektowosc.pierwsza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Samochod {

	// pola klasy
	private final String marka;
	private final String model;
	private int przebieg;
	private String kolor;
	private final int rokProdukcji;
	private int cena;

	// ekstensja klasy samochod
	private static List<Samochod> ekstensja = new ArrayList<>();

	// konstruktor
	// alt + shift + S
	// Samochod s1 = new Samochod("Opel", "Astra", 50000, "czerwony", 1998);
	public Samochod(String marka, String model, int przebieg, String kolor, int rokProdukcji, int cena) {
		this.marka = marka;
		this.model = model;
		this.przebieg = przebieg;
		this.kolor = kolor;
		this.rokProdukcji = rokProdukcji;
		this.cena = cena;

		ekstensja.add(this);
	}

	// metoda niestatyczna, czyli metoda obiektowa, wywolujemy ja na obiekcie
	public int obliczWiek() {
		return LocalDate.now().getYear() - rokProdukcji;
	}

	// metoda statyczna, czyli metoda klasowa, nie potrzebuje obiektu zeby sie
	// wywoalac, wywolujemy ja na ekstensji klasy
	// w tego typu metodach NIGDY nie dzialaj bezposrednio na ekstensji
	public static Samochod znajdzNajstarszeAuto(List<Samochod> lista) {

		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}

		Samochod najstarsze = lista.get(0);

		for (Samochod s : lista) {
			if (s.obliczWiek() > najstarsze.obliczWiek()) {
				najstarsze = s;
			}
		}
		return najstarsze;
	}

	// napisz metode ktora znajduje wszystkie auta marki bmw
	public static List<Samochod> marki(List<Samochod> lista, String marka) {
		if (lista == null) {
			throw new IllegalArgumentException("lista jest nullem");
		}

		List<Samochod> zestawienie = new ArrayList<>();
		for (Samochod s : lista) {
			if (s.getMarka().equals(marka)) {
				zestawienie.add(s);
			}
		}
		return zestawienie;

	}

	// napisz metode ktora znajduje auto o najnizszym przebiegu

	public static Samochod najnizszyPrzebieg(List<Samochod> lista) {

		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}
		Samochod najnizszy = lista.get(0);

		for (Samochod s : lista) {
			if (s.getPrzebieg() < najnizszy.getPrzebieg()) {
				najnizszy = s;
			}
		}
		return najnizszy;
	}

	// napisz metode ktora znajduje wszystkie auta o kolorze niebieskim starsze niz
	// 15 lat

	public static List<Samochod> starszeNiz(List<Samochod> lista, int wiek) {
		if (lista == null) {
			throw new IllegalArgumentException("Lista nie moze byc nullem");
		}
		List<Samochod> wynik = new ArrayList<>();
		for (Samochod s : lista) {
			if (s.obliczWiek() > wiek) {
				wynik.add(s);
			}
		}
		return wynik;
	}

	public static List<Samochod> kolorWiek(List<Samochod> lista, String kolor) {

		if (lista == null) {
			throw new IllegalArgumentException("Lista nie moze byc nullem");
		}

		List<Samochod> wynik = new ArrayList<>();
		for (Samochod s : lista) {
			if (s.getKolor().equals(kolor)) {
				wynik.add(s);
			}
		}
		return wynik;
	}

	// napisz metode ktora znajduje najdrozsze auto ale z aut z przebiegiem
	// mniejszym nzi 30k
	public static Samochod najdrozszeAuto(List<Samochod> lista) {
		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}
		Samochod wynik = lista.get(0);
		for(Samochod s : lista) {
			if(s.getCena() > wynik.getCena()) {
				wynik = s;
			}
		}
		return wynik;
	}

	public static Samochod PrzebiegDo30k(List<Samochod> lista, int przebieg) {
		if (lista == null) {
			throw new IllegalArgumentException("Lista nie moze byc nullem");
		}
		List<Samochod> wynik = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.getPrzebieg() < przebieg) {
				wynik.add(s);
			}
		}
		return wynik;

	}

	// znajdz najtansze auto marki bmw
	public static List<Samochod> autaMarki(List<Samochod> lista, String marka) {
		if (lista == null) {
			throw new IllegalArgumentException("Lista nie moze byc nullem");
		}
		List<Samochod> wynik = new ArrayList<>();
		for (Samochod s : lista) {
			if (s.getMarka().equals(marka)) {
				wynik.add(s);
			}
		}
		return wynik;
	}

	public static Samochod najtanszeAuto(List<Samochod> lista) {
		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}
		Samochod najtanszy = lista.get(0);

		for (Samochod s : lista) {
			if (najtanszy.getCena() < s.getCena()) {
				najtanszy = s;
			}
		}
		return najtanszy;
	}

	// znajdz najdrozsze auto ktorego marka ma dlugosc wieksza niz 4

	public static Samochod najdrozszeDlugoscMarki(List<Samochod> lista, int dlugoscMarki) {
		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}
		Samochod najdrozszy = lista.get(0);
		for (Samochod s : lista) {
			if (s.getMarka().length() > dlugoscMarki && najdrozszy.getCena() < s.getCena()) {
				najdrozszy = s;
			}
		}
		return najdrozszy;
	}

	// gettery - metody ktore zwracaja wartosc danego pola

	public static List<Samochod> getEkstensja() {
		return ekstensja;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	// settetry - metody ktore ustawiaja nowa wartosc danego pola
	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String toString() {
		return marka + " " + model;
	}

}
