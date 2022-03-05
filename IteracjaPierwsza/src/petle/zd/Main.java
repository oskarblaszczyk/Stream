package petle.zd;

public class Main {

	public static void main(String[] args) {
		System.out.println("\tZadania pêtle FOR");

		// Zad1
		// Napisz program deklarujac zmienna X,
		// która wyswietli na ekranie liczby od 4 do X,
		System.out.print("Zad1: ");

		int x = 10;
		for (int i = 4; i <= x; i++) {
			System.out.print(i + ", ");
		}

		System.out.println();

		// Zad2
		// Napisz program, która wypisze na ekranie
		// wszystkie liczby nieparzyste od -10 do 40.
		System.out.print("Zad2: ");

		for (int i = -10; i <= 40; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		// Zad3
		// Napisz program, który wypisze sume liczb od
		// liczby zadeklarowanej a, do drugiej liczby zadeklarowanej b
		// np a=5, b=10, suma = 5+6+7+8+9+10= 45
		System.out.print("Zad3: ");

		int a = 5;
		int b = 10;
		int suma = a;
		System.out.print("a= " + a + ", b= " + b + ", suma= ");
		for (int i = a; i < b; i++) {
			System.out.print(i + "+");
			suma += (i + 1);
			if (i == (b - 1)) {
				System.out.print((i + 1) + "= " + suma);
			}
		}
		System.out.println();

		//Zad4 DODATKOWE
		//Napisz program liczacy silnie, 5! = 1*2*3*4*5
		System.out.print("Zad4: ");
		int liczba = 5;
		int silnia = 1;
		System.out.print("silnia " + liczba + "! = ");
		for (int i = 1; i <= liczba; i++) {
			silnia *= i ;
			System.out.print(i + "*");
			if (i == (liczba - 1)) {
				System.out.print((i + 1) + "= " + silnia);
			}
		}
		System.out.println("\n");
		System.out.println("\tZadania pêtle While ");
		//	  Zad 1
		//	  Napisac program, który liczy pole kwadratu dla boku n, który
		//	  przyjmuje wartosci od 1 do 10, uzyc petli while
		System.out.println("Zad1 :");
		int n = 1;
		while (n <= 10) {
			System.out.println("pole dla boku: " + n + " wynosi: " + (n * n) + "cm^2");
			n++;
		}
		System.out.println();
		//   Zad 2
		//   Napisac program, który oblicza srednia arytmetyczna liczb 
		//   naturalnych od 5 do liczby podanej przez uzytkownika.
		//   Wypisac obliczona srednia na ekranie monitora.
		//   Dla n = 9 program ma wypisac (5+6+7+8+9)/5 = 35/5= 7			
		System.out.println("Zad2 :");
		int liczbaStartowa = 5;
		int liczbaPodana = 9;
		int sumaLiczb = 0;
		int iloscLiczb = 0;
		int srednia = 0;
		System.out.print("(");
		while (liczbaStartowa < liczbaPodana) {
			sumaLiczb += liczbaStartowa;
			System.out.print(liczbaStartowa + "+");
			if (liczbaStartowa == (liczbaPodana - 1)) {
				iloscLiczb++;
				sumaLiczb += liczbaStartowa + 1;
				srednia = (sumaLiczb - 5) / iloscLiczb;
				System.out.print((liczbaStartowa + 1) + ")/5 = " + sumaLiczb + "/5=" + srednia);
			}
			liczbaStartowa++;
			iloscLiczb++;
		}
		System.out.println("\n");

		//Zad 3
		//Napisac program, który oblicza potege 2^n, 
		//gdzie liczbe naturalna n podaje uzytkownik.
		//dla n = 10, wynik to 2^10 = 1024

		System.out.println("Zad3 :");
		int d = 1;
		int potega = 10;
		int podstawaPotegi = 2;
		while (d < potega) {
			podstawaPotegi = podstawaPotegi * 2;
			d++;
		}
		System.out.println(podstawaPotegi);

		//Zad 4
		//Napisz program drukujacy na ekranie prostokat z literek X. 
		//Wysokosc i szerokosc prostokata wczytujemy z klawiatury:
		//Dla szerokosci = 10 oraz wysokosci = 4 tak powinien wygladac prostokat:
		//	XXXXXXXXXX
		//	X 	     X
		//	X        X
		//	XXXXXXXXXX 
		System.out.println("\nZad4 :");
		int wysokosc = 4;
		int szerokosc = 10;
		int i = 0;
		int j = 0;
		while (i < wysokosc) {
			if (i != 0) {
			System.out.print("\n");
			}
			j = 0;
			while (j < szerokosc) {
				if (i == 0 || i == (wysokosc - 1)) {
					System.out.print("X");
				} else if (i != 0 && i != (szerokosc - 1)) {
					if (j == 0 || j == (szerokosc - 1)) {
						System.out.print("X");
					} else {
					
						System.out.print(" ");
					}
				}

				j++;
			}

			i++;
		}
	}

}
