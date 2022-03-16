/*
		 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar penisa. Pordukt ma nazwe, cene i jesli jest to kondom to wymiar.
		 *  Klient moze miec wiele produktow, produkt moze miec jednego klienta.
		 *   
		 *  1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.
		 *  
		 *   2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa 
		 *   
		 *   3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na swoj rozmiar :D 
		 */

package zadanie.durex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Klient k1 = new Klient("Adam", "Kowalski", "M");
		Klient k2 = new Klient("Piotrel", "Nowak", "s");
		Klient k3 = new Klient("Jan", "Piotrowiak", "L");
		Klient k4 = new Klient("Wojtek", "Wojtowicz", null);// brak rozmiaru
		Klient k5 = new Klient("Slawek", "Adamczak", "xl");

		Produkt p1 = new Produkt("Durex cienkie", 15, "S");
		Produkt p2 = new Produkt("jakies tam Durex", 15, "L");
		Produkt p3 = new Produkt("Durex", 15, "XL");
		Produkt p4 = new Produkt("Kwiaty", 10);
		Produkt p5 = new Produkt("Czekoladki", 10);
		Produkt p6 = new Produkt("Olej", 20);
		Produkt p7 = new Produkt("Orbit", 5);
		Produkt p8 = new Produkt("Kurczak", 30);
		Produkt p9 = new Produkt("Lenor", 12);
		Produkt p10 = new Produkt("Durex", 15, "S");
		Produkt p11 = new Produkt("prawie Durex", 15, "S");
		Produkt p12 = new Produkt("Durex", 15, "S");

		Zakup z1 = new Zakup(k1, LocalDate.now(), Arrays.asList(p2, p4, p9));
		Zakup z2 = new Zakup(k2, LocalDate.now(), Arrays.asList(p1, p5, p8));
		Zakup z3 = new Zakup(k3, LocalDate.now(), Arrays.asList(p3, p6, p7));
		//Zakup z4 = new Zakup(k4, LocalDate.now(), Arrays.asList(p10, p11, p12));
		//Zakup z5 = new Zakup(k5, LocalDate.now(), null);

		System.out.println(Zakup.najdrozszeZakupy(Zakup.getEkstensja()));
		System.out.println(Zakup.kupioneDurex(Zakup.getEkstensja()));
		System.out.println(Zakup.zlyRozmiar(Zakup.getEkstensja()));

		//System.out.println(Klient.getEkstensja());
		//System.out.println(Produkt.getEkstensja());
		
		/*
		 * 1 - wole dziedziczenie niz atrybut ocpjoanlny
		 * 2 - brak klasy posredniczacje, asocjacja 1-*
		 * 3 - co za tym idzie brak metod w zakupie
		 * 4 - popraw
		 */
	}

}
