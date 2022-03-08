package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Osoba {

	private String numerIndeksu;
	private Szkola szkola;

	private List<Ocena> oceny = new ArrayList<>();

	public Uczen(String imie, String nazwisko, String adres, String numerIndeksu) {
		super(imie, nazwisko, adres);
		this.numerIndeksu = numerIndeksu;
	}

	@Override
	public double obliczDochod() {
		return 350;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}

	public String getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(String numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}

	public Szkola getSzkola() {
		return szkola;
	}

	public void setSzkola(Szkola szkola) {
		this.szkola = szkola;
	}

}
