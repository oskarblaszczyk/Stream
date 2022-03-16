package zadanie.durex;

import java.util.ArrayList;
import java.util.List;

public class Klient {
	private String imie;
	private String nazwisko;
	private String rozmiarPenisa;
	private List<Zakup> zakupy = new ArrayList<>();
	private static List<Klient> ekstensja = new ArrayList<>();

	public Klient(String imie, String nazwisko, String rozmiarPenisa) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rozmiarPenisa = rozmiarPenisa;
		ekstensja.add(this);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getRozmiarPenisa() {
		return rozmiarPenisa;
	}

	public void setRozmiarPenisa(String rozmiarPenisa) {
		this.rozmiarPenisa = rozmiarPenisa;
	}

	public List<Zakup> getZakupy() {
		return zakupy;
	}

	public void setZakupy(Zakup zakupy) {
		this.zakupy.add(zakupy);
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

}
