package zapis.pliki;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {

		// Stwórz tablice 3 stringów, dodaj wszystkie w pętli do zmiennej typu String i
		// zapisz ją do pliku

		//		String[] tablica = { "zapisany", "ciag", "znakow" };
		//		String a = "";
		//		for (int i = 0; i < tablica.length; i++) {
		//			a += tablica[i] + ", ";
		//		}
		//		File plik = new File("zapisany_string.txt");
		//		PrintWriter zapis = new PrintWriter(plik);
		//		zapis.println(a);
		//		zapis.close();
		//		
		//		//7) Wczytaj to co zapisaleś do pliku i wyświetl na konsoli
		//		
		//		Scanner odczyt = new Scanner(plik);
		//		
		//		String zdanie = odczyt.nextLine();
		//		System.out.println(zdanie);
		//		odczyt.close();
		//		
		//		
		//		// 8) Wpisz do pliku 10 liczb oddzielonych enterem, wyświetl wszystkie które są
		//		// podzielne przez 2		
		//		
		//		File plik2 = new File("liczby.txt");
		//		PrintWriter zapis2 = new PrintWriter(plik2);
		//		for (int i = 1; i <= 10; i++) {
		//			zapis2.println(i);
		//		}
		//		zapis2.close();
		//
		//		Scanner odczyt2 = new Scanner(plik2);
		//		for (int i = 1; i <= 10; i++) {
		//			int liczba = odczyt2.nextInt();
		//			if (liczba % 2 == 0) {
		//				System.out.println(liczba);
		//			}
		//		}
		//		odczyt2.close();
		//		
		// FileWriter 

		// FileReader i BufferedReadera

		FileWriter fw = new FileWriter("plik");
		fw.write("Ania\n");
		fw.write("Tomek\n");
		fw.write("Krzys");

		fw.close();

		FileReader fr = new FileReader("plik");
		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
		System.out.println();
		// Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
		// kurde, kurcze i kurka.
		// Program ma za zadanie kazdy wyraz brzydki zastapic **** i zapisac
		// całosc do nowego pliku ktory sie nazywa
		// slownikPoprawiony
		FileReader read = new FileReader("slownik");
		BufferedReader bRead = new BufferedReader(read);
		String[] brzydkieSlowa = { "kurde", "kurcze", "kurka" };
		FileWriter zapis = new FileWriter("slownikPoprawiony");
		String linia;
		while ((linia = bRead.readLine()) != null) {
			for (int i = 0; i < brzydkieSlowa.length; i++) {
				if (brzydkieSlowa[i].equals(linia)) {
					linia = "*****";
				}
			}
			zapis.write(linia + "\n");
		}
		zapis.close();

		// W pliku tekstowym sa wyrazy. Wypisz te ktore sa palindromami np kajak, ala
		FileReader readPal = new FileReader("palindromy");
		BufferedReader bReadPal = new BufferedReader(readPal);
		String wiersz;

		//System.out.println("Magdalena".charAt(3));

		// kajak 
		while ((wiersz = bReadPal.readLine()) != null) {
			boolean flaga = true;
			for (int i = 0; i < wiersz.length() / 2; i++) {
				if (wiersz.charAt(i) != wiersz.charAt(wiersz.length() - 1 - i)) {
					flaga = false;
					break;
				}
			}
			if (flaga) {
				System.out.println(wiersz);
			}

		}

		// Zapisz do pliku kilka nazw zwierzat, odczytaj je i wypisz

		// Stworz plik z 10 liczbami, wczytaj je i przypisz do tablicy, wyswietl cala
		// tablice

		// Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez
		// uzytkownika. Nastepnie odczytajmy te imiona i
		// wyswietlmy najdluzsze z nich

		// Skaner

		//Wczytaj skanerem 3 liczby typu int, wyswietl ich sume na konsoli

		//Wczytaj skanerem 3 napisy, wyswietl ten ktory jest najdluzszy

		//Stwórz kalkulator za pomocą skanera, uzytkownik wprowadza liczbe (double), znak, druga liczbe
		//w zaleznosci od tego czy poda +,-,/,* to wykonujemy taka operacje matematycna

		//Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce wprowadzic. Nastepnie wprowadza
		//tyle liczb ile podał. Chcemy policzyc ich sume, element najmniejsz, najwiekszy oraz srednia arytmetyczna.

		//Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza hasło, tak dlugo az jest
		//niepoprawne, wyswietlamy napis ze haslo jst niepoparwne, wprowadz poprawne hasło.
		//Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo jest poprawne.
		String haslo = "haslo";
		while (true) {
			String podajHaslo = JOptionPane.showInputDialog("Podaj haslo");
			if (haslo.equals(podajHaslo)) {
				break;
			}
			JOptionPane.showMessageDialog(null, "Haslo niepoprawne");
		}
		JOptionPane.showMessageDialog(null, "Haslo poprawne");

		// OkienkoDialogowe
		//Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest wieksza niz 15, wyswietl
		//za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze jest ok.
		
		String napis = JOptionPane.showInputDialog("podaj napis");
		if (napis.length() > 15) {
			JOptionPane.showMessageDialog(null, "za dlugi napis");
		} else {
			JOptionPane.showMessageDialog(null, "ok");
		}
		
		
		//Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest wieksza niz 15, wyswietl
		//za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze jest ok.

		//Za pomoca JOPtionPane wczytaj 3 liczby i wyswietl ta ktora jest najwieksza

		//Za pomoc JOptionpane (confrim dialog) zadaj pytanie uzytkownikowi o to czy chce zlozyc zamowienie. 
		//W zaleznosci od zaznaczonej odpowiedzi wyswietl odpowiedni napis 

		//Za pomoca JOPtionpane uzytkwonik podaje imiona. Dopoki nie poda tomek to moze je wprowadzac dalej i wypisujemy je na konsoli
		//Gdy wpisze Tomek przerywamy wprowadzanie i podajemy komunikat w okienku dialogowym ze wpisano brzydkie imie.

		//Wpisujemy imiona za pomoca JOPtionPane tak dlugo az uzytkownik nie zrezygnuje. Przypisujemy te wartosci do wczesniej utworzonej
		//zmiennej typu String, wyswietlamy ja na koncu

		//Uzytkownik wybiera dwie opcje, tak lub nie dopoki nie nacisnie cancel. Policz czy uzytkownik wybral wiecej razy tak, nie czy bylo ich tyle samo.

	}

}
