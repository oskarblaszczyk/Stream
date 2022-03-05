package listy;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// tego nie uzywamy, FUJKA
		List listaNiegeneryczna = new ArrayList();

		listaNiegeneryczna.add("Kot");
		listaNiegeneryczna.add(1);
		listaNiegeneryczna.add(true);

		System.out.println(listaNiegeneryczna);

		/*
		 * ArrayList
		 * 1) Przechowuje elementy w dynamicznej tablicy - nie podajemy jej rozmiaru 
		 * 2) Dane zapisywane w pamieci znajduja sie obok siebie
		   3) Operacja wyjecia jest szybsza niz na LinkedList, ale usuniecie jest wolniejsze
		 */
		// bardzo szybkie dodani elemenow do listy
		List<String> imiona = new ArrayList<>(Arrays.asList("Grzegorz", "Ania", "Tomek"));

		// metoda add() - metoda ktora dodaje cos do kolekcji
		imiona.add("Tomek");
		imiona.add("Karolina");
		imiona.add("Piotr");

		System.out.println(imiona);

		// metoda addAll() - metoda ktora dodaje kolekcje do kolekcji
		// Arrays.asList() tworzy z elementow oddzielonych przecinkami kolekcjê
		imiona.addAll(Arrays.asList("Grzegorz", "Ania", "Tomek"));
		System.out.println(imiona);

		// metoda size() - rozmiar kolekcji
		System.out.println("Rozmiar kolekcji: " + imiona.size());

		// metoda get(x) - zwraca element o indeksie x
		System.out.println("Element pierwszy: " + imiona.get(0));

		//		// metoda remove(x) - usuniecie z kolekcji elementu x badz indeksu x
		//		imiona.remove(0);
		//		System.out.println(imiona);
		//
		//		imiona.remove("Piotr");
		//		System.out.println(imiona);
		//
		//		// metode removeAll() - usuniecie z kolekcji innej kolekcji
		//		imiona.removeAll(Arrays.asList("Ania", "Tomek"));
		//		System.out.println(imiona);

		// metoda contains(x) - zwraca true jesli element x znajduje sie w kolekcji
		System.out.println("Czy Klaudia jest w kolekcji? " + imiona.contains("Klaudia"));
		System.out.println("Czy Tomek jest w kolekcji? " + imiona.contains("Tomek"));

		// metoda isEmpty() - zwraca true jesli kolekcja jest pusta
		System.out.println("Czy kolekcja jest pusta? " + imiona.isEmpty());

		// metoda indexOf(x) - zwraca indeks pierwszego wystapienia elementu x
		// jesli elementu x nie ma w kolekcji to zwraca -1
		System.out.println("Indeks pierwszego wystapienia Karoliny: " + imiona.indexOf("Ania"));

		// metoda lastIndexOf(x) - zwraca indeks ostatniego wystapienia elementu x
		// jesli elementu nie ma w kolekcji to zwraca -1
		System.out.println("Indeks ostatniego wystapienia Karoliny: " + imiona.lastIndexOf("Ania"));

		// metoda set(indeks, element) - zastepuje element po podanym indeksie innym
		// elementem
		imiona.set(5, "Monikaaaaaaaa");
		System.out.println(imiona);

		// metoda sublist(x,y) zwraca podliste od indeksu podanego jako pierwszy
		// parametr uwzgledniajac go
		// do indeksu drugiego podanego jako parametr nieuwzgledniajac go
		System.out.println(imiona.subList(1, 4));

		// clear() - metoda czyszczaca kolekcje
		// listaImion.clear();
		System.out.println(imiona);

		// LinkedList
		/*
		 * 1) Przechowuje wewnetrznie elementy opakowane w obiekty wskazujace na element poprzedni i nastepny 
		 * 2) Dane w pamieci jej sa zapisywane rozstrzelone 
		 * 3) Patrz punkt 3 przy ArrayList
		
		 */

		List<String> nazwiska = new LinkedList<>();
		nazwiska.add("Kowalski");
		nazwiska.add("Nowak");
		nazwiska.add("Mosakowski");

		//	1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add, wyswietl cala liste petla for each. 
		List<Integer> listaInt = new ArrayList<>();
		listaInt.addAll(Arrays.asList(1, 2, 3, 4, 6));
		for (int i : listaInt) {
			System.out.print(i + " ");
		}

		System.out.println(sumaLiczb(listaInt));
		//	4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy
		List<String> imiona1 = new ArrayList<>(Arrays.asList("Tomek", "Ania", "Tomek", "Krzys", "Grzes", "Tomek"));
		imiona1.removeAll(Arrays.asList("Tomek"));

		System.out.println(roznicaMinMax(listaInt));
		System.out.println(listaInt);
		System.out.println(odwroc(listaInt));
		System.out.println(listaInt);
		odwroc2(listaInt);
		System.out.println(listaInt);
		System.out.println(imiona);
		System.out.println(samogloski(imiona));
		System.out.println(unikalneImie(imiona));

	}

	//	2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania
	public static int sumaLiczb(List<Integer> lista) {
		int suma = 0;
		for (int i : lista) {
			suma += i;
		}
		return suma;
	}

	//	3) Stworz metode ktora zwroci liste elementow wiekszych od 3
	public static List<Integer> wieksze3(List<Integer> lista, int a) {
		List<Integer> wynik = new ArrayList<>();
		for (int i : lista) {
			if (i > a) {
				wynik.add(i);
			}
		}
		return wynik;
	}

	//	5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie
	public static String najdluzszeImie(List<String> lista) {
		String wynik = "";
		for (String str : lista) {
			if (str.length() > wynik.length()) {
				wynik = str;
			}
		}
		return wynik;
	}

	//	6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w kolekcji
	public static boolean zawieraImie(List<String> lista, String imie) {
		return lista.contains(imie);
	}

	// Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z przedziaku 1-10,
	// wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste

	public static List<Integer> losoweLiczby() {
		Random rand = new Random();
		List<Integer> lista = new ArrayList<>();
		int ilosc = rand.nextInt(2, 9);
		for (int i = 0; i < ilosc; i++) {
			lista.add(rand.nextInt(1, 11));
		}
		return lista;
	}

	// Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze niz podany jako parametr int
	public static List<Integer> wiekszeNiz(List<Integer> lista, int a) {
		List<Integer> wynik = new ArrayList<>();
		for (int i : lista) {
			if (i > a) {
				wynik.add(i);
			}
		}
		return wynik;
	}

	// Wyswietl wszystkie imiona mêskie które znajduja sie w liscie
	public static List<String> imieMeskie(List<String> lista) {
		List<String> wynik = new ArrayList<>();
		for (String str : lista) {
			if (!str.endsWith("a")) {
				wynik.add(str);
			}
		}
		return wynik;
	}

	// Wyswietl ile razy by³o podane imie podane jako parametr
	public static int ileRazy(List<String> lista, String a) {
		int wynik = 0;
		for (String str : lista) {
			if (str.equals(a)) {
				wynik++;
			}
		}
		return wynik;
	}

	// Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
	// liste zawierajaca wszystkie
	// Stringi ktore zawieraja podana znak
	// Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
	// zawierac Ania Kasia Magda
	public static List<String> czyZawiera(List<String> lista, char znak) {
		List<String> wynik = new ArrayList<>();
		for (String str : lista) {
			if (str.contains(String.valueOf(znak))) {
				wynik.add(str);
			}
		}
		return wynik;
	}

	// Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
	// elementów ktore sa na obu listach
	public static List<String> polaczListy(List<String> lista1, List<String> lista2) {
		List<String> wynik = new ArrayList<>();
		wynik.addAll(lista1);
		wynik.addAll(lista2);
		return wynik;
	}

	// Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
	// najmniejszym elementem
	public static int roznicaMinMax(List<Integer> lista) {
		Collections.sort(lista);
		return lista.get(lista.size() - 1) - lista.get(0);
	}

	// Napisz metode ktora przyjmuje liste Stringow i zwraca listê (intow) indeksow
	// wszystkich elementow na liscie, ktore sa takie same jak parametr metody
	// np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
	// output: to 0,2,5
	public static List<Integer> indeksWystapienia(List<String> lista, String par) {
		List<Integer> wynik = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(par)) {
				wynik.add(i);
			}
		}
		return wynik;
	}

	// POPRAWA!!!
	// Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
	public static List<Integer> odwroc(List<Integer> lista) {
		List<Integer> wynik = new ArrayList<>();
		for (int i : lista) {
			wynik.add(0, i);
		}
		return wynik;
	}

	// Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
	// metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic
	public static void odwroc2(List<Integer> lista) {
		Collections.reverse(lista);
	}

	// majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
	// podana jako porametr
	public static List<Integer> listaParametr(List<Integer> lista, int par) {
		List<Integer> wynik = new ArrayList<>();
		for (int i : lista) {
			if (i % 10 == par) {
				wynik.add(i);
			}
		}
		return wynik;
	}

	// Wyœwietl ile razy ktorekolwiek imie zosta³o powtórzone Np dla imion ania piotr ania tomek krzys tomek ania program 
	// powinien wypisac 3, bo byly 3 potworki
	public static int powtorzenie(List<String> lista) {
		int licznik = 0;
		List<String> powtorki = new ArrayList<>();
		for (String str : lista) {
			if (powtorki.contains(str)) {
				licznik++;
			} else {
				powtorki.add(str);
			}
		}
		return licznik;
		//		Map<String, Integer> wynik = new HashMap<>();
		//		for (String str : lista) {
		//			if (wynik.containsKey(str)) {
		//				wynik.put(str, wynik.get(str) + 1);
		//			} else {
		//				wynik.put(str, 1);
		//			}
		//		}
		//		return Collections.max(wynik.values());
	}

	// Wyswietl ile razy we wszystkich imionach by³a u¿yta samog³oska
	public static int samogloski(List<String> lista) {
		char[] samogloski = { 'a', 'e', 'y', 'i', 'o', '¹', 'ê', 'u', 'ó' };
		int wynik = 0;
		for (String str : lista) {
			for (int i = 0; i < str.length(); i++) {
				for (char znak : samogloski) {
					if (str.charAt(i) == znak) {
						wynik++;
					}
				}
			}
		}
		return wynik;
	}

	//Napisz metodê która wyswietli unikalne imiona
	public static List<String> unikalneImie(List<String> lista) {

		List<String> unikalne = new ArrayList<>();
		for (String str : lista) {
			int licznik = 0;
			for (String str1 : lista) {
				if (str1.equals(str1)) {
					licznik++;
				}
			}
			if (licznik == 1) {
				unikalne.add(str);
			}
		}
		return unikalne;
		//		Map<String, Integer> mapaImion = new HashMap<>();
		//		for (String str : lista) {
		//			if (mapaImion.containsKey(str)) {
		//				mapaImion.put(str, mapaImion.get(str) + 1);
		//			} else {
		//				mapaImion.put(str, 1);
		//			}
		//		}
		//		List<String> listaUnikalnych = new ArrayList<>();
		//		for (String str : mapaImion.keySet()) {
		//			if (mapaImion.get(str) == 1) {
		//				listaUnikalnych.add(str);
		//			}
		//		}
		//		return listaUnikalnych;
	}

	//Zwroc liczbe s³ow ktore sa zlozone z samych whitespaców np spacji  
	public static int bialeZnaki(List<String> lista) {
		int wynik = 0;
		for (String str : lista) {
			if (str.isBlank()) {
				wynik++;
			}
		}
		return wynik;
	}

	//Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci
	public static List<String> imionaDluzsze(List<String> lista, int dlugosc) {
		List<String> wynik = new ArrayList<>();
		for (String str : lista) {
			if (str.length() > dlugosc && (str.length() % 2) == 0) {
				wynik.add(str);
			}
		}
		return wynik;
	}

	//Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
	//Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
	// Ania Krzys Tomek Kasia Jan
	// 4 2 5 8 3
	//Ania Tomek Jan
	public static List<String> dluzszyOd(List<String> lista, List<Integer> n) {
		List<String> wynik = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).length() == n.get(i)) {
				wynik.add(lista.get(i));
			}
		}
		return wynik;
	}

	// Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
	// sume dlugosci wszystkich Stringów
	public static int dlugoscString(List<String[]> lista) {
		int wynik = 0;
		for (String[] tab : lista) {
			for (String str : tab) {
				wynik += str.length();
			}
		}
		return wynik;
	}

}
