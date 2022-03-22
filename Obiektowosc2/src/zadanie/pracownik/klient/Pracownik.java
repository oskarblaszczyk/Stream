package zadanie.pracownik.klient;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pracownik implements Comparable<Pracownik> {

	private String imie;
	private String nazwisko;
	private String adres;
	private Double pensja;
	private List<WyjazdAutem> wyjazdy = new ArrayList<>();

	private static List<Pracownik> ekstensja = new ArrayList<>();

	public Pracownik(String imie, String nazwisko, String adres, double pensja) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.pensja = pensja;

		ekstensja.add(this);
	}

	// Top 3 pracownikow dla przekazanej listy
	public static List<Pracownik> pracownicyTop3(List<Pracownik> pracownicy) {
		if (pracownicy == null) {
			throw new IllegalArgumentException("Lista pracownicy nie moze byc nullem");
		}
		List<Pracownik> top3 = new ArrayList<>();
		top3.addAll(pracownicy);
		Collections.sort(top3);
		Collections.reverse(top3);
		return top3.subList(0, 3);
	}

	// Top3 pracownikow dla calej Klasy
	public static List<Pracownik> pracownicyTop3() {
		List<Pracownik> top3 = new ArrayList<>();
		if(ekstensja.isEmpty()) {
			throw new IllegalArgumentException("Brak dodanych pracownikow");
		}
		if(ekstensja.size() < 3) {
			throw new IllegalArgumentException("za malo dodanych pracownikow");
		}
		top3.addAll(ekstensja);
		Collections.sort(top3);
		Collections.reverse(top3);
		return top3.subList(0, 3);
	}

	// Ilosc wyjazdow pracownika wszystkimi samochodami
	public int ileWyjazdow() {
		int ilosc = 0;
		for (WyjazdAutem w : WyjazdAutem.getEkstensja()) {
			if (w.getPracownik().equals(this)) {
				ilosc++;
			}
		}
		return ilosc;
	}

	// ilosc wyjazdow pracownika konkretnym samochodem
	public int ileWyjazdow(Samochod samochod) {
		int ilosc = 0;
		for (WyjazdAutem w : WyjazdAutem.getEkstensja()) {
			if (w.getPracownik().equals(this) && w.getSamochod().equals(samochod)) {
				ilosc++;
			}
		}
		return ilosc;
	}

	// dugosc wszystkich wyjazdow dla pracownika
	public Period dlugoscWyjazdow() {
		Period suma = Period.ZERO;
		for (WyjazdAutem w : wyjazdy) {
			suma = suma.plus(dlugoscWyjazdu(w));
		}
		return suma;
	}

	// dugosc konkretnego wyjazdu dla pracownika
	public Period dlugoscWyjazdu(WyjazdAutem wyjazd) { // jak to dziala? co dalej?
		Period period = Period.between(wyjazd.getDataWyjazdu(), wyjazd.getDataPowrotu());
		if (period.isNegative()) {
			throw new IllegalArgumentException("Data powrotu nie moze byc wczesniejsza");
		}
		return period;
	}

	// dlugosc wszystkich wyjazdow konkretnym samochodem dla pracownika
	public Period dlugoscWyjazduAuto(Samochod sam) {
		Period suma = Period.ZERO;
		for (WyjazdAutem w : wyjazdy) {
			if (w.getSamochod().equals(sam)) {
				suma = suma.plus(dlugoscWyjazdu(w));
			}
		}
		return suma;
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

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	public static List<Pracownik> getEkstensja() {
		return ekstensja;
	}

	public List<WyjazdAutem> getWyjazdy() {
		return wyjazdy;
	}

	public void setPensja(Double pensja) {
		this.pensja = pensja;
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

	@Override
	public int compareTo(Pracownik o) {
		int porownaniePensji = pensja.compareTo(o.pensja);
		return porownaniePensji;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adres, imie, nazwisko, pensja);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pracownik other = (Pracownik) obj;
		return Objects.equals(adres, other.adres) && Objects.equals(imie, other.imie)
				&& Objects.equals(nazwisko, other.nazwisko) && Objects.equals(pensja, other.pensja);
	}

}
