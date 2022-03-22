package zadanie.przedszkole;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	private String nazwa;
	private String kolorScian;
	private Grupa grupa;

	private static List<Sala> ektensja = new ArrayList<>();

	public Sala(String nazwa, String kolorScian) {
		super();
		this.nazwa = nazwa;
		this.kolorScian = kolorScian;

	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getKolorScian() {
		return kolorScian;
	}

	public void setKolorScian(String kolorScian) {
		this.kolorScian = kolorScian;
	}

	public static List<Sala> getEktensja() {
		return ektensja;
	}

	public Grupa getGrupa() {
		return grupa;
	}

	public void setGrupa(Grupa grupa) {
		this.grupa = grupa;
	}

	@Override
	public String toString() {
		return "Sala [nazwa=" + nazwa + ", kolorScian=" + kolorScian + "]";
	}

}
