package mapy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// Sety - przyjmuja tylko unikalne elementy

		// HashSet
		// Zbior nieuporzadkowany, akceptuje wartosci null

		Set<Integer> hashSet = new HashSet<>();
		hashSet.addAll(Arrays.asList(3, 5, 4, -3, 5, 5, 8, 1, 0));
		System.out.println(hashSet);

		// LinkedHashSet
		//  zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
		// wartosci null

		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(Arrays.asList(3, 5, 7, 3, 5, 4, null, 3, 2));
		System.out.println(linkedHashSet);

		// TreeSet
		// Sortuje elementy w secie, ale nie akceptuje wartosci null
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
		System.out.println(treeSet);

		// Mapy przechowuja elemetny pod postaciami par klucz-wartosc
		// klucze musza byc unikalne

		// HashMap
		//nie gwarantuje zachowania zadnej kolejscnoi,  akceptuje wartosci null
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("jeden", 1);
		hashMap.put("cztery", 4);
		hashMap.put("dwa", 2);
		hashMap.put("trzy", 3);
		System.out.println(hashMap);

		// LinkedHashMap
		//  zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
		// wartosci null

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("jeden", 1);
		linkedHashMap.put("cztery", 4);
		linkedHashMap.put("dwa", 2);
		linkedHashMap.put("trzy", 3);
		System.out.println(linkedHashMap);

		// TreeMap
		// Sortuje elementy po kluczach, ale nie akceptuje wartosci null
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("jeden", 1);
		treeMap.put("cztery", 4);
		treeMap.put("dwa", 2);
		treeMap.put("trzy", 3);
		System.out.println(treeMap);

		// zwraca wartoc dla danego klucza
		System.out.println(treeMap.get("jeden"));

		// keySet() values() zwracaja odpowiednio set kluczy i set wartosci
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());

		// containsKey() containsValue()
		System.out.println(treeMap.containsKey("jeden"));
		System.out.println(treeMap.containsValue(5));

		// replace(i,j)
		treeMap.replace("jeden", 11);
		System.out.println(treeMap);

		// getOrDefault
		System.out.println(treeMap.getOrDefault("jede5n", 10));

		for (Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Stwórz set Stringów, dodaj jakies elementy, zrob tak zeby wyswietlic je w
		// kolejnosci rosnacej
		Set<String> stringRosnace = new TreeSet<>(Arrays.asList("Bogdan", "Ala", "Arek", "Zosia"));
		System.out.println(stringRosnace);
		// Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala mape za pomoca Entry
		Map<String, String> mapa1 = new HashMap<>();
		mapa1.put("jeden", "ala");
		mapa1.put("dwa", "tomek");
		mapa1.put("trzy", "arek");
		for (Entry<String, String> entry : mapa1.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
		}
		// Dodaj do mapy 4 slowa jako klucze, niech wartoscia bedzie dlugosc kazdego ze slow
		System.out.println();
		System.out.println("podaj klucze");
		Scanner skaner = new Scanner(System.in);
		Map<String, Integer> mapa2 = new HashMap<>();
		for (int i = 0; i < 4; i++) {
			String wartosc = skaner.next();
			mapa2.put(wartosc, wartosc.length());
		}
		for (Entry<String, Integer> entry : mapa2.entrySet()) {
			System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
		}
	}
	// napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
		// klucze sa parzystych wartosci
		// na s³owo "parzyste"
		

		// Napisz program, ktory symuluje dzialanie slownika
		// polsko-angielskiego. Przyk³adowy program: Podaj slowko po Polsku: mama Slowko
		// po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
		// (cancel)
		
		// W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listê osób
			// (same nazwiska jako Stringi) które uczeszczaja do klasy.
			// 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
			// 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
	
	// Napisz metoda która dodaje s³owa do mapy. Kluczem maja byc kolejen liczby
	// naturalne zaczynajac od 0
	public static void dodajMapa (Map<Integer, String> mapa, String str) {
		mapa.put(mapa.size(), str);
	}
	
	// Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
	// wyswietlic ile razy jaki element byl dodany
	// pies kot pies ryba kot pies -> pies:3, kot:1, ryba:2
	
	public static void dodajKolejne (Map<String, Integer> mapa, String wyraz) {
		mapa.put(wyraz, mapa.getOrDefault(wyraz, 0) + 1);
	}
	
	// Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45
	public static Set<Integer> losowanie (){
		Random rand = new Random();
		Set<Integer> wynik = new TreeSet<>();
		while (wynik.size()<=6) {
			wynik.add(rand.nextInt(1,46));
		}
		return wynik;
	}
	
	
}
