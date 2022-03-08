package uml.przyklady;

import java.util.*;

public class Nauczyciel extends Osoba {

	private String przedmiot;

	private List<Szkolenie> szkolenia = new ArrayList<>();

	public Nauczyciel(String imie, String nazwisko, String adres, String przedmiot) {
		super(imie, nazwisko, adres);
		this.przedmiot = przedmiot;
	}

	@Override
	public double obliczDochod() {
		return 1500;
	}

	public List<Szkolenie> getSzkolenia() {
		return szkolenia;
	}

	public String getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}

}
