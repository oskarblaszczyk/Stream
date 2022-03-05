package metody.tablice;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] tablica = { 2, 3, 4, 5, 6 };

		wyswietlTablice(tablicaPosortowana(10));
		System.out.println();
		//wyswietlTablice(zwrocTablice());
		//System.out.println(sumaLiczb(tablica));
		//System.out.println(tablicaPosortowana(10));
		System.out.println(takieSame(tablica));
		System.out.println(czyRowne(tablica));
		System.out.println(rosnacaRoznica(tablica));
		wyswietlTablice(podzielne3(tablica));
	}

	public static void wyswietlTablice(int[] tablica) {
		for (int i : tablica) {
			System.out.print(i + " ");
		}
	}

	public static int[] zwrocTablice() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

	// Napisz metode ktora za swoj parametr przyjmuje tablice intow a nastepnie
	// zwraca sume wszystkich liczb ktore sa umieszczone w tej tablicy.
	public static int sumaLiczb(int[] tablica) {
		int suma = 0;
		for (int i : tablica) {
			suma += i;
		}
		return suma;
	}

	// Napisz metode ktora za swoj parametr przyjmuje tablice intów, a nastepnie
	// zwraca tablice liczb liczb wiêkszych od 5

	public static int[] liczbyWieksze(int[] tablica, int n) {
		int licznik = 0;
		for (int i : tablica) {
			if (i > n) {
				licznik++;
			}
		}
		int[] wieksze = new int[licznik];
		int j = 0;
		for (int i : tablica) {
			if (i > n) {
				wieksze[j] = i;
				j++;
			}
		}
		return wieksze;
	}

	// Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
	// wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7
	public static void wieksze2(int[] tablica, int n) {
		for (int i : tablica) {
			if (i % 2 == 0 && i > 7) {
				System.out.println(i + " ");
			}
		}
	}

	// Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
	// zwraca sume dlugosci tych stringów
	public static int sumaString(String[] tablica) {
		int suma = 0;
		for (String str : tablica) {
			suma += str.length();
		}
		return suma;
	}

	// Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
	// wypisuje najdluzszy ze stringow
	public static String najdluzszy(String[] tablica) {
		String max = "";
		for (String str : tablica) {
			if (max.length() < str.length()) {
				max = str;
			}
		}
		return max;
	}
	// dla podanej tablicy doubli oblicz srednia jej elementów

	public static double srednia(double[] tablica) {
		double suma = 0;
		for (double i : tablica) {
			suma += i;
		}
		return suma / tablica.length;
	}

	/*
	 * Napisz metode ktora jako parametr przyjmuje tablice intow, a nastepnie zwraca
	 * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
	 * 3 dla liczb parzystych odejmuje od nich 1
	 * 
	 * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrocic tablice
	 * {1,6,3,8}
	 */
	public static int[] tablica31(int[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] % 2 == 0) {
				tablica[i] -= 1;
			} else {
				tablica[i] += 3;
			}
		}
		return tablica;
	}

	/*
	 * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
	 * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
	 * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
	 * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
	 */
	public static int[] podzielne3(int[] tab) {
		int[] wynik = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 3 == 0) {
				wynik[i] = -1;
			} else {
				wynik[i] = (int) Math.pow(tab[i], 2);
			}
		}
		return wynik;
	}

	// napisz metode ktora przyjmuje jako parametr tablice Stringow oraz chara,
	// wypisuje te
	// slowa z tablicy ktore maja przynajmniej dwa podane chary
	// Ania Tomek Magda Krzys Ania i char a
	// output Ania Magda Ania
	public static void tablicaZnak(String[] tablica, char znak) {

		for (String str : tablica) {
			int licznik = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.toLowerCase().charAt(i) == znak) {
					licznik++;
				}
			}
			if (licznik >= 2) {
				System.out.println(str);
			}
		}
	}

	// dla podanej tablicy intów sprawdz czy liczba elementów ujemnych jest wiêksza
	// od liczby elementow nieujemnych
	public static boolean wiecejUjemnych(int[] tablica) {
		int ujemne = 0;
		int nieUjemne = 0;
		for (int i : tablica) {
			if (i < 0) {
				ujemne++;
			} else {
				nieUjemne++;
			}
		}
		return ujemne > nieUjemne;
	}

	// Napisz metode ktora wypelnia tablice losowymi (ilosc elementow podana jako
	// parametr) wartosciami z przedzialu 1-9 i
	// zwraca tablice posortowana w kolejnosci rosnacej
	public static int[] tablicaPosortowana(int n) {
		Random losowe = new Random();
		int[] tablica = new int[n];
		for (int i = 0; i < n; i++) {
			tablica[i] = losowe.nextInt(9) + 1;
		}
		Arrays.sort(tablica);
		return tablica;
	}

	// napisz metode ktora obliczy ile jest elementow parzystych z tablicy
	public static int ileParzystych(int[] tab) {
		int licznik = 0;
		for (int i : tab) {
			if (i % 2 == 0) {
				licznik++;
			}
		}
		return licznik;
	}

	// napisz metode ktora zwraca true tylko wtedy gdy kazdy element z tablcy to 1 lub 4
	public static boolean tablica14(int[] tab) {

		for (int i : tab) {
			if (i != 1 && i != 4) {
				return false;
			}
		}
		return true;
	}

	// napisz metode ktora zwraca true jesli kazda liczba z tablicy podanej jako
	// parametr konczy sie ta sama cyfra
	//117 7 786847 37
	public static boolean takieSame(int[] tab) {

		int jednosci = tab[0] % 10;

		for (int i : tab) {
			if (i % 10 != jednosci) {
				return false;
			}
		}

		return true;
	}

	// napisz metode która sprawdza czy elementy po lewej od srodka tablicy sa rowne
	// elementom po prawej od srodka tablicy
	// np [1,2,3,4] - false
	// [4,5,6,9,0] - true
	// [8,2,6,10,3,3] - true
	public static boolean czyRowne(int[] tab) {
		int sumaLewa = 0;
		int sumaPrawa = 0;
		for (int i = 0; i < tab.length; i++) {
			if (i < tab.length / 2) {
				sumaLewa += tab[i];
			} else if (i > tab.length / 2) {
				sumaPrawa += tab[i];
			}
		}
		return sumaLewa == sumaPrawa;
	}

	// napisz metode która sprawdza czy w tablicy intów roznica kazdej kolejnej pary liczb jest wieksza od poprzedniej
	// czyli np 1,3,6,10 true bo roznice to 2,3,4
	// 1,3,6,9 false  bo roznice to 2,3,3
	public static boolean rosnacaRoznica(int[] tab) {

		for (int i = 0; i < tab.length - 2; i++) {
			if (tab[i + 1] - tab[i] >= tab[i + 2] - tab[i + 1]) {
				return false;
			}
		}

		return true;
	}
}
