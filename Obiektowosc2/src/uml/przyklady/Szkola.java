package uml.przyklady;

import java.time.LocalDate;
import java.util.*;

public class Szkola {

	private final String nazwa;
	private final LocalDate dataWybudowania;

	//atrybut powtarzalny- np dodanie do listy metoda
	private List<String> profile = new ArrayList<>();

	//atrybut opcjonalny- przeciazanie konstruktorow
	private String wyroznienie;

	//atrybut unikalny- dodanie metoda setNumer
	private int numer;

	//atrybut klasowy
	private static int minLiczbaUczniow = 150;

	private static List<Szkola> ekstensja = new ArrayList<>();

	private List<Uczen> uczniowie = new ArrayList<>();

	public Szkola(String nazwa, LocalDate dataWybudowania, int numer, String wyroznienie) {
		this.nazwa = nazwa;
		this.dataWybudowania = dataWybudowania;
		this.wyroznienie = wyroznienie;
		setNumer(numer);

		ekstensja.add(this);
	}

	public Szkola(String nazwa, int numer, LocalDate dataWybudowania) {
		this.nazwa = nazwa;
		this.dataWybudowania = dataWybudowania;
		setNumer(numer);

		ekstensja.add(this);
	}

	public void dodajUcznia(Uczen u) {
		
		if(u.getSzkola() != null) {
			throw new IllegalArgumentException("Uczen ma juz szkle");
		}
		
		uczniowie.add(u);
		//WAZNE informacja zwrotna
		u.setSzkola(this);
	}

	public void usunUcznia(Uczen u) {
		uczniowie.remove(u);
	}

	//atrybut wyliczalny
	public int wiek() {
		return LocalDate.now().getYear() - dataWybudowania.getYear();
	}

	public void dodajProfil(String profil) {
		profile.add(profil);
	}

	public void usunProfil(String profil) {
		profile.remove(profil);
	}

	public String getNazwa() {
		return nazwa;
	}

	public LocalDate getDataWybudowania() {
		return dataWybudowania;
	}

	public static int getMinLiczbaUczniow() {
		return minLiczbaUczniow;
	}

	public static void setMinLiczbaUczniow(int minLiczbaUczniow) {
		Szkola.minLiczbaUczniow = minLiczbaUczniow;
	}

	public static List<Szkola> getEkstensja() {
		return ekstensja;
	}

	public List<String> getProfile() {
		return profile;
	}

	public List<Uczen> getUczniowie() {
		return uczniowie;
	}

	public void setProfile(List<String> profile) {
		this.profile = profile;
	}

	public String getWyroznienie() {
		return wyroznienie;
	}

	public void setWyroznienie(String wyroznienie) {
		this.wyroznienie = wyroznienie;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		for (Szkola s : ekstensja) {
			if (s.getNumer() == numer) {
				throw new IllegalArgumentException("Numer nie moze sie powtarzac");
			}
		}
		this.numer = numer;
	}

	@Override
	public String toString() {
		return nazwa;
	}
}
