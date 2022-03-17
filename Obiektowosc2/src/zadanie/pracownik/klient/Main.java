/*
		 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
			Pracownik uzywa samochod (model, marka)
			
			1) Znajdz klienta który wydal najwiecej
			
			2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)
			
			3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie) DODATKOWE
			
			4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
		 */

package zadanie.pracownik.klient;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Klient k1 = new Klient("Adam", "Slodowy");
		Klient k2 = new Klient("Jan", "Kowalski");
		Klient k3 = new Klient("Jan", "Nowak");

		Produkt p1 = new Produkt("maka", 3.50);
		Produkt p2 = new Produkt("Chleb", 4.50);
		Produkt p3 = new Produkt("Jajka", 12.30);

		k1.kupProdukt(p1);
		k1.kupProdukt(Arrays.asList(p1, p2, p2, p3, p3, p2));
		k2.kupProdukt(Arrays.asList(p1, p2, p3, p2, p1, p1));
		k3.kupProdukt(Arrays.asList(p2, p2, p3, p1, p1, p3, p3));

		System.out.println("Wydal najwiecej: " + Klient.najwiecejWydal(Klient.getEkstensja()));

		for (Klient k : Klient.getEkstensja()) {
			System.out.println("Ulubiony produkt dla " + k + " to: " + k.ulubionyProdukt().getNazwa());
		}

	}

}
