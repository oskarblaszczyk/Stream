/*
		 *  W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci 
			oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.
			
			Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.
			
			Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)), sprzet moze byc naprawiany.
			 Chcemy przechowywac informacje o tym jaki trener uzywal kiedy
			jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie. 
		
		
			-znajdz trenera ktory trenowa³ najwiecej zwierzat
			-znajdz trenera ktory uzywa³ jakiegos sprzetu najwieksza liczbe razy
			-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
			-znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
			-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
		 */

package zadanie.zwierzyniec;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Pies p1 = new Pies("Burek", "Amstaff", "krotka" );
		Pies p2 = new Pies("Szarik", "Spaniel", "dluga" );
		Pies p3 = new Pies("Reksio", "York", "dluga" );
		Pies p4 = new Pies("Klara", "Spaniel", "dluga" );
		Pies p5 = new Pies("Dingo", "Pudel", "krotka" );

		Kot k1 = new Kot("Rudy", "Pers", 10);
		Kot k2 = new Kot("Kleo", "Dachowy", 6);
		Kot k3 = new Kot("Zara", "Brytyjski", 3);
		Kot k4 = new Kot("Melisa", "Ragdoll", 1);
		Kot k5 = new Kot("Zygzak", "Ragdoll", 5);

		Pterodaktyl d1 = new Pterodaktyl("Jasiek", "Typowy", 2.5);
		Pterodaktyl d2 = new Pterodaktyl("Romek", "Typowy", 2.2);
		Pterodaktyl d3 = new Pterodaktyl("Basia", "Typowy", 2.4);
		Pterodaktyl d4 = new Pterodaktyl("Natalia", "Typowy", 2.1);
		Pterodaktyl d5 = new Pterodaktyl("Monika", "Typowy", 2.8);
		
		Trener t1 = new Trener("Jan", "Kowalski", "Wroclaw");
		Trener t2 = new Trener("Adam", "Nowak", "Gdansk");
		Trener t3 = new Trener("Marek", "Bielecki", "Warszawa");
		
		Sprzet s1 = new Sprzet("bat", "nowy");
		Sprzet s2 = new Sprzet("kolo", "uzywany");
		Sprzet s3 = new Sprzet("gwizdek", "uzywany");
		Sprzet s4 = new Sprzet("lasso", "tragiczny");
		s4.napraw();
		s4.setStopienZuzycia("tragiczny");
		s4.napraw();
		s2.setStopienZuzycia("tragiczny");
		s2.napraw();
		s2.setStopienZuzycia("tragiczny");
		s2.napraw();
		
		t1.setTrenowaneZwierzeta(Arrays.asList(d1, p2, p1));
		t2.setTrenowaneZwierzeta(Arrays.asList(p2, p2));
		t3.setTrenowaneZwierzeta(Arrays.asList(d3));

		UzytkowanieSprzetu u1 = new UzytkowanieSprzetu(LocalDate.now(), s1, t1);
		UzytkowanieSprzetu u2 = new UzytkowanieSprzetu(LocalDate.now(), s1, t2);
		UzytkowanieSprzetu u3 = new UzytkowanieSprzetu(LocalDate.now(), s2, t3);
		UzytkowanieSprzetu u4 = new UzytkowanieSprzetu(LocalDate.now(), s3, t1);
		UzytkowanieSprzetu u5 = new UzytkowanieSprzetu(LocalDate.now(), s2, t1);
		UzytkowanieSprzetu u6 = new UzytkowanieSprzetu(LocalDate.now(), s4, t2);
		UzytkowanieSprzetu u7 = new UzytkowanieSprzetu(LocalDate.now(), s3, t3);
		
		//	-znajdz trenera ktory trenowa³ najwiecej zwierzat
		System.out.println(Trener.trenowalNajwiecejZwierzat(Trener.getEkstensja()));
		
		//-znajdz trenera ktory uzywa³ jakiegos sprzetu najwieksza liczbe razy
		System.out.println(Trener.uzywalNajwiecejRazy(Trener.getEkstensja(), s4));
		
		//-znajdz trenerow ktorzy trenowali psy z gatunku spaniel
		System.out.println(Trener.trenowaliZwierze(Trener.getEkstensja(), "Spaniel"));
		
		//-znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
		System.out.println(Sprzet.naprawianyNRazy(Sprzet.getEkstensja(), 2));
		
		//-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
		System.out.println(Zwierze.nigdyNieTrenowane(Pterodaktyl.getEkstensja()));
		System.out.println();
		
		// Dodajemy wszystkie zwierzeta do ekstensji zwierze? 
		//System.out.println(Zwierze.getEkstensja()); 
		System.out.println(Pterodaktyl.getEkstensja());
	}
	
}
