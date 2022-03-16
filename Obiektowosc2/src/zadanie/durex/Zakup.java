package zadanie.durex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zakup {
	private final Klient klient;
	private final LocalDate data;
	private List<Produkt> produkty = new ArrayList<>();
	private double wartosc;

	private static List<Zakup> ekstensja = new ArrayList<>();

	public Zakup(Klient klient, LocalDate data, List<Produkt> produkty) {
		super();
		this.klient = klient;
		this.data = data;
		setProdukty(produkty);
		klient.getZakupy().add(this);
		//klient.setZakupy(this); //tak lepiej?
		ekstensja.add(this);
	}

	public static Zakup najdrozszeZakupy(List<Zakup> zakupy) {
		if (zakupy == null || zakupy.isEmpty()) {
			throw new IllegalArgumentException("Lista nie moze byc nullem ani byc pusta");
		}
		Zakup najdrozszy = zakupy.get(0);
		for (Zakup z : zakupy) {
			if (z.getWartosc() > najdrozszy.getWartosc()) {
				najdrozszy = z;
			}
		}
		return najdrozszy; //moge miec zakupy bez dodanych produktow gdzie wartosc == null !!! sprawdzic- juz nie
	} // moge miec cene null?? sprawdzone i nie ale....

	public static List<Zakup> kupioneDurex(List<Zakup> zakupy) {
		if (zakupy == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem");
		}
		List<Zakup> wynik = new ArrayList<>();
		for (Zakup z : zakupy) {
			for (Produkt p : z.getProdukty()) {
				if (p.getNazwa().toLowerCase().contains("durex")) {
					wynik.add(z);
				}
			}
		}
		return wynik; // wyjatek jak brak produktow (null)??-edycja: produkty dodwane w konstr. + wyjatek w setprodukty
	}

	public static List<Klient> zlyRozmiar(List<Zakup> zakupy) {
		if (zakupy == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem");
		}
		List<Klient> zleWybrali = new ArrayList<>();
		for (Zakup z : zakupy) {
			for (Produkt p : z.getProdukty()) {
				//to mi sie nie podoba, co z klientem bez pomiarow?
				//poprawione :D ale dalej cos nie tak bo nie za ladnie to wyglada
				if (z.getKlient().getRozmiarPenisa() == null) {
					throw new IllegalArgumentException("skierowac klienta " + z.getKlient() + " na pomiary");
				}
				if (p.getRozmiar() != null
						&& !p.getRozmiar().toLowerCase().contains(z.getKlient().getRozmiarPenisa().toLowerCase())) {
					zleWybrali.add(z.getKlient());
				}
			}
		}
		return zleWybrali;
	}

	public Klient getKlient() {
		return klient;
	}

	public LocalDate getData() {
		return data;
	}

	public List<Produkt> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Produkt> produkt) {
		// wyjatek dla listy null? brak mozliwosci aby taka byla ze wzgledu na wymaganie w konstruktorze.
		// edycja: trzeba podac liste ale mozna wskazac null :D
		if (produkt == null) {
			throw new IllegalArgumentException("lista nie moze b y nullem");
		}
		for (Produkt p : produkt) {
			if (p.getZakup() != null) {
				throw new IllegalArgumentException(p + " zostal kupiony przez kogos innego");
			}
			produkty.add(p);
			dodajWartosc(p.getCena());
			p.setZakup(this);
		}
	}

	public double getWartosc() {
		return wartosc;
	}

	public void dodajWartosc(double wartosc) {
		this.wartosc += wartosc;
	}

	public static List<Zakup> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Zakup " + klient + ", dnia=" + data + ", za kwote" + wartosc;
	}

}
