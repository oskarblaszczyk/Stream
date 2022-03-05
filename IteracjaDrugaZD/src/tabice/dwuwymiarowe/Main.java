package tabice.dwuwymiarowe;

public class Main {

	public static void main(String[] args) {

		// Zadanie 1
		// Napisz program który tworzy tablicę dwuwymiarową 5x5, uzupełnia ją liczbami
		// naturlanymi od liczby podanej przez użytkownika (jako zmienna) w dół i liczy
		// sumę wszystkich wprowadzonych liczb.
		
		int[][] macierz = new int[5][5];
		int a = 0;
		int suma = 0;
		for (int i = 0; i < macierz.length; i++) {
			for (int j = 0; j < macierz[i].length; j++) {
				macierz[i][j] = a;
				System.out.print(macierz[i][j] + " ");
				suma += a;
				a--;

			}
			System.out.println();
		}
		System.out.println();
		System.out.println(suma);
		System.out.println();

		// Zadanie 2
		// Napisz program który tworzy tablicę dwuwymiarową 5x5 i uzupelnia ją kolejnymi
		// liczbami
		// naturalnymi zaczynając od 10, wypisz przekątną takiej macierzy idacą od lewej
		// do prawej, od góry do dołu.
		
		int[][] macierz2 = new int[5][5];
		int b = 10;
		for (int i = 0; i < macierz2.length; i++) {
			for (int j = 0; j < macierz2[i].length; j++) {
				macierz2[i][j] = b;
				if (i == j) {
					System.out.print(macierz2[i][j] + " ");
				} else {
					System.out.print("   ");
				}
				b++;
			}
			System.out.println();
		}
		System.out.println();
		
		// Zadanie 3
		// Napisz program który tworzy tablicę dwuwymiarową 8x8 i uzupelnia ją liczbami
		// podzielnymi przez 3 zaczynając od 10, wypisz całą macierz. Następnie wypisz
		// macierz w ten sposób, że liczby które są podzielne przez 4 wypisujemy, a
		// jeśli nie to wstawiamy w ich miejsce liczbę -1.		
		

		int[][] macierz3 = new int[8][8];
		int c = 10;
		for (int i = 0; i < macierz3.length; i++) {
			for (int j = 0; j < macierz3[i].length; j++) {
				if (c % 3 == 0) {
					macierz3[i][j] = c;
					System.out.print(macierz3[i][j] + " ");
				} else {
					j--;
				}
				c++;
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < macierz3.length; i++) {
			for (int j = 0; j < macierz3[i].length; j++) {
				if (macierz3[i][j] % 4 == 0) {
					System.out.print(macierz3[i][j] + " ");
				} else {
					macierz3[i][j] = -1;
					System.out.print(macierz3[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
