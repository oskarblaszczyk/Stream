package wyrazenia.regularne;

import java.util.regex.Pattern;

public class Osoba {
	private String imie;
	private String nazwisko;
	private String pesel;

	public Osoba(String imie, String nazwisko, String pesel) {
		setImie(imie);
		setNazwisko(nazwisko);
		setPesel(pesel);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
		if (pattern.matcher(imie).matches()) {
			this.imie = imie;
		} else {
			throw new IllegalArgumentException("podano zle imie");
		}
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		Pattern pattern = Pattern.compile("([A-Z][a-z]{2,})(( |-)[A-Z][a-z]{2,})?");
		if (pattern.matcher(nazwisko).matches()) {
			this.nazwisko = nazwisko;
		} else {
			throw new IllegalArgumentException("podano zle nazwisko");
		}
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		Pattern pattern = Pattern.compile("\\d{11}");
		if (pattern.matcher(pesel).matches()) {
			this.pesel = pesel;
		} else {
			throw new IllegalArgumentException("Podano nieprawidlowy pesel");
		}
	}

	public String setPlec() {
		if (Character.getNumericValue(pesel.charAt(9)) % 2 == 0) {
			return "kobieta";
		}
		return "mezczyzna";
	}

	@Override
	public String toString() {
		return imie + " " + nazwisko;
	}

}
