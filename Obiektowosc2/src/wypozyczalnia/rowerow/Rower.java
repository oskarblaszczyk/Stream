package wypozyczalnia.rowerow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import uml.przyklady.Szkola;

public class Rower {
	private final String marka;
	private final String model;
	private final int rokProdukcji;
	private int nrSeryjny;
	private List<String> wyposazenie = new ArrayList<>();
	private int wiek() {
		return LocalDate.now().getYear() - rokProdukcji;
	}
	private static int iloscKol = 2;
	
	
	
	public List<Rower> ekstensja = new ArrayList<>();
	
}
