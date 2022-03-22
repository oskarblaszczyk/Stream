package zadanie.pracownik.klient;

import java.util.ArrayList;
import java.util.List;

public class Samochod {

	private String model;
	private String marka;
	private List<WyjazdAutem> wyjazdy = new ArrayList<>();
	
	private static List<Samochod> ekstensja = new ArrayList<>();

	public Samochod(String model, String marka) {
		super();
		this.model = model;
		this.marka = marka;

		ekstensja.add(this);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public static List<Samochod> getEkstensja() {
		return ekstensja;
	}

	public List<WyjazdAutem> getWyjazdy() {
		return wyjazdy;
	}

	@Override
	public String toString() {
		return model + " " + marka;
	}

}
