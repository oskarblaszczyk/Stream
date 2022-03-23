package wyrazenia.regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Tomek");
		Matcher matcher = pattern.matcher("Tomek lubi jesc lody");

		System.out.println(matcher.find());
		System.out.println(matcher.matches());
		System.out.println();

		// znak ? - element przed nim jest opcjonalny
		Pattern pattern1 = Pattern.compile("Tom?ek");
		System.out.println(pattern1.matcher("Tomek").matches());
		System.out.println(pattern1.matcher("Toek").matches());
		System.out.println(pattern1.matcher("Tomekk").matches());
		System.out.println(pattern1.matcher("Toek1").matches());
		System.out.println();

		// znak * - element przed nim moze wystapic 0 lub wiele razy
		Pattern pattern2 = Pattern.compile("Tom*ek");
		System.out.println(pattern2.matcher("Tommmmmek").matches());
		System.out.println(pattern2.matcher("Toek").matches());
		System.out.println(pattern2.matcher("Tomekk").matches());
		System.out.println(pattern2.matcher("Tomek1").matches());

		// znak + - element przed nim moze wystapic 1 lub wiele razy
		Pattern pattern3 = Pattern.compile("Tom+ek");
		System.out.println(pattern3.matcher("Tommmmmek").matches());
		System.out.println(pattern3.matcher("Toek").matches());
		System.out.println(pattern3.matcher("Tomekk").matches());
		System.out.println(pattern3.matcher("Tomek1").matches());

		// znak . - w miejsce kropki mozna wstawic dowolny element
		Pattern pattern4 = Pattern.compile("Tom.ek");
		System.out.println(pattern4.matcher("Tommek").matches());
		System.out.println(pattern4.matcher("Tom*ek").matches());
		System.out.println(pattern4.matcher("Tomek").matches());
		System.out.println(pattern4.matcher("Tomek1").matches());

		// {i} i razy

		// {i,} przynajmniej i razy

		// {i,j} od i do j razy

		Pattern pattern5 = Pattern.compile("Tom{3}ek");
		System.out.println(pattern5.matcher("Tommmek").matches());
		System.out.println(pattern5.matcher("Toek").matches());
		System.out.println(pattern5.matcher("Tomekk").matches());
		System.out.println(pattern5.matcher("Tomek1").matches());

		Pattern pattern6 = Pattern.compile("Tom{3,}ek");
		System.out.println(pattern6.matcher("Tommmek").matches());
		System.out.println(pattern6.matcher("Tommmmek").matches());
		System.out.println(pattern6.matcher("Tommmmek").matches());
		System.out.println(pattern6.matcher("Tomek").matches());

		Pattern pattern7 = Pattern.compile("Tom{3,5}ek");
		System.out.println(pattern7.matcher("Tommmek").matches());
		System.out.println(pattern7.matcher("Tommmmek").matches());
		System.out.println(pattern7.matcher("Tommmmmek").matches());
		System.out.println(pattern7.matcher("Tommmmmmek").matches());

		/*
		klasy - grupy symboli, oznaczane za pomoca nawiasow [ ] 
		[A-E] - jakakolwiek wielka litera od A do E
		[h-u] - jakakolwiek mala literka od h do u
		[A-Cg-z] - jakakolwiek wielka litera od A do C lub mala od go do z
		[H-g] - jajakolwiek wielka litera od H do Z lub od a do g
		[3-8] - jakakolwiek licba od 3 do 8
		[^a-c] - cokolwiek poza przedzialem od a do c
		*/

		// stwórz pattern na imie
		// Bartek
		// Bartek Tomek

		Pattern pattern8 = Pattern.compile("[A-Z][a-z]{2,}( [A-Z][a-z]{2,})?");

		// stwórz pattern na imie i nazwisko
		// Jan Korwin
		// Jan Korwin-Mikke
		// Jan Korwin Mikke
		// (a|b) a lub b

		Pattern pattern9 = Pattern.compile("[A-Z][a-z]{2,}( [A-Z][a-z]{2,})(( |-)[A-Z][a-z]{2,})?"); //zle- poprawione
		System.out.println(pattern9.matcher("Jan Korwin-Mikke").matches());

		/*
		 * \d - jakakolwiek cyfra
		 * \D - zaprzeczenie grupy \d
		 * \w - znaki uzywane w slowach [A-z0-9_]
		 * \W - zaprzeczenie grupy \w
		 * \s - whitespacy
		 * \S - zaprzeczenie \s
		 */

		Pattern pattern10 = Pattern.compile("\\d{1,3}");
		System.out.println(pattern10.matcher("23").matches());
		
		//napisz pattern na datê w postaci xx-xx-xxxx
		
		Pattern pattern11 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		System.out.println(pattern11.matcher("01-2-1999").matches());

		
		//napisz pattern na maila
		// ab.a-a_a1a
		// @gmail.com
		// @o2.com.pl
		Pattern pattern12 = Pattern.compile("\\w{1,}@\\w{1,}\\.[a-z]{1,}");
		
	    /*
	     * Sprawdz czy liczba zmiennoprzecinkowa podana przez u¿ytkownika ma poprawny format. Na przyk³ad liczba 123,2341515132135 czy 
	     * -10 s¹ poprawne ale 18-12 czy 123, ju¿ nie,
	     */
		
		Pattern pattern13 = Pattern.compile("-?\\d*(,\\d*)?");
		
		/*
		 * sprawdz czy numer domu jest w formacie numer\numer. 
		 * Poprawnym numerem jest 123\2A, 24B\3 czy 12\5, ale ju¿ numer abc\cba nie,
		 */
		
		
		
		//napisz pattern na miasto np Warszawa, Bielsko-Biala, Zielona Gora
		
		//napisz metode zamien(int ilosc, String waluta) ktora dzia³a jak kantor, pokazuje ile mozesz kupic danej waluty za podana liczbe euro
		//czyli np zamien(100, "PLN") powinno wypluc 439,79		
		String kursy = "{\"rates\":{\"CAD\":1.5563,\"HKD\":9.1212,\"ISK\":162.6,\"PHP\":57.324,\"DKK\":7.4441,\"HUF\":350.68,\"CZK\":26.083,\"AUD\":1.6442,"
				+ "\"RON\":4.8405,\"SEK\":10.363,\"IDR\":17383.99,\"INR\":88.198,\"BRL\":6.5908,\"RUB\":87.735,\"HRK\":7.5243,\"JPY\":124.53,\"THB\":37.161,"
				+ "\"CHF\":1.0744,\"SGD\":1.6131,\"PLN\":4.3979,\"BGN\":1.9558,\"TRY\":8.5925,\"CNY\":8.1483,\"NOK\":10.5913,\"NZD\":1.8045,\"ZAR\":20.2977,"
				+ "\"USD\":1.1769,\"MXN\":26.066,\"ILS\":4.0029,\"GBP\":0.89755,\"KRW\":1403.15,\"MYR\":4.9194},\"base\":\"EUR\",\"date\":\"2020-08-21\"}";
	
		/*
		 * Stworz klase Osoba(imie,nazwisko, pesel, plec)
		 * 
		 * 1) Sprawdz czy pesel jest poprawny - czy sklada sie z 11 znakow, samych cyfr itp
		 * 
		 * 2) Sprawdz czy pesel odpowiada podanej p³ci
		 * 
		 * 3) Napisz metody które zwracaja z peselu date urodzenia (LocalDAte)
		 */
	}
}
