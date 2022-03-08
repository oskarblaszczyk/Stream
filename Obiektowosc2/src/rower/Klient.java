package rower;

import java.util.ArrayList;
import java.util.List;

public class Klient {
	private String imie;
	private String nazwisko;
	private int id;
	private List<Wypozyczalnia> wypozyczalnia;

	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko, int id) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.id = id;
		ekstensja.add(this);
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public int getId() {
		return id;
	}

	public List<Wypozyczalnia> getWypozyczalnia() {
		return wypozyczalnia;
	}

	@Override
	public String toString() {
		return "Klient [imie=" + imie + "]";
	}

}
