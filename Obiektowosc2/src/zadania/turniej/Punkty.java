package zadania.turniej;

import java.util.ArrayList;
import java.util.List;

public class Punkty {
	private int iloscPunktow;
	private Gracz gracz;
	private Turniej turniej;
	
	private static List<Punkty> ekstensja = new ArrayList<>();

	public Punkty(int iloscPunktow, Gracz gracz, Turniej turniej) {
	
		this.iloscPunktow = iloscPunktow;
		this.gracz = gracz;
		this.turniej = turniej;
		
		ekstensja.add(this);
		
	}

	public int getIloscPunktow() {
		return iloscPunktow;
	}

	public void setIloscPunktow(int iloscPunktow) {
		this.iloscPunktow = iloscPunktow;
	}

	public Gracz getGracz() {
		return gracz;
	}

	public Turniej getTurniej() {
		return turniej;
	}

	public static List<Punkty> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Punkty [iloscPunktow=" + iloscPunktow + ", gracz=" + gracz + ", turniej=" + turniej + "]";
	}
	
	
	

}
