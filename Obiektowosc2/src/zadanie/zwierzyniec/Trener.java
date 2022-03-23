package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trener {
	private String imie;
	private String nazwisko;
	private String adres;
	private List<Zwierze> trenowaneZwierzeta;
	private List<UzytkowanieSprzetu> uzyciaSprzetu = new ArrayList<>();

	private static List<Trener> ekstensja = new ArrayList<>();

	public Trener(String imie, String nazwisko, String adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;

		ekstensja.add(this);
	}

	// - w przypadku remisu zwracamy jednego trenera, pierwszego porownanego
	// - jezeli zaden nie trenowal zwierzat zwracamy pierwszego (remis)
	public static Trener trenowalNajwiecejZwierzat(List<Trener> trenerzy) {
		if (trenerzy == null || trenerzy.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nulll ani pusta");
		}
		Trener najlepszy = trenerzy.get(0);
		for (Trener t : trenerzy) {
			if (t.trenowaneZwierzeta.size() > najlepszy.trenowaneZwierzeta.size()) {
				najlepszy = t;
			}
		}
		return najlepszy;
	}

	// nie podoba mi sie to musze dopracowac
	// znowu zwracam jednego jak remis lub 0
	public static Trener uzywalNajwiecejRazy(List<Trener> trenerzy, Sprzet sprzet) {
		if (trenerzy == null || trenerzy.isEmpty()) {
			throw new IllegalArgumentException("nie moze byc nul ani pusta");
		}
		Trener trener = trenerzy.get(0);
		int iloscTrener = 0;
		for (Trener t : trenerzy) {
			int ilosc = 0;
			for (UzytkowanieSprzetu u : t.getUzyciaSprzetu()) {
				if (u.getSprzet().equals(sprzet)) {
					ilosc++;
				}
			}
			if (ilosc > iloscTrener) {
				trener = t;
				iloscTrener = ilosc;
			}
		}
		return trenerzy.get(0);
	}

	
	public static List<Trener> trenowaliZwierze(List<Trener> trenerzy, Zwierze zwierze, String gatunek) {
		if (trenerzy == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem");
		}
		List<Trener> trenowali = new ArrayList<>();
		for (Trener t : trenerzy) {
			for (Zwierze z : t.getTrenowaneZwierzeta()) {
				if (z.equals(zwierze) && z.getGatunek().equals(gatunek)) {
					trenowali.add(t);
				}
			}
		}
		return trenowali;
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

	public List<Zwierze> getTrenowaneZwierzeta() {
		return trenowaneZwierzeta;
	}

	public void setTrenowaneZwierzeta(List<Zwierze> trenowaneZwierzeta) {
		this.trenowaneZwierzeta = trenowaneZwierzeta;
	}

	public static List<Trener> getEkstensja() {
		return ekstensja;
	}

	public List<UzytkowanieSprzetu> getUzyciaSprzetu() {
		return uzyciaSprzetu;
	}

	public void setUzyciaSprzetu(List<UzytkowanieSprzetu> uzyciaSprzetu) {
		this.uzyciaSprzetu = uzyciaSprzetu;
	}

	@Override
	public String toString() {
		return "Trener [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adres, imie, nazwisko, trenowaneZwierzeta, uzyciaSprzetu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trener other = (Trener) obj;
		return Objects.equals(adres, other.adres) && Objects.equals(imie, other.imie)
				&& Objects.equals(nazwisko, other.nazwisko)
				&& Objects.equals(trenowaneZwierzeta, other.trenowaneZwierzeta)
				&& Objects.equals(uzyciaSprzetu, other.uzyciaSprzetu);
	}

}
