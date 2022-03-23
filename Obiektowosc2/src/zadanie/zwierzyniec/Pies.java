package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pies extends Zwierze {
	private String dlugoscSiersci;
	private List<String> ulubionaZabawka;

	private static List<Pies> ekstensja = new ArrayList<>();

	public Pies(String nazwa, String gatunek, String dlugoscSiersci) {
		super(nazwa, gatunek);
		this.dlugoscSiersci = dlugoscSiersci;

		ekstensja.add(this);
	}

	public String getDlugoscSiersci() {
		return dlugoscSiersci;
	}

	public void setDlugoscSiersci(String dlugoscSiersci) {
		this.dlugoscSiersci = dlugoscSiersci;
	}

	public List<String> getUlubionaZabawka() {
		return ulubionaZabawka;
	}

	public void setUlubionaZabawka(List<String> ulubionaZabawka) {
		this.ulubionaZabawka = ulubionaZabawka;
	}

	public static List<Pies> getEkstensja() {
		return ekstensja;
	}

	
}
