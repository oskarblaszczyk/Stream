package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Zwierze {

	private String nazwa;
	private String gatunek;
	private Trener trener;

	private static List<Zwierze> ekstensja = new ArrayList<>();
	
	public Zwierze(String nazwa, String gatunek) {
		super();
		this.nazwa = nazwa;
		this.gatunek = gatunek;
	}

	public static List<Zwierze> nigdyNieTrenowane(List<Zwierze> zwierzeta) {
		List<Zwierze> bezTrenera = new ArrayList<>();
		for (Zwierze z : zwierzeta) {
			if (z.getTrener() == null) {
				bezTrenera.add(z);
			}
		}
		return bezTrenera;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}
	

	public static List<Zwierze> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Zwierze [nazwa=" + nazwa + ", gatunek=" + gatunek + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(gatunek, nazwa, trener);
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
//		Zwierze other = (Zwierze) obj;
//		return Objects.equals(gatunek, other.gatunek) && Objects.equals(nazwa, other.nazwa)
//				&& Objects.equals(trener, other.trener);
//	}

}
