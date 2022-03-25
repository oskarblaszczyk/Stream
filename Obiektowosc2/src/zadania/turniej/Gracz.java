package zadania.turniej;

import java.util.ArrayList;
import java.util.List;

public class Gracz {
	private String imie;
	private String nazwisko;
	private List<Punkty> punkty = new ArrayList<>();
	private List<Pozycja> pozycje = new ArrayList<>();

	private static List<Gracz> ekstensja = new ArrayList<>();

	public Gracz(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	// pisane na szybko, nieprzemyslane
	// musze zrobic testy z wywolywanie metod pomocniczych i efektywnoscia.
	// Oczywiscie w przpadku remisu zwracamy tego ostatniego, tresc zadania zaklada ze jest tylko jeden
	public static Gracz najlepszyWTurnieju(List<Gracz> gracze, String nazwaTurnieju) {
		if (gracze == null || gracze.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta ani null");
		}
		Gracz najlepszy = gracze.get(0);
		int punktyTemp = 0;
		for (Gracz g : gracze) {
			int ilosc = 0;
			for (Punkty p : g.getPunkty()) {
				if (p.getTurniej().equals(nazwaTurnieju)) {
					ilosc = p.getIloscPunktow();
				}
			}
			if (ilosc > punktyTemp) {
				najlepszy = g;
				punktyTemp = ilosc;
			}
		}
		if(punktyTemp == 0) {
			throw new IllegalArgumentException("brak najlepszych w danym turnieju");
		}
		return najlepszy;
	}
	
	
//	public static Gracz najwiecejMiejsc(List<Gracz> gracze, int zajeteMiejsce) {
//		if(gracze == null || gracze.isEmpty()) {
//			throw new IllegalArgumentException("Lista nie moze byc null ani pusta");
//		}
//		Gracz najlepszy = gracze.get(0);
//		int iloscTemp = 0;
//		for(Gracz g : gracze) {
//			int ilosc = 0;
//			for(g.getPunkty())
//		}
//	}

	public String getImie() {
		return imie;
	}

	
//	public int zajeteMiejsce(Turniej turniej) {
//		
//		getPunkty().get(0).getTurniej().equals(turniej)
//	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public List<Punkty> getPunkty() {
		return punkty;
	}

	public void setPunkty(List<Punkty> punkty) {
		this.punkty = punkty;
	}

	public List<Pozycja> getPozycje() {
		return pozycje;
	}

	public void setPozycje(List<Pozycja> pozycje) {
		this.pozycje = pozycje;
	}

	public static List<Gracz> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Gracz [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}

}
