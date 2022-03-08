package rower;

import java.util.*;

public class Wypozyczalnia {
	private String nazwa;
	private String adres;
	private List<Klient> klienci = new ArrayList<>();
	private List<Rower> rowery = new ArrayList<>();
	
	public Wypozyczalnia(String nazwa, String adres) {
		super();
		this.nazwa = nazwa;
		this.adres = adres;
	}
	
	public void dodajRower(Rower r) {
		if (r.getWypozyczalnia() != null) {
			throw new IllegalArgumentException("Rower jest juz w wypozyczalni");
		}
		rowery.add(r);
		r.setWypozyczalnia(this);
	}
	
	public void dodajKlienta(Klient k) {
		klienci.add(k);
		k.getWypozyczalnia().add(this);
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	@Override
	public String toString() {
		return "Wypozyczalnia [nazwa=" + nazwa + "]";
	}
	
	
	
	
}
