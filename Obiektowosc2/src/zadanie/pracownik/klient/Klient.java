package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klient {
	private String imie;
	private String nazwisko;
	private Produkt ulubionyProdukt;
	//private List<Produkt> produkty = new ArrayList<>();
	// wszystkie produkty najedna liste, kupione w kilku egzemplarzach sa dodawane kilkukrotnie. koniecznosc uzycia dodatkowej zmiennej aby zliczyc sume (przy dodawaniu produktu lub przy wyolaniu w petli) liczenie ulubionego produktu?
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
		//wyjatki !!
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
		for (Produkt p : produkty.keySet()) { // przetestowac czy dobrze this uzylem
			suma += p.getCena() * produkty.get(p);
		}
		return suma;
	}
	
	public Produkt ulubionyProdukt() {
	int ilosc = 0;
	for(Produkt p : produkty.keySet()) {
		if(produkty.get(p)>ilosc) {
			ilosc = produkty.get(p);
		}
	}
	return 
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

	public Produkt getUlubionyProdukt() {
		return ulubionyProdukt;
	}

	public Map<Produkt, Integer> getProdukty() {
		return produkty;
	}

	@Override
	public String toString() {
		return "Klient [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}

}
