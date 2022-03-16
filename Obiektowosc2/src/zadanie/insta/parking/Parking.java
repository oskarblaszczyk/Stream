package zadanie.insta.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	private String nazwa;
	private String adres;
	private int iloscMiejsc = 150;
	private int iloscLadowarek = 10;
	private double szerokoscMiejsca = 2.5;
	private boolean dozwoloneLPG;
	private static List<Auto> zaparkowaneAuta = new ArrayList<>();
	private static List<Auto> zaparkowaneElektryki = new ArrayList<>();

	private static List<Parking> ekstensja = new ArrayList<>();

	public Parking(String nazwa, String adres, boolean dozwoloneLPG) {
		super();
		this.nazwa = nazwa;
		this.adres = adres;
		this.dozwoloneLPG = dozwoloneLPG;

		ekstensja.add(this);
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

	public int getIloscMiejsc() {
		return iloscMiejsc;
	}

	public void setIloscMiejsc(int iloscMiejsc) {
		this.iloscMiejsc = iloscMiejsc;
	}

	public int getIloscLadowarek() {
		return iloscLadowarek;
	}

	public void setIloscLadowarek(int iloscLadowarek) {
		this.iloscLadowarek = iloscLadowarek;
	}

	public double getSzerokoscMiejsca() {
		return szerokoscMiejsca;
	}

	public void setSzerokoscMiejsca(double szerokoscMiejsca) {
		this.szerokoscMiejsca = szerokoscMiejsca;
	}

	public boolean isDozwoloneLPG() {
		return dozwoloneLPG;
	}

	public void setDozwoloneLPG(boolean dozwoloneLPG) {
		this.dozwoloneLPG = dozwoloneLPG;
	}

	public static List<Auto> getZaparkowaneAuta() {
		return zaparkowaneAuta;
	}


	public static List<Parking> getEkstensja() {
		return ekstensja;
	}

	public static List<Auto> getZaparkowaneElektryki() {
		return zaparkowaneElektryki;
	}

	@Override
	public String toString() {
		return "Parking [nazwa=" + nazwa + ", adres=" + adres + "]";
	}

}
