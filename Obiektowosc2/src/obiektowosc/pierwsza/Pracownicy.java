package obiektowosc.pierwsza;

public class Pracownicy {
	private final String imie;
	private final String nazwisko;
	private String dzial;
	private String stanowisko;
	private Samochod autoSluzbowe;
	private int pensja;

	public Pracownicy(String imie, String nazwisko, String dzial, String stanowisko, Samochod autoSluzbowe,
			int pensja) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dzial = dzial;
		this.stanowisko = stanowisko;
		this.autoSluzbowe = autoSluzbowe;
		this.pensja = pensja;
	}

	public String getDzial() {
		return dzial;
	}

	public void setDzial(String dzial) {
		this.dzial = dzial;
	}

	public String getStanowisko() {
		return stanowisko;
	}

	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}

	public Samochod getAutoSluzbowe() {
		return autoSluzbowe;
	}

	public void setAutoSluzbowe(Samochod autoSluzbowe) {
		this.autoSluzbowe = autoSluzbowe;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

}
