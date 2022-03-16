package equals.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Pracownik p1 = new Pracownik("Adam", "Nowa", 2500);
		Pracownik p2 = new Pracownik("Adam", "Nowa", 2501);

		Set<Pracownik> zestawienie = new HashSet<>();
		zestawienie.add(p1);
		zestawienie.add(p2);

		System.out.println(p1 == p2); // false
		System.out.println(p1.equals(p2)); // true
		System.out.println(zestawienie.size()); // 2
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		/*
		 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
			Pracownik uzywa samochod (model, marka)
			
			1) Znajdz klienta który wydal najwiecej
			
			2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)
			
			3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie) DODATKOWE
			
			4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
		 */
		
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
	}

}
