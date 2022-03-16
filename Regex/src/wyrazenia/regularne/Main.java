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
		
		Pattern pattern9 = Pattern.compile("[A-Z][a-z]{2,}( [A-Z][a-z]{2,})-(-[A-Z][a-z]{2,})?( [A-Z][a-z]{2,})?"); //zle
	}
}
