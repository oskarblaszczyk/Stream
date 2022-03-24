package zadania.turniej;

import java.util.ArrayList;
import java.util.List;

public class Turniej {
	private String nazwa;
	private String miesiac; //dla uproszczenia string.
	private List<Punkty> punkty = new ArrayList<>();
	private List<Pozycja> pozycje = new ArrayList<>();
	
	private static List<Turniej> ekstensja = new ArrayList<>();

	public Turniej(String nazwa, String miesiac) {
		super();
		this.nazwa = nazwa;
		this.miesiac = miesiac;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getMiesiac() {
		return miesiac;
	}

	public void setMiesiac(String miesiac) {
		this.miesiac = miesiac;
	}

	public List<Punkty> getPunkty() {
		return punkty;
	}

	public List<Pozycja> getPozycje() {
		return pozycje;
	}

	public static List<Turniej> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Turniej [nazwa=" + nazwa + ", miesiac=" + miesiac + "]";
	}
	
	
	
	
	
}
