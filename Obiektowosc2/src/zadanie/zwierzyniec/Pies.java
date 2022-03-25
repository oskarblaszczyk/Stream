package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;

public class Pies extends Zwierze {
	private String dlugoscSiersci;
	private List<String> ulubionaZabawka = new ArrayList<>();

	private static List<Pies> ekstensja = new ArrayList<>();

	public Pies(String nazwa, String gatunek, String dlugoscSiersci) {
		super(nazwa, gatunek);
		this.dlugoscSiersci = dlugoscSiersci;

		ekstensja.add(this);

	}

	public String getDlugoscSiersci() {
		return dlugoscSiersci;
	}

	public void setDlugoscSiersci(String dlugoscSiersci) {
		this.dlugoscSiersci = dlugoscSiersci;
	}

	public List<String> getUlubionaZabawka() {
		return ulubionaZabawka;
	}

	public void setUlubionaZabawka(List<String> ulubionaZabawka) {
		this.ulubionaZabawka = ulubionaZabawka;
	}

	//	public static List<Pies> getEkstensja() {
	//		return ekstensja;
	//	}

	//	@Override
	//	public int hashCode() {
	//		final int prime = 31;
	//		int result = super.hashCode();
	//		result = prime * result + Objects.hash(dlugoscSiersci, ulubionaZabawka);
	//		return result;
	//	}
	//
	//	@Override
	//	public boolean equals(Object obj) {
	//		if (this == obj)
	//			return true;
	//		if (!super.equals(obj))
	//			return false;
	//		if (getClass() != obj.getClass())
	//			return false;
	//		Pies other = (Pies) obj;
	//		return Objects.equals(dlugoscSiersci, other.dlugoscSiersci)
	//				&& Objects.equals(ulubionaZabawka, other.ulubionaZabawka);
	//	}

}
