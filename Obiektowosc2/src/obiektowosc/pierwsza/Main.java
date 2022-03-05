package obiektowosc.pierwsza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * klasa - naturalny opis obiektu, zawiera zestaw cech (atrybutow) oraz funkcji (metod) dla danego obiektu
		 * 
		 * obiekt - wystapienie (instancja) klasy, konkretny byt
		 * 
		 * ekstensja klasy - zbiór wszystkich obiektow danej klasy
		 */

		Samochod s1 = new Samochod("Opel", "Astra", 50000, "czerwony", 1998, 0);

		System.out.println(s1.getKolor());

		s1.setKolor("niebieski");

		System.out.println(s1.getKolor());

		Samochod s2 = new Samochod("Audi", "A4", 12993921, "szary", 2003, 0);
		Samochod s3 = new Samochod("Toyota", "Auris", 75000, "bialy", 2013, 0);
		Samochod s4 = new Samochod("VW", "passat", 199999, "czarny", 1888, 0);

		System.out.println(Samochod.getEkstensja());

		Samochod s5 = new Samochod("VW", "gol", 9999, "czarny", 2005, 0);
		System.out.println(Samochod.getEkstensja());

		// metoda obiektowa
		System.out.println(s1.obliczWiek());
		System.out.println(s2.obliczWiek());

		// metoda klasowa
		System.out.println(Samochod.znajdzNajstarszeAuto(Samochod.getEkstensja()));
		System.out.println(Samochod.znajdzNajstarszeAuto(List.of(s3, s5, s2)));
		
		// stworzyc klase biznesowa 
		// String imie, String nazwisko, String dzial, String stanowisko, Samochod autoSluzbowe, int pensja)
		Pracownicy kowalskaAnna = new Pracownicy("Anna", "Kowalska", "HR", "HRBP", s2, 8500 );
		Pracownicy czajkowskiMateusz = new Pracownicy("Mateusz", "Czajkowski", "RME", "Planer", s5, 8940);
		
 
	}
}
