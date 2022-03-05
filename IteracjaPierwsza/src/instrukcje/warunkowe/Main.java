package instrukcje.warunkowe;

public class Main {

	public static void main(String[] args) {

		/*
		 * = przypisanie 
		 * == równa sie 
		 * != nierówna siê
		 * >, >=, <, <=
		 * && and (logiczne i, koniunkcja)
		 * ||or (logiczne lub, alternatywa) 
		 * % - modulo, reszta z dzielenia
		 */

		System.out.println(5 != 4);

		System.out.println(3 >= 1 && 4 > 6);
		System.out.println(3 >= 1 || 4 > 6);

		System.out.println(5 % 3);

		// instrukcja warunkowa
		// if(warunek)

		int a = 1;

		if (a > 5) {
			System.out.println(a + " jest wieksze od 5");
		} else if (a == 5) {
			System.out.println("Liczba jest równa 5");
		} else {
			System.out.println(a + " jest mniejsza od 5");
		}

		System.out.println();

		// switch case 

		int ocena = 1;

		switch (ocena) {
		case 2:
			System.out.println("Nie zaliczyles");
			break;
		case 3:
			System.out.println("Zdales ledwo");
			break;
		case 4:
			System.out.println("Zdales spoko");
			break;
		case 5:
			System.out.println("Zdales bardzo dobrze");
			break;
		default:
			System.out.println("niepoprawna ocena");

		}

		// Zrób intstrukcje switch case, dla wartosci String
		// niech bedzie to reprezentacja miesiecy i w zaleznosci od
		// podanego miesiaca podac klimat

		String miesiac = "marzec";

		switch (miesiac) {
		case "styczen":
			System.out.println("zima");
			break;
		case "luty":
			System.out.println("zima");
			break;
		case "marzec":
			System.out.println("wiosna");
			break;
		case "kwiecien":
			System.out.println("wiosna");
			break;
		case "maj":
			System.out.println("wiosna");
			break;
		case "czerwiec":
			System.out.println("lato");
			break;
		case "lipiec":
			System.out.println("lato");
			break;
		}

		// Sprawdz czy podana liczba typu double jest dodatnia, czy jest rowna 0, czy
		// jest ujemna

		double liczba1 = 1.2;

		if (liczba1 > 0) {
			System.out.println("liczba dodatnia");
		} else if (liczba1 < 0) {
			System.out.println("liczba ujemna");
		} else {
			System.out.println("liczba = 0");
		}

		// Zadeklaruj 2 zmienne typu int, wyswietl która z tych dwoch liczb jest
		// wieszka i o ile, np dla 4 i 1 chcemy wyswietlic: 4 jest wieksze od 1 o 3

		int b = 0, c = 1;

		if (b > c) {
			System.out.println(b + " jest wieksze od " + c + " o " + (b - c));
		} else if (b < c) {
			System.out.println(b + " jest mniejsze od " + c + " o " + (c - b));
		} else {
			System.out.println(b + " jest rowne");
		}

		// Napisz program sprawdzajacy czy podana liczba jest parzysta

		int d = 3;

		if (d % 2 == 0) {
			System.out.println(d + " jest parzyste");
		} else {
			System.out.println(d + " nie jest parzyste");
		}
		// Sprawdzmy czy zadeklarowana liczba typu double, nalezy do przedzialu (1,4)
		// czy moze [6,8], czy jest spoza przedzialu
		double e = 8;

		if (e > 1 && e < 4) {
			System.out.println(e + " zawiera sie w przedziale (1,4)");
		} else if (e >= 6 && e <= 8) {
			System.out.println(e + " zawiera sie w przedziale <>");
		} else {
			System.out.println("nie zawiera sie w podanych przedzialach");
		}

		// Sprawdz czy srednia dwoch liczb typu double jest wieksza od 4
		double f = 2, g = 3;

		if ((f + g) / 2 > 4) {
			System.out.println("srednia jest wieksza od 4");
		} else if ((f + g) / 2 < 4) {
			System.out.println("srednia jest mniejsza od 4");
		} else {
			System.out.println("srednia jest rowna");
		}

		// Sprawdz czy suma 3 liczb jest podzielna przez 3
		int h = 5, i = 2, j = 3;

		if ((h + i + j) % 3 == 0) {
			System.out.println("jest podzielna");
		}else {
			System.out.println("nie jest podzielna");
		}

		// Sprawdz czy dlugosc podanego Stringa jest wieksza od 5
		String napis = "napiss";
		
		if (napis.length() > 5) {
			System.out.println("dlugosc " + napis + " jest wieksza od 5");
		}else {
			System.out.println("nie jest");
		}

		
		
		
		
	}

}
