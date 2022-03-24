package zadanie.zwierzyniec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UzytkowanieSprzetu {

	private LocalDate dataUzycia;
	private Sprzet sprzet;
	private Trener trener;

	private static List<UzytkowanieSprzetu> ekstensja = new ArrayList<>();

	public UzytkowanieSprzetu(LocalDate dataUzycia, Sprzet sprzet, Trener trener) {
		if(sprzet.getStopienZuzycia().equals("tragiczny")) {
			throw new IllegalArgumentException("sprzet zuzyty- napraw go");
		}
		this.dataUzycia = dataUzycia;
		this.sprzet = sprzet;
		this.trener = trener;

		sprzet.getUzycia().add(this);
		trener.getUzyciaSprzetu().add(this);
		ekstensja.add(this);
	}

	public LocalDate getDataUzycia() {
		return dataUzycia;
	}

	public void setDataUzycia(LocalDate dataUzycia) {
		this.dataUzycia = dataUzycia;
	}

	public Sprzet getSprzet() {
		return sprzet;
	}

	public void setSprzet(Sprzet sprzet) {
		this.sprzet = sprzet;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}

	public static List<UzytkowanieSprzetu> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "UzytkowanieSprzetu [dataUzycia=" + dataUzycia + ", sprzet=" + sprzet + ", trener=" + trener + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(dataUzycia, sprzet, trener);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		UzytkowanieSprzetu other = (UzytkowanieSprzetu) obj;
//		return Objects.equals(dataUzycia, other.dataUzycia) && Objects.equals(sprzet, other.sprzet)
//				&& Objects.equals(trener, other.trener);
//	}

}
