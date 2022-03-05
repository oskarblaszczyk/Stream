package uml.przyklady;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Szkola s1 = new Szkola("SP2", 2, LocalDate.of(1999, 5, 14));

		s1.dodajProfil("matfiz");
		s1.dodajProfil("biochem");
		System.out.println(s1.getProfile());

		Szkola s2 = new Szkola("SP23", 23, LocalDate.of(1999, 5, 14));

		System.out.println(Szkola.getMinLiczbaUczniow());

		Szkola.setMinLiczbaUczniow(200);

		System.out.println(Szkola.getMinLiczbaUczniow());

	}

}
