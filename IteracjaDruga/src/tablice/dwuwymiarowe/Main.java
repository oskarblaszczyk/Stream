package tablice.dwuwymiarowe;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[][] macierz = new int[5][6];

		//ilosc wierszy
		System.out.println(macierz.length);

		//ilosc kolumn
		System.out.println(macierz[0].length);

		macierz[0][0] = 4;//przypisanie liczby 4 do 0 wiersza i 0 kolumny
		macierz[3][4] = 6;
		macierz[1][0] = 3; //przypisanie wartosci 3 do 1 wiersza, 0 kolumny

		//petla zewnetrzna
		for (int i = 0; i < macierz.length; i++) {
			//petla wewnetrzna
			for (int j = 0; j < macierz[0].length; j++) {
				System.out.print(macierz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int[][] macierz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 6 } };

		//petla zewnetrzna
		for (int i = 0; i < macierz2.length; i++) {
			//petla wewnetrzna
			for (int j = 0; j < macierz2[i].length; j++) {
				System.out.print(macierz2[i][j] + " ");
			}
			System.out.println();
		}

		//Zadeklaruj macierz 6x6 i wype³nij ja liczbami od 10 w gore
		//policzyc sume wszystkich elementow w macierzy
		System.out.println();

		int[][] macierz5 = new int[6][6];

		int z = 10;
		int suma = 0;

		for (int i = 0; i < macierz5.length; i++) {
			for (int j = 0; j < macierz5[i].length; j++) {
				macierz5[i][j] = z;
				suma += z;
				z++;
				System.out.print(macierz5[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(suma);
		System.out.println();

		//wypisac powyzsza macierz w odwrotnej kolejnosci
		for (int i = macierz5.length - 1; i >= 0; i--) {
			for (int j = macierz5[i].length - 1; j >= 0; j--) {
				System.out.print(macierz5[i][j] + " ");
			}
			System.out.println();
		}

		//wypisz z powyzszej macierzy przekatna od lewej górnej do prawej dolnej
		System.out.println();

		for (int i = 0; i < macierz5.length; i++) {
			for (int j = 0; j < macierz5[i].length; j++) {
				if (i == j) {
					System.out.print(macierz5[i][j] + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}

		/*Stwórzmy macierz 4x4 i wpiszmy do niej liczby podzielne przez 3 zaczynajac od 10.
		  Wszystkie liczby niepodzielne przez 4 zast¹p -1, wypisz cala macierz
		*/

		int[][] macierz4 = new int[4][4];
		int y = 10;

		for (int i = 0; i < macierz4.length; i++) {
			for (int j = 0; j < macierz4[i].length; j++) {
				if (y % 3 == 0) {
					macierz4[i][j] = y;
				} else {
					j--;
				}
				y++;
			}
		}
		System.out.println();

		for (int i = 0; i < macierz4.length; i++) {
			for (int j = 0; j < macierz4[i].length; j++) {
				if (macierz4[i][j] % 4 != 0) {
					macierz4[i][j] = -1;
				}
			}
		}
		System.out.println();

		for (int i = 0; i < macierz4.length; i++) {
			for (int j = 0; j < macierz4[i].length; j++) {
				System.out.print(macierz4[i][j] + " ");
			}
			System.out.println();
		}

		//zadeklaruj macierz o wymiarach 5x8, wypelnij ja liczbami losowymi z zakresu
		//10-90, znajdz najwieksza i najmniejsza wartosc oraz srednia arytmetyczna
		//sprawdz czy wiecej jest liczb mniejszych od 50 czy wiekszych badz rownych 50
		int[][] macierz6 = new int[5][8];

		Random random = new Random();

		//	for (int i = 0; i < 20; i++) { // (0 - 9) + 5 -> 5-14
		//		System.out.print(random.nextInt(10) + " ");
		//	}

		System.out.println();

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int suma2 = 0;
		int mniejsze = 0;
		int wieksze = 0;
		for (int i = 0; i < macierz6.length; i++) {
			for (int j = 0; j < macierz6[i].length; j++) {
				macierz6[i][j] = random.nextInt(81) + 10;
				if (min > macierz6[i][j]) {
					min = macierz6[i][j];
				} 
				if (max < macierz6[i][j]) {
					max = macierz6[i][j];
				}
				suma += macierz6[i][j];
				if (macierz6[i][j] < 50) {
					mniejsze++;
				}else {
					wieksze++;
				}
				
				System.out.print(macierz6[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("najmniejsza= " + min + "\nnajwieksza= " + max + "\nsrednia= " + (suma2 / (macierz6.length*macierz6[0].length)) + "\n");
		if (mniejsze < wieksze) {
			System.out.println("wiecej jest wiekszych badz rownych niz 50");
		}else {
			System.out.println("jest rowne");
		}
	}

}
