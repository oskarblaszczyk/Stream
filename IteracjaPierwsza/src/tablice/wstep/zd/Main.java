package tablice.wstep.zd;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//Zadanie 1. 
		//Napisz program, który oblicza potêgê 2n
		//, gdzie liczbê naturaln¹ n podaje u¿ytkownik.
		//Dla n = 10, wynik to 210 = 1024

		System.out.println("\n Zadanie 1.\nPodaj liczbê naturaln¹:");
		int n = scan.nextInt();
		int wynik = 2;
		for (int i = 0; i < n - 1; i++) {
			wynik = wynik * 2;
		}
		System.out.println(wynik);

		//Zadanie 2. 
		//Napisz program drukujacy na ekranie prostokat z literek X. Wysokosc i szerokosc prostokata 
		//wczytujemy z klawiatury. 
		//Dla szerokosci = 10 oraz wysokosci = 4 tak powinien wygladac prostokat:
		//XXXXXXXXXX
		//X        X
		//X        X
		//XXXXXXXXXX
		System.out.println("\nZadanie 2.\nPodaj wysokosc prostokata:");
		int wysokosc = scan.nextInt();
		System.out.println("Podah szerokosc prostokata:");
		int szerokosc = scan.nextInt();
		String[][] prostokat = new String[wysokosc][szerokosc];
		for (int i = 0; i < prostokat.length; i++) {
			for (int j = 0; j < prostokat[i].length; j++) {
				if (i == 0 || i == prostokat.length - 1) {
					prostokat[i][j] = "X";
				} else {
					if (j == 0 || j == prostokat[i].length - 1) {
						prostokat[i][j] = "X";
					} else {
						prostokat[i][j] = " ";
					}
				}
			}

		}
		for (int i = 0; i < prostokat.length; i++) {
			for (int j = 0; j < prostokat[i].length; j++) {
				System.out.print(prostokat[i][j]);
			}
			System.out.println();
		}
		//Zadanie 3. 
		//Napisz program, który oblicza œredni¹ arytmetyczn¹ liczb naturalnych od 5 do liczby podanej 
		//przez u¿ytkownika. Wypisaæ obliczon¹ œredni¹ na konsoli.
		//Dla n = 9 program ma wypisaæ (5+6+7+8+9)/5 = 35/5= 7
		System.out.println("\nZadanie 3.\nPodaj liczbe naturalna:");
		int m = scan.nextInt();
		int[] temp = new int[m - 4];
		for (int i = 5; i <= m; i++) {
			temp[i - 5] = i;
		}
		int suma = 0;
		for (int i = 0; i < temp.length; i++) {
			suma += temp[i];
		}
		System.out.print("(");
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) {
				System.out.print(temp[i]);
			} else {
				System.out.print(temp[i] + "+");
			}
		}
		System.out.print(")/" + temp.length + " = " + suma + "/" + temp.length + "= " + (suma / temp.length));
		System.out.println();

		//Zadanie 4.
		//Zadeklaruj tablicê intów d³ugoœci 5 i wype³nij ja dowolnymi liczbami.
		//Wyœwietl ca³¹ tablice w pêtli for lub while
		System.out.println("\nZadanie 4:\nTablica wype³niona pseudolosowo:\n");
		int[] tablicaZ4 = new int[5];
		Random random = new Random();
		for (int i = 0; i < tablicaZ4.length; i++) {
			tablicaZ4[i] = random.nextInt(10) + 1;
		}
		for (int i = 0; i < tablicaZ4.length; i++) {
			System.out.print(tablicaZ4[i] + ", ");
		}

		//Zadanie 5.
		//Zadeklaruj tablice stringów dlugosci 4, dodaj do niej 4 wyrazy. W petli przypisz ka¿dy wyraz 
		//do wczeœniej utworzonej zmiennej typu string. Wyœwietl t¹ zmienn¹
		System.out.println("\nZadanie 5:\n");
		String[] tablicaZ5 = { "pierwszy", "drugi", "trzeci", "czwarty" };
		String wyraz = "";
		for (int i = 0; i < tablicaZ5.length; i++) {
			wyraz += tablicaZ5[i];
		}
		System.out.println(wyraz);
		//Zadanie 6. 
		//Zadeklaruj dwie tablice intów róznej dlugosci. Przypisz obu na indeksie 0 jakas liczbe.
		//Wyswietl tê tablicê która jest d³u¿sza (oczywiœcie zmiana d³ugoœci danej tablicy
		//powinna wp³ywaæ na wypisanie tablic)

		int[] tab5 = new int[5];
		int[] tab6 = new int[8];
		int[] dluzsza;

		tab5[0] = 1;
		tab6[0] = 2;

		if (tab5.length > tab6.length) {
			dluzsza = tab5;
		} else {
			dluzsza = tab6;
		}

		for (int i = 0; i < dluzsza.length; i++) {
			System.out.print(dluzsza[i] + ", ");
		}
	}

}
