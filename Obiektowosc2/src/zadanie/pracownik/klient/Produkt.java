package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Produkt {
	private String nazwa;
	private double cena;
	private List<Klient> klienci = new ArrayList<>(); // lista klientow ktorzy kupili produkt, powtorzenia klientow w przypadku zakupu kilku sztuk
	private Set<Klient> klienci2 = new HashSet<>(); // Set klientow ktorzy kiedykolwiek zakupili dany produkt, brak powtorzen
	private Map<Klient, Integer> klienci3 = new HashMap<>(); // Mapa klientow ktorzy kiedykolwiek zakupili produkt (klucz) oraz ilosc kupionych produktow.
	public Produkt(String nazwa, double cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
	
}
