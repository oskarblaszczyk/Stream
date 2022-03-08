package uml.przyklady;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Szkola s1 = new Szkola("SP2", 2, LocalDate.of(1999, 5, 14));

		s1.dodajProfil("matfiz");
		s1.dodajProfil("biochem");
		System.out.println(s1.getProfile());

		Szkola s2 = new Szkola("SP23", 23, LocalDate.of(1999, 5, 14));

		System.out.println(Szkola.getMinLiczbaUczniow());

		Szkola.setMinLiczbaUczniow(200);

		System.out.println(Szkola.getMinLiczbaUczniow());

		Uczen u1 = new Uczen("Adam", "Kowalski", "Wrocalw", "a1234");
		Uczen u2 = new Uczen("Ania", "Kowalska", "Warszawa", "b456");
		Uczen u3 = new Uczen("Masrcel", "Nowak", "Gdansk", "c32838");
		
		s1.dodajUcznia(u1);
		s1.dodajUcznia(u2);
		s1.dodajUcznia(u3);
		
		System.out.println(s1.getUczniowie());
		
		System.out.println(u1.getSzkola());
	//	s2.dodajUcznia(u1);
		
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
			
	}

}
