package zmienne;

public class Main {

	public static void main(String[] args) {

		/*
		 * w nazwach nie uzywamy polskich znakow
		 * nazwy projektow i klas - z wielkich liter + cammel casy np IteracjaPierwsza
		 * nazwy paczek z malych liter + kropki np java.kurs.pl
		 * nazwy zmiennych i metod - z malych liter + cammel casy np imiePsa 
		 * 
		 * syso + ctrl + spacja - skrót na System.out.pritln()
		 * 
		 * ctrl + shift + F - skrót na autojustowanie kodu
		 * 
		 * alt + shift + r - refactor
		 */

		System.out.println("Witam świecie");
		System.out.println("Witam świecie");
		System.out.println("Witam świecie");
		System.out.println();

		System.out.print("Witam świecie");
		System.out.print("Witam świecie");
		System.out.print("Witam świecie");
		System.out.println();

		// znaki specjalne
		// \n - znak nowego wiersza
		System.out.println("Agata\nTomek");

		// \t - znak tabulacji
		System.out.println("Agata\tTomek");

		//wyswietl pare napisow na konsoli, wykorzystaj skrot na syso i justowanie kodu
		//wykorzystaj znaki specjalne
		System.out.println("Ala\nTomek\ttest");

		// zmienne

		// typZmiennej nazwaZmiennej = wartosc;

		// zmienna typu String - literał łańcuchowy, po prostu tekst
		String imie = "Lukasz";
		System.out.println(imie);

		// to nie jest stworzenie nowej zmiennej tylko NADPISANIE juz isteniajcej
		imie = "Tomek";
		System.out.println(imie);

		// int - liczby całkowite
		int liczbaCalkowita = 5;
		System.out.println(liczbaCalkowita);

		// double - liczby rzeczywiste
		double liczbaRzeczywista = 4.38;
		System.out.println(liczbaRzeczywista);

		// char - znak (pojedynczy znak z klawiatury)
		char znak = '#';
		System.out.println(znak);

		// boolean - true/false
		boolean wartosc = true;
		System.out.println(wartosc);

		// Zadeklaruj zmienne ktore poznalas i wypisz je na konsoli
		// nastepnie przypisz do niej inna wartosc i znowu ja wypisz na konsoli
		int wiek = 20;
		System.out.println(wiek);

		double liczba = 1234;
		System.out.println(liczba);

		char znak2 = '?';
		System.out.println(znak2);

		boolean prawdaFalsz = false;
		System.out.println(prawdaFalsz);

		String napis = "tekst1234";
		System.out.println(napis);

		// operator + 
		int a = 4, b = 6;
		String txt1 = "kot", txt2 = "pies";

		// dla typow liczbowych + dziala jako zwykle matematyczne dodawanie
		System.out.println(a + b);

		// dla Stringa i innego typu to + zadziała jako operator konkatenacji czyli scalenia
		System.out.println(txt1 + " " + txt2);
		System.out.println(txt1 + a + b);
		System.out.println(a + b + txt1);
		System.out.println(txt1 + (a + b));
		System.out.println();

		// Zadeklaruj dwie zmienne typu double i wykonaj działania za pomoca operatorów: +, -, *, /
		double liczba1 = 2.5, liczba2 = 2.2;
		System.out.println(liczba1 + liczba2);
		System.out.println(liczba1 - liczba2);
		System.out.println(liczba1 * liczba2);
		System.out.println(liczba1 / liczba2);

		// Zadeklaruj zmienna typu int i String i wykonaj na nich dzialania +,-,*,/
		//przestowac operatory +,-,*,/ dla innyc zmiennych
		//np pomiedzy doublem i Stringiem, Stringiem i booleanem, intem i doublem
		//i intem i booleanem
		int zmienna3 = 10;
		String tekst3 = "zadanie";
		System.out.println(zmienna3 + tekst3);
		//		System.out.println(zmienna3 - tekst3);
		//		System.out.println(zmienna3 * tekst3);
		//		System.out.println(zmienna3 / tekst3);

		double zmienna4 = 1.234;
		boolean wartosc2 = true;
		char znak21 = 'A';
		System.out.println(zmienna3 + zmienna4);
		System.out.println(zmienna3 - zmienna4);
		System.out.println(zmienna3 * zmienna4);
		System.out.println(zmienna3 / zmienna4);

		// char + liczba (char zmaienia sie na wartosc kodu ascii)
		System.out.println(znak21 + 0);

		//Stworzyc prosty kalkulator, zadeklaruj dwie zmienne typu double
		//Stworzyc mozliwosc wypisania na konsoli dzialan matematycznych +,-,*,/
		//double x=4, y=5;        double suma=x+y; syso(suma)
		//Suma 4 i 8 wynosi 12
		//R�nica 4 i 8 wynosi -4

		double x = 4, y = 5;

		double suma = x + y;
		System.out.println("Suma " + x + " i " + y + " wynosi " + suma);

		/*
		 * Stwórz zmienna typu String. Wyswietl jej dlugosc (metoda length()->wygoogluj)
		 * 
		 * Stwórz zmienne imie, nazwisko, adres, wiek i wypisz informacje które w nich
		 * przechowujesz w jednym syso ale tak zeby kazda informacja byla w nowej
		 * linijce
		 * 
		 * Stwórz dwie zmienne typu int i w jednej linii wypisz ich sume, roznice,
		 * iloczyn i iloraz, uzyj znakow specjalnych
		 */

		//Przetestuj powyzsze dzialania np z * i /
		int i = 5;
		System.out.println(i);

		//zwiekszenie liczby o 2
		i = i + 2;
		System.out.println(i);

		//to to samo co linijke wyzej, ale LADNIEJ
		i += 3;
		System.out.println(i);

		//zwiekszenie liczby o 1
		i++;
		System.out.println(i);

		//zmniejszenie liczby o 1
		i--;
		System.out.println(i);

		String ileLiter = "test";
		int dlugosc = ileLiter.length();
		System.out.println(dlugosc);
		System.out.println(ileLiter.length());
		
		String imie1 = "Oskar";
		String nazwisko = "Blaszczyk";
		String adres = "Mojesz";
		String wiek1 = "33";
		System.out.println(imie1 + "\n" + nazwisko + "\n" + adres + "\n" + wiek1 + "\n");

		int liczba6 = 8, liczba7 = 7;
		//char suma1 = '+', roznica = '-', iloczyn = '*', iloraz = '/';
		System.out.println(liczba6 + " + " + liczba7 + " = " + (liczba6 + liczba7) + ";\t" + liczba6 + " - " + liczba7
				+ " = " + (liczba6 - liczba7) + ";\n" + liczba6 + " * " + liczba7 + " = " + (liczba6 * liczba7) + ";\t "
				+ liczba6 + " / " + liczba7 + " = " + (liczba6 / liczba7) + ";");
		System.out.println();

		System.out.print(liczba6 + " + " + liczba7 + " = " + (liczba6 + liczba7) + ";\t");
		System.out.print(liczba6 + " - " + liczba7 + " = " + (liczba6 - liczba7) + ";\t");
		System.out.print(liczba6 + " * " + liczba7 + " = " + (liczba6 * liczba7) + ";\t ");
		System.out.print(liczba6 + " / " + liczba7 + " = " + (liczba6 / liczba7) + ";\n");

		System.out.println();
		System.out.println("liczba6 to: " + liczba6);
		System.out.println("zwiekszenie o 3:  " + (liczba6 += 3));
		liczba6++;
		System.out.println("zwiekszenie o 1:  " + liczba6++);
		System.out.println("zwiekszone wczesniej:  " + liczba6);
		System.out.println(liczba6 + 1);
		System.out.println(liczba6);
		System.out.println(i);

	}

}
