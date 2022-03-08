package uml.przyklady;

import java.util.*;

public class Szkolenie {

	private String nazwa;

	private List<Nauczyciel> nauczyciele = new ArrayList<>();

	public Szkolenie(String nazwa) {
		this.nazwa = nazwa;
	}

	public void dodajNauczyciela(Nauczyciel n) {
		nauczyciele.add(n);
		n.getSzkolenia().add(this);
	}
	
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Nauczyciel> getNauczyciele() {
		return nauczyciele;
	}

	@Override
	public String toString() {
		return "Szkolenie [nazwa=" + nazwa + "]";
	}

}
