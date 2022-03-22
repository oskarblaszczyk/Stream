package zadanie.przedszkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dziecko extends Osoba {
	private String odznaka;
	private List<String> przewinienia = new ArrayList<>();

	private static List<Dziecko> ekstensja = new ArrayList<>();

	public Dziecko(String imie, String nazwisko, LocalDate dataUrodzenia, String odznaka) {
		super(imie, nazwisko, dataUrodzenia);
		this.odznaka = odznaka;

		ekstensja.add(this);
	}

	// "nie wykonywac operacji na ekstensji"- moge ekstensje wykorzystac do
	// porownania? czy lepiej przekazac liste dzieci do metody - mozliwosc
	// pozniejszego np sprawdzenia dzieci z konkretnej grupy

	// co z dziecmi co nie maja wcale prewinien?

	public static Dziecko najwiecejPrzewinien(List<Dziecko> dzieci) {
		if (dzieci == null || dzieci.isEmpty()) {
			throw new IllegalArgumentException("brak dzieci do porownania");
		}
		Dziecko porownanie = dzieci.get(0);
		for (Dziecko dz : dzieci) {
			if (dz.getPrzewinienia().size() > porownanie.getPrzewinienia().size()) {
				porownanie = dz;
			}
		}
		if (porownanie.getPrzewinienia().isEmpty()) {
			return null;
		} else {
			return porownanie;
		}
	}

	public String getOdznaka() {
		return odznaka;
	}

	public void setOdznaka(String odznaka) {
		this.odznaka = odznaka;
	}

	public List<String> getPrzewinienia() {
		return przewinienia;
	}

	public void dodajPrzewinienie(String przewinienie) {
		this.przewinienia.add(przewinienie);
	}

	public void setPrzewinienia(List<String> przewinienia) {
		this.przewinienia = przewinienia;
	}

}
