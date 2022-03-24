package zadania.turniej;

import java.util.ArrayList;
import java.util.List;

public class Pozycja {
	private String nazwaPozycji;
	private Gracz gracz;
	private Turniej turniej;
	
	private static List<Pozycja> ekstensja = new ArrayList<>();

	public Pozycja(String nazwaPozycji, Gracz gracz, Turniej turniej) {
		super();
		this.nazwaPozycji = nazwaPozycji;
		this.gracz = gracz;
		this.turniej = turniej;
	}

	public String getNazwaPozycji() {
		return nazwaPozycji;
	}

	public void setNazwaPozycji(String nazwaPozycji) {
		this.nazwaPozycji = nazwaPozycji;
	}

	public Gracz getGracz() {
		return gracz;
	}

	public Turniej getTurniej() {
		return turniej;
	}

	public static List<Pozycja> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Pozycja [nazwaPozycji=" + nazwaPozycji + ", gracz=" + gracz + ", turniej=" + turniej + "]";
	}
	
	
}
