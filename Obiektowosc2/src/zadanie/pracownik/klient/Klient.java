package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Klient implements Comparable<Klient> {
	private String imie;
	private String nazwisko;
	private List<Produkt> produkty = new ArrayList<>();
	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		ekstensja.add(this);
	}

	// 	Tym sposobem w przypadku braku zakupow otrzymuje klienta z indeksu 0
	//	Wykorzystany w kolejnej metodzie interface comparable i sortowanie listy wedlug kwoty zakupow calkowitych.
	//	DO POPRAWY- zostawione dla przykladu
	public static Klient najwiecejWydal(List<Klient> klient) {
		if (klient == null || klient.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze  byc null i pusta");
		}
		Klient najwiecej = klient.get(0);
		for (Klient k : klient) {
			if (k.wartoscZakupow() > najwiecej.wartoscZakupow()) {
				najwiecej = k;
			}
		}
		return najwiecej;
	}

	// sortowanie- comparator + wskazanie ostatniego elementu listy- klient z
	// najwiekszymi zakupami.
	public static Klient najwiecejWydal() {
		if (ekstensja == null) {
			throw new IllegalArgumentException("nie moze byc nullem");
		}
		List<Klient> wynik = new ArrayList<>();
		wynik.addAll(ekstensja);
		Collections.sort(wynik);
		return wynik.get(wynik.size() - 1);
	}

	// obliczenie wartosci zakupow dla konkretnego klienta
	public Double wartoscZakupow() {
		if (produkty == null) {
			throw new IllegalArgumentException("Klient jeszcze nic nie kupil");
		}
		double suma = 0;
		for (Produkt p : produkty) {
			suma += p.getCena() * iloscProduktu(p);
		}
		return suma;
	}

	// obliczenie najczesciej (najwieksza ilosc razy) kupionego produktu
	public Produkt ulubionyProdukt() {
		int ilosc = 0;
		Produkt ulubiony = null; // czy to jest poprawne? zwracamy null w przypadku braku kupionych produktow.
		for (Produkt p : produkty) {
			if (iloscProduktu(p) > ilosc) {
				ilosc = iloscProduktu(p);
				ulubiony = p;
			}
		}
		return ulubiony;

	}

	// liczenie kupionej ilosci konkretnego produktu przez klienta
	private int iloscProduktu(Produkt produkt) {
		int ilosc = 0;
		for (Produkt p : produkty) {
			if (p.equals(produkt)) {
				ilosc++;
			}
		}
		return ilosc;
	}

	// dodawanie produktu
	public void kupProdukt(Produkt produkt) {
		produkty.add(produkt);
		produkt.getKlienci().add(this);
	}

	// dodawanie listy produktow
	public void kupProdukt(List<Produkt> produkty) {
		for (Produkt p : produkty) {
			this.produkty.add(p);
			p.getKlienci().add(this);
		}
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

	public List<Produkt> getProdukty() {
		return produkty;
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

	@Override
	public int hashCode() {
		return Objects.hash(imie, nazwisko, produkty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klient other = (Klient) obj;
		return Objects.equals(imie, other.imie) && Objects.equals(nazwisko, other.nazwisko)
				&& Objects.equals(produkty, other.produkty);
	}

	@Override
	public int compareTo(Klient o) {
		int kwotaZakupow = this.wartoscZakupow().compareTo(o.wartoscZakupow());
		return kwotaZakupow;
	}

}
