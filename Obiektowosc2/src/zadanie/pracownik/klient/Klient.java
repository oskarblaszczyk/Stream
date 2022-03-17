package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klient {
	private String imie;
	private String nazwisko;
	// private List<Produkt> produkty = new ArrayList<>();
	// wszystkie produkty najedna liste, kupione w kilku egzemplarzach sa dodawane
	// kilkukrotnie. koniecznosc uzycia dodatkowej zmiennej aby zliczyc sume (przy
	// dodawaniu produktu lub przy wyolaniu w petli) liczenie ulubionego produktu?
	private Map<Produkt, Integer> produkty = new HashMap<>();
	// produkty
	// dodawane do listy (klucz) o wartosci 1, w
	// przypadku kolejnej sztuki zakupionej wartosc sie
	// sumuje.
	// na plus jest pozniejsze znalezienie ulubionego
	// produktu- max wartosc z Mapy. Rowniez suma zakupow
	// latwo do obliczenia

	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		ekstensja.add(this);
	}

	public static Klient najwiecejWydal(List<Klient> klient) {
		if (klient == null || klient.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze  byc null i pusta");
		}
		Klient wynik = klient.get(0);
		for (Klient k : klient) {
			if (k.wartoscZakupow() > wynik.wartoscZakupow()) {
				wynik = k;
			}
		}
		return wynik;
	}

	public double wartoscZakupow() {
		double suma = 0;
		for (Produkt p : produkty.keySet()) {
			suma += p.getCena() * produkty.get(p);
		}
		return suma;
	}

	public Produkt ulubionyProdukt() {
		int ilosc = 0;
		// Produkt ulubiony = Produkt.getEkstensja().get(0); 
		Produkt ulubiony = null; // czy to jest poprawne? zwracamy null w przypadku braku kupionych produktow. opcja wyzej mozliwosc wskazania niekupionego produktu
		for (Produkt p : produkty.keySet()) {
			if (produkty.get(p) > ilosc) {
				ilosc = produkty.get(p);
				ulubiony = p;
			}
		}
		return ulubiony;

	}

	public void kupProdukt(Produkt produkt) {
		produkty.put(produkt, produkty.getOrDefault(produkt, 0) + 1);

		produkt.getKlienci().add(this); // Lista
		// produkt.getKlienci2().add(this); // Set
		// produkt.getKlienci3().put(this, produkt.getKlienci3().getOrDefault(produkt, 0) + 1); // Mapa
	}

	public void kupProdukt(List<Produkt> produkty) {
		for (Produkt p : produkty) {
			this.produkty.put(p, this.produkty.getOrDefault(p, 0) + 1);
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

	public Map<Produkt, Integer> getProdukty() {
		return produkty;
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

}
