package zadanie.przedszkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Wychowawca extends Osoba {
	private double pensja;
	private Kwalifikacje kwalifikacja;
	private List<Grupa> grupy = new ArrayList<>();

	private static List<Wychowawca> ekstensja = new ArrayList<>();

	public Wychowawca(String imie, String nazwisko, LocalDate dataUrodzenia, Kwalifikacje kwalifikacje) {
		super(imie, nazwisko, dataUrodzenia);
		this.kwalifikacja = kwalifikacje;
		setPensja();

		ekstensja.add(this);
	}

	public double getPensja() {
		return pensja;
	}

	private void setPensja() {
		if (kwalifikacja == Kwalifikacje.TYMCZASOWY) {
			this.pensja = 2500;
		} else if (kwalifikacja == Kwalifikacje.KWALIFIKOWANY) {
			this.pensja = 3500;
		}
	}

	public static List<Wychowawca> pensjaPowyzejKwalifikowany (double pensja) {
		List<Wychowawca> pensjaPowyzej = new ArrayList<>();
		for(Wychowawca w : kwalifikowaniWychowawcy()) {
			if(w.getKwalifikacje().equals(Kwalifikacje.KWALIFIKOWANY) && w.getPensja() > pensja) {
				pensjaPowyzej.add(w);
			}
		}
		return pensjaPowyzej;
	}

	public static List<Wychowawca> kwalifikowaniWychowawcy() {
		List<Wychowawca> kwalifikowani = new ArrayList<>();
		for(Wychowawca w : ekstensja) {
			if(w.getKwalifikacje().equals(Kwalifikacje.KWALIFIKOWANY)) {
				kwalifikowani.add(w);
			}
		}
		return kwalifikowani;
	}

	public Kwalifikacje getKwalifikacje() {
		return kwalifikacja;
	}

	public void setKwalifikacje(Kwalifikacje kwalifikacja) {
		this.kwalifikacja = kwalifikacja;
	}

	public List<Grupa> getGrupy() {
		return grupy;
	}

}
