package rower;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rower {
	private final String marka;
	private final String model;
	private final int rokProdukcji;
	private int nrSeryjny;
	private List<String> wyposazenie =  new ArrayList<>();
	private static int iloscKol = 2;

	private static List<Rower> ekstensja = new ArrayList<>();

	public Rower(String marka, String model, int rokProdukcji, int nrSeryjny) {
		super();
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
		setNrSeryjny(nrSeryjny);
		ekstensja.add(this);
	}

	public void dodajWyposazenie(String wyposazenie) {
		this.wyposazenie.add(wyposazenie);
	}

	public int wiek() {
		return LocalDate.now().getYear() - rokProdukcji;

	}

	public List<String> getWyposazenie() {
		return wyposazenie;
	}

	public void setWyposazenie(List<String> wyposazenie) {
		this.wyposazenie = wyposazenie;
	}

	public static int getIloscKol() {
		return iloscKol;
	}

	public static void setIloscKol(int iloscKol) {
		Rower.iloscKol = iloscKol;
	}

	public static List<Rower> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Rower> ekstensja) {
		Rower.ekstensja = ekstensja;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public int getNrSeryjny() {
		return nrSeryjny;
	}

	public void setNrSeryjny(int nrSeryjny) {
		for (Rower r : ekstensja) {
			if (r.getNrSeryjny() == nrSeryjny) {
				throw new IllegalArgumentException("Numer musi byc unikalny");
			}
		}
		this.nrSeryjny = nrSeryjny;
	}

	@Override
	public String toString() {
		return marka + " " + model;
	}

}
