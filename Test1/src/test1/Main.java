package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		//		Zadanie 1.
		//		Stworz petle która dla wszystkich liczb dwucyfrowych wypisz te których cyfra dziesi¹tek jest wiêksza ni¿ cyfra 
		//		jednoœci. np: 91 bo 9 > 1.
		//		(W tym zadaniu najlepiej wykorzystaæ dzielenie i dzielenie z reszt¹!)
		System.out.println("Zadanie 1.");
		for (int i = 10; i < 100; i++) {
			if (i / 10 > i % 10) {
				System.out.print(i + ", ");
			}
		}

		//		Zadanie 2.
		//		Stworz tablice liczb ca³kowitych (ile chcesz elementów i jak chcesz)
		//		nastêpnie:
		//		- wypisz wszystkie elementy tablicy od pierwszego do ostatniego w jednej linii
		//		- wypisz wszystkie elementy tablicy od ostatniego do pierwszego w jednej linii
		//		- wypisz najwiêkszy element
		//		- wypisz najwiêkszy element
		//		- wypisz sumê elemetów
		//		- wypisz medianê elementów tablicy
		System.out.println("\n\nZadanie 2.");
		int iloscLiczb = 9;
		int[] losoweLiczby = new int[iloscLiczb];
		Random losowanie = new Random();

		for (int i = 0; i < iloscLiczb; i++) {
			losoweLiczby[i] = losowanie.nextInt(1, 101);
		}
		System.out.print("Elementy tablicy: ");

		for (int i = 0; i < iloscLiczb; i++) {
			System.out.print(losoweLiczby[i] + ", ");
		}
		System.out.print("\nElelenty tablicy od ostatniego: ");

		for (int i = iloscLiczb - 1; i >= 0; i--) {
			System.out.print(losoweLiczby[i] + ", ");
		}
		System.out.println();

		int najwiekszyElement = Integer.MIN_VALUE;
		for (int i : losoweLiczby) {
			if (i > najwiekszyElement) {
				najwiekszyElement = i;
			}
		}
		System.out.println("Najwiekszy elelemnt tablicy: " + najwiekszyElement);
		System.out.println("Najwiekszy elelemnt tablicy: " + najwiekszyElement);

		int sumaElementow = 0;
		for (int i = 0; i < iloscLiczb; i++) {
			sumaElementow += losoweLiczby[i];
		}
		System.out.println("Suma elementow tablicy: " + sumaElementow);

		Arrays.sort(losoweLiczby);
		int mediana = 0;
		if (losoweLiczby.length % 2 == 0) {
			mediana = (losoweLiczby[losoweLiczby.length / 2] + losoweLiczby[losoweLiczby.length / 2 + 1]) / 2;
		} else {
			mediana = losoweLiczby[losoweLiczby.length / 2];
		}
		System.out.println("Mediana elementow tablicy: " + mediana);

		//		Zadanie 3.
		//		Stwórz dwie tablice liczb calkowitych (ile elementów chcesz i jak chcesz)
		//		a nastêpnie wypisz wszystkie liczby które wystêpuj¹ w obu tablicach.
		//		np: {1,2,3,4} , {1,4,5,6} powinno wypisaæ {1,4}
		System.out.println("\nZadanie 3.");
		int[] tablicaPierwsza = { 1, 2, 3, 4 };
		int[] tablicaDruga = { 1, 4, 5, 6 };
		System.out.print("Elementy wystepujace w obu tablicach to: ");
		for (int i : tablicaPierwsza) {
			for (int j : tablicaDruga) {
				if (i == j) {
					System.out.print(j + ",");
				}
			}
		}
		System.out.println();

		//		Zadanie 4.
		//		Stworz sobie na boku jakiœ plik w którym bêdzie 10-20 imion - ka¿de w nowej linii.
		//		Nastêpnie wczytaj te imiona z pliku oraz:
		//		- znajdz najdluzsze oraz najkrotsze imie
		//		- wypisz ilosc imion zenskich (to takie które siê koñcz¹ na literke "a")
		//		- jaki % caloœci stanowi¹ imiona ¿eñskie
		System.out.println("\nZadanie 4.");
		FileReader fr = new FileReader("imiona");
		BufferedReader br = new BufferedReader(fr);
		List<String> listaImion = new ArrayList<>();
		String linia;
		while ((linia = br.readLine()) != null) {
			listaImion.add(linia);
		}
		String imieNajdluzsze = listaImion.get(0);
		String imieNajkrotsze = listaImion.get(0);
		int imionaZenskie = 0;
		for (String str : listaImion) {
			if (str.length() > imieNajdluzsze.length()) {
				imieNajdluzsze = str;
			}
			if (str.length() < imieNajkrotsze.length()) {
				imieNajkrotsze = str;
			}
			if (str.endsWith("a")) {
				imionaZenskie++;
			}
		}
		System.out.println("Imie najdluzsze to: " + imieNajdluzsze);
		System.out.println("Imie najkrotsze to: " + imieNajkrotsze);
		System.out.println("Ilosc imion zenskich: " + imionaZenskie);
		System.out.println(
				"Imiona zenskie stanowia: " + (imionaZenskie * 100) / listaImion.size() + "% wszystkich imion");

		//		Zadanie 5.
		//		stworz tablice liczb, napisz algorytm ktory sprawdzi czy dana liczba jest elementem ciagu fibbonaciego czy nie, 
		//		jesli jest to ktora jest to liczba z kolej? (numer liczby w ciagu)
		System.out.println("\nZadanie 5.");
		int[] tablicaLiczb = { 1, 2, 4, 6, 8, 23, 43, 12, 43, 53, 652, 34, 434653, 23 };
		for (int i : tablicaLiczb) {
			if (elementFibb(i) > 0) {
				System.out.println(i + " jest " + elementFibb(i) + " elementem w ciagu Fibbonaciego");
			}
		}
	}

	public static int elementFibb(int i) {
		int a = 0;
		while (fibbonaci(a) <= i) {
			if (fibbonaci(a) == i) {
				return a;
			}
			a++;
		}
		return 0;
	}

	public static int fibbonaci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibbonaci(n - 1) + fibbonaci(n - 2);
	}

}
