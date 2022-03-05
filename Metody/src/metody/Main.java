package metody;

public class Main {

	public static void main(String[] args) {

		wyswietlSlowo();
		System.out.println(zwrocSlowo());
		String str = zwrocSlowo();

		System.out.println(zwrocLiczbe(5));
		System.out.println(zwrocLiczbe(10));

		System.out.println(zwrocLiczbe(1, 2));

		String imei = "Agnieszka";
		System.out.println(imei.substring(2, 6));

		System.out.println(silnia(5));
		System.out.println(silniaRec(5));
		System.out.println(wiekszaJednosc(21));
		System.out.println(sumaCyfr(2525));
	}

	// metoda typu void - nic nie zwraca
	public static void wyswietlSlowo() {
		System.out.println("witam");
	}

	// metoda ktora deklaruje typ zwracany np Stringa, inta, tablice itd
	public static String zwrocSlowo() {
		return "siema";
	}

	// przeciazanie metod
	public static int zwrocLiczbe(int a) {
		return a + 10;
	}

	public static int zwrocLiczbe(int a, int b) {
		return a + 20;
	}

	// Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"
	public static String dzienDobry(String str) {
		return str + " dzien dobry";
	}

	// Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr
	public static int sumaDwoch(int a, int b) {
		return a + b;
	}

	// Stworz metode ktora zwraca dluszzy z dwoch podanych jako parametr Stringow
	public static String dluzszyString(String a, String b) {
		// warunek   ? co gdy true : co gdy false
		return a.length() < b.length() ? b : a;
		//		if (a.length() < b.length()) {
		//			return b;
		//		}
		//		return a;
	}

	// Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako
	// parametr gdy liczby s¹ równe zwracamy 0
	public static double wiekszyDouble(double a, double b) {
		return a < b ? b : a == b ? 0 : a;
	}

	// Napisz metode ktora jako argument (parametr) przyjmuje
	// 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
	public static int mnozenieSumy(int a, int b, int c) {
		return (a + b) * c;
	}

	// Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta
	public static boolean czyParzysta(int a) {
		return a % 2 == 0;
	}

	// Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z podanych liczb jest z przedzialu [13,19] 
	// to zwrocona wartosc to zawsze 19
	public static int sumaLiczb(int a, int b) {
		return a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19 : a + b;

	}

	//Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
	// jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
	// metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie na dany litera³ ³ancuchowy
	// zddy -> zzyy
	// zasd -> zzz
	// asdy -> yyy
	// pusty string -> pusty string
	// z -> zzz 
	// y -> yyy
	// zy -> zzyy
	// a -> a
	// bb -> bb

	public static String zwrocZzz(String str) {
		if (str.startsWith("z") && str.endsWith("y")) {
			return "zzyy";
		} else if (str.startsWith("z")) {
			return "zzz";
		} else if (str.endsWith("y")) {
			return "yyy";
		}
		return str;
	}

	//Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
	//xbadxxx - true
	//badxxx - true
	//xxbadxx - false
	public static boolean zleSlowo(String str) {
		if (str.length() <= 3 && !str.startsWith("bad")) {
			return false;
		} else if (str.startsWith("bad") || str.startsWith("bad", 1)) {
			return true;
		}
		return false;
	}

	// Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.
	public static int ileRazy(String str, char znak) {
		int suma = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == znak) {
				suma++;
			}
		}
		return suma;
	}

	//Napisz metodê obliczaj¹ca silniê z podanej liczby

	public static int silnia(int a) {
		int result = 1;
		for (int i = 1; i <= a; i++) {
			result = i;
		}
		return result;
	}

	public static int silniaRec(int a) {
		if (a == 0) {
			return 1;
		} else {
			return (silniaRec(a - 1));
		}
	}

	// napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
	// jednosci od cyfry dziesiatek

	public static boolean wiekszaJednosc(int a) {
		return (a % 10) > (a / 10) ? true : false;
	}
	// Napisz funkcjê, która wyznacza sumê cyfr podanej liczby ca³kowitej.

	public static int sumaCyfr(int a) {
		int result = 0;
		String str = Integer.toString(a);
		for (int i = 0; i < str.length(); i++) {
			result += Integer.parseInt(str.substring(i, i + 1));
		}
		return result;

	}

	// 851828
	public static int sumaCyfr2(int a) {
		int result = 0;

		while (a != 0) {
			result += a % 10;
			result /= 10;
		}
		return result;

	}

	// Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
	// dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
	// uwzglednic ze a^0 = 1
	// uwzglednic ze a^-b = 1/(a^b)
	public static int potega (int a, int b) {
		//return (int) Math.pow(a,b);
		int wynik = 1;
		for (int i = 1; i <= b; i++) {
			wynik *= a;
		}
		return wynik;
	}

	// Napisz funkcje, ktora stwierdza, czy zadana jako parametr liczba calkowita
	// jest kwadratem
	// pewnej liczby calkowitej. Liczby bedace kwadratami liczb calkowitych to 1, 4,
	// 9, 16 itd.
	// Wartosci funkcji ma byc prawda, jesli liczba spelnia warunek oraz falsz w
	// przeciwnym wypadku. Math.sqrt(x) zwraca pierwiastek z x
	// sqrt(16) = 4 czyli ok bo liczba ca³kowita
	// sqrt(17) - 4.2 czyli nie ok bo liczba nieca³kowita :)
	public static boolean czyKwadrat (int a) {
		//boolean wynik = true;
		//double pierwiastek = Math.sqrt(a);
		//if (pierwiastek % 1 != 0) {
		//	wynik = false;
		//}
		//return wynik;
		return Math.sqrt(a) % 1 == 0 ? true : false;
	}
	// Wypisz dzielniki liczby naturalnej podanej jako parametr
	// np dla 16 wynik to 1,2,4,8,16
	public static void dzielniki (int a) {
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
