/*
		 * Stwórz system do zarz¹dzania przedszkolem. W przedszkolu mamy dzieci oraz
		 * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
		 * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
		 * 
		 * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
		 * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych.
		 * 
		 * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
		 * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce.
		 * 
		 * Kazda grupa ma przypisana sale (nazwa, kolor scian).
		 * 
		 * -narysuj poprawny diagram uml do teog zagadnienia
		 * -napisz metode która zwraca dziecko ktore ma najwiecej przewinien 
		 * -napisz metode ktora zwroci wychowawcow kwliafikowanych z pensja wieksza niz podany parametr
		 * -zapisz do pliku imiona nazwiska wszystkich dzieci którzy sa w grupie dla wychowawcy podanego jako parametr 
		 * -i wyswietl wszystkie te dzieci wczytane z pliku na JLiscie
		 */

package zadanie.przedszkole;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		Wychowawca w1 = new Wychowawca("Jan", "Kowalski", LocalDate.of(1980, 12, 04), Kwalifikacje.tymczasowy);
		Wychowawca w2 = new Wychowawca("Ania", "Nowak", LocalDate.of(1985, 01, 30), Kwalifikacje.kwalifikowany);

		Dziecko d1 = new Dziecko("Basia", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d2 = new Dziecko("Ania", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d3 = new Dziecko("Lucja", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d4 = new Dziecko("Mateusz", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d5 = new Dziecko("Rafal", "Konieczna", LocalDate.of(2018, 5, 5), null);
		Dziecko d6 = new Dziecko("Czeslaw", "Konieczna", LocalDate.of(2018, 5, 5), null);
		
		Sala s1 = new Sala("sloneczko", "zolte");
		
		Grupa g1 = new Grupa("Sloneczka", s1, w1, Arrays.asList(d1, d2, d3, d4, d5, d6));
		
		System.out.println(w1.getPensja());
		System.out.println(Dziecko.najwiecejPrzewinien(g1.getDzieci()));
		d1.dodajPrzewinienie("przewinienie");
		System.out.println(Dziecko.najwiecejPrzewinien(g1.getDzieci()));
		System.out.println(Wychowawca.pensjaPowyzejKwalifikowany(2500));
		
		g1.zapisPlik(w1);
		System.out.println();
		g1.odczytPlikuWychowawca(w1);

		
	}

}
