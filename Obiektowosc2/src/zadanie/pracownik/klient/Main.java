/*
		 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
			Pracownik uzywa samochod (model, marka)
			
			1) Znajdz klienta który wydal najwiecej
			
			2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)
			
			3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie) DODATKOWE
			
			4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
		 */

package zadanie.pracownik.klient;

import java.time.LocalDate;
import java.util.Arrays;

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

		System.out.println("Wydal najwiecej: " + Klient.najwiecejWydal());
		System.out.println("i wydal: " + Klient.najwiecejWydal().wartoscZakupow());

		System.out.println();

		System.out.println();
		for (Klient k : Klient.getEkstensja()) {
			System.out.println("Ulubiony produkt dla " + k + " to: " + k.ulubionyProdukt().getNazwa());
		}

		Pracownik pr1 = new Pracownik("Adam", "Jankowski", "Wroclaw", 4800);
		Pracownik pr2 = new Pracownik("Bartosz", "Kita", "Olesnica", 3950);
		Pracownik pr3 = new Pracownik("Alicja", "Nowak", "Jelenia Gora", 5410);
		Pracownik pr4 = new Pracownik("Barbara", "Kowalska", "Kowary", 1899);

		Samochod s1 = new Samochod("aa4", "audi");
		Samochod s2 = new Samochod("corolla", "toyota");
		Samochod s3 = new Samochod("330", "bmw");

		WyjazdAutem w1 = new WyjazdAutem(pr1, s1, LocalDate.parse("2022-03-13"), LocalDate.parse("2022-03-15"));
		WyjazdAutem w2 = new WyjazdAutem(pr2, s2, LocalDate.parse("2022-03-13"), LocalDate.parse("2022-03-15"));
		WyjazdAutem w3 = new WyjazdAutem(pr3, s3, LocalDate.parse("2022-03-13"), LocalDate.parse("2022-03-15"));
		WyjazdAutem w4 = new WyjazdAutem(pr1, s1, LocalDate.parse("2022-03-17"), LocalDate.parse("2022-03-20"));
		WyjazdAutem w5 = new WyjazdAutem(pr2, s2, LocalDate.parse("2022-03-17"), LocalDate.parse("2022-03-20"));
		WyjazdAutem w6 = new WyjazdAutem(pr3, s3, LocalDate.parse("2022-03-17"), LocalDate.parse("2022-03-20"));
		WyjazdAutem w7 = new WyjazdAutem(pr1, s1, LocalDate.parse("2022-03-21"), LocalDate.parse("2022-03-25"));
		WyjazdAutem w8 = new WyjazdAutem(pr2, s2, LocalDate.parse("2022-03-21"), LocalDate.parse("2022-03-22"));
		WyjazdAutem w9 = new WyjazdAutem(pr3, s3, LocalDate.parse("2022-03-21"), LocalDate.parse("2022-03-24"));

		System.out.println();
		System.out.println("TOP 3 najlepszych pracownikow to: " + Pracownik.pracownicyTop3());

//		System.out.println(pr1.ileWyjazdow());
//		System.out.println(pr1.ileWyjazdow(s1));
//		System.out.println(pr1 + " mial: " + pr1.ileWyjazdow() + " wyjazdy i trwaly one razem: " + pr1.dlugoscWyjazdow().getDays() + " dni");
//		System.out.println("wyjazd " + w1 + " dla " + pr1 + " to: " + pr1.dlugoscWyjazdu(w1).getDays() + " dni");
//		
		System.out.println();
		for(Pracownik p : Pracownik.getEkstensja()) {
			for(Samochod s : Samochod.getEkstensja()) {
				System.out.println("Pracownik " + p + " uzywal auta " + s + " " +  p.ileWyjazdow(s) + " razy i bylo to w sumie: " + p.dlugoscWyjazduAuto(s).getDays() + " dni" );
			}
		}
		System.out.println();
	}

}
