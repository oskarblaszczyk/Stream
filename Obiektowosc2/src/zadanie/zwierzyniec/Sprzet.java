package zadanie.zwierzyniec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sprzet {
	private String nazwa;
	private String stopienZuzycia; //dla uproszczenia String bez kontroli podaneo argumentu
	private List<LocalDate> dataNaprawy;
	private List<UzytkowanieSprzetu> uzycia;

	private static List<Sprzet> ekstensja = new ArrayList<>();

	public Sprzet(String nazwa, String stopienZuzycia) {
		super();
		this.nazwa = nazwa;
		this.stopienZuzycia = stopienZuzycia;

		ekstensja.add(this);
	}

	public void napraw() {
		if (stopienZuzycia.equals("tragiczny")) {
			stopienZuzycia = "uzywane";
			dataNaprawy.add(LocalDate.now());
		} else {
			throw new IllegalArgumentException("Sprzet sprawny nie ma co naprawiac");
		}
	}

	private static List<Sprzet> naprawianyNRazy(List<Sprzet> sprzet, int n) {
		if (sprzet == null) {
			throw new IllegalArgumentException("Lista nie moze byc null");
		}
		List<Sprzet> naprawianyN = new ArrayList<>();
		for (Sprzet s : sprzet) {
			if (s.getDataNaprawy().size() >= n) {
				naprawianyN.add(s);
			}
		}
		return naprawianyN;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getStopienZuzycia() {
		return stopienZuzycia;
	}

	public void setStopienZuzycia(String stopienZuzycia) {
		this.stopienZuzycia = stopienZuzycia;
	}

	public List<LocalDate> getDataNaprawy() {
		return dataNaprawy;
	}

	public void setDataNaprawy(List<LocalDate> dataNaprawy) {
		this.dataNaprawy = dataNaprawy;
	}

	public List<UzytkowanieSprzetu> getUzycia() {
		return uzycia;
	}

	public void setUzycia(List<UzytkowanieSprzetu> uzycia) {
		this.uzycia = uzycia;
	}

	public static List<Sprzet> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Sprzet [nazwa=" + nazwa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNaprawy, nazwa, stopienZuzycia, uzycia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sprzet other = (Sprzet) obj;
		return Objects.equals(dataNaprawy, other.dataNaprawy) && Objects.equals(nazwa, other.nazwa)
				&& Objects.equals(stopienZuzycia, other.stopienZuzycia) && Objects.equals(uzycia, other.uzycia);
	}

}
