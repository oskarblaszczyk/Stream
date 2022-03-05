package petle;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print("Hej ");
		}

		System.out.println();

		int y = 0;

		while (y < 10) {
			System.out.print("Czesc ");
			y++;
		}

		//		while(true) {
		//			System.out.println("a");
		//		}
		//		
		System.out.println();

		// Wypisz na konsoli liczby od 1 do 20

		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Wypisz na konsoli liczby od 20 do 1
		for (int i = 20; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Wypisz na konsoli liczby od 1 do 20 oddzielone przecinkiem
		for (int i = 1; i < 20; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();

		// Za pomoc¹ pêtli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
		// dodaj napis'du¿a liczba'
		int a = 1;
		while (a <= 10) {
			if (a > 5) {
				System.out.print(a + " du¿a liczba,\t");
			}else {
				System.out.print(a + " ,");
			}
			a++;
		}
		System.out.println();
		int suma = 0;
		//Napisz program liczacy sume liczb z zakresu od 1 do 100
		for (int i = 1; i <= 100; i++) {
			suma += i;
		}
		System.out.println(suma);
		
		//Wypisz wszystkie liczby parzyste z zakresu 1-30				
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		
		System.out.println();
		
		// Napisac program, ktory liczy pole kwadratu dla boku n, który
		// przyjmuje wartosci od 1 do 10, uzyc petli while

		int n = 1;

		while (n <= 10) {
			System.out.println("pole dla boku: " + n + " wynosi: " + (n * n) + "cm^2");
			n++;
		}

	}

}
