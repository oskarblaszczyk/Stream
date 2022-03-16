package equals.hashcode;

import java.util.Objects;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private double pensja;

	public Pracownik(String imie, String nazwisko, double pensja) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pensja = pensja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(imie, nazwisko);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pracownik other = (Pracownik) obj;
		return Objects.equals(imie, other.imie) && Objects.equals(nazwisko, other.nazwisko);
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

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}

}
