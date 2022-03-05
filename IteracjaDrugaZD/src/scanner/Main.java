package scanner;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1) Wczytaj za pomocą scannera 2 liczby i przeprowadź na nich symulacje
		// kalkulatora z operatorami +,-,*,/. Wyświetl wyniki na konsoli.

		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe a: ");
		int a = odczyt.nextInt();
		System.out.println("Podaj liczbe b: ");
		int b = odczyt.nextInt();
		System.out.println("a + b= " + (a + b));
		System.out.println("a - b= " + (a - b));
		System.out.println("a * b= " + (a * b));
		System.out.println("a / b= " + (a / b) + " reszty: 5" + (a % b));

		// 2) Napisz metodę, która za pomocą Scannera wczyta 3 Stringi i sprawdzi, który
		// jest najdżuższy.
		System.out.println();
		Scanner odczyt2 = new Scanner(System.in);
		System.out.println("Podaj pierwszy ciag znakow: ");
		String pierwszy = odczyt2.nextLine();
		System.out.println("Podaj drugi ciag znakow: ");
		String drugi = odczyt2.nextLine();
		System.out.println("Podaj trzeci ciag znakow: ");
		String trzeci = odczyt2.nextLine();

		System.out.println();
		System.out.print("Najdluzszy jest ");
		if (pierwszy.length() < drugi.length() && drugi.length() < trzeci.length()) {
			System.out.print("trzeci");
		} else if (pierwszy.length() < drugi.length() && drugi.length() > trzeci.length()) {
			System.out.print("drugi");
		} else if (pierwszy.length() > drugi.length()) {
			System.out.print("pierwszy");
		}
		System.out.print(" ciag znakow");
		System.out.println();

		// 3) Wczytaj scannerem 5 liczb, przypisz je do tablicy, policz sumę tych
		// elementów
		System.out.println();
		int[] lista = new int[5];
		int suma = 0;
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Podaj liczbe: ");
			lista[i] = odczyt.nextInt();
			suma += lista[i];
		}
		System.out.print("podane liczby to: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.println("Suma tych liczb to: " + suma);
		
		// 4) Wczytuj scannerem kilka Stringów, przypisz je do wcześniej utworzonej
		// zmiennej typu String i wyświetl ją na konsoli.		
		
		String tekst = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("Podaj ciag znakow: ");
			tekst += odczyt2.next() + ", ";
		}
		System.out.println(tekst);
		System.out.println();
		
		// 5) Za pomoca JOptionpane wczytaj liczbę i sprawdź czy jest parzysta (można
		// zrobić to za pomocą metody)
		
		
		
		
		
	}

}