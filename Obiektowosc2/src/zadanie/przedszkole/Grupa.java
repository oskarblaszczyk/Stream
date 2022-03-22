package zadanie.przedszkole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Grupa {
	private String nazwa;
	private int maxIloscDzieci = 15;
	private Sala sala;
	private List<Dziecko> dzieci = new ArrayList<>();
	private Wychowawca wychowawca;

	private static List<Grupa> ekstensja = new ArrayList<>();

	// Grupa musi miec Sale, Wychowawca oraz conajmniej jedno dziecko( ale z drugiej
	// strony mozna zrobic grupe i pozniej dodawac do niej dzieci)

	public Grupa(String nazwa, Sala sala, Wychowawca wychowawca, List<Dziecko> dzieci) {
		if (dzieci == null || dzieci.isEmpty()) {
			throw new IllegalArgumentException("Grupa musi miec conajmniej jedno dziecko");
		}
		if (dzieci.size() > maxIloscDzieci) {
			throw new IllegalArgumentException("grupa moze miec nie wiecej ni: " + maxIloscDzieci);
		}
		this.nazwa = nazwa;
		this.sala = sala;
		this.wychowawca = wychowawca;
		this.dzieci.addAll(dzieci);
		sala.setGrupa(this);
		wychowawca.getGrupy().add(this);

		ekstensja.add(this);
	}

	public void zapisPlik(Wychowawca wychowawca) throws IOException {
		File plik = new File(wychowawca.getImie() + "_" + wychowawca.getNazwisko() + "_grupa_" + this.getNazwa());
		FileWriter fw = new FileWriter(plik);
		for (Dziecko dz : getDzieci()) {
			fw.write(dz.getImie() + " " + dz.getNazwisko() + "\n");
		}

		fw.close();
	}

	public void odczytPlikuWychowawca(Wychowawca wychowawca) throws IOException {
		File plik = new File(wychowawca.getImie() + "_" + wychowawca.getNazwisko() + "_grupa_" + this.getNazwa());
		FileReader fr = new FileReader(plik);
		BufferedReader br = new BufferedReader(fr);

		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();

	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getMaxIloscDzieci() {
		return maxIloscDzieci;
	}

	public void setMaxIloscDzieci(int maxIloscDzieci) {
		this.maxIloscDzieci = maxIloscDzieci;
	}

	public Sala getSala() {
		return sala;
	}

	public List<Dziecko> getDzieci() {
		return dzieci;
	}

	public void dodajDziecko(Dziecko dziecko) {
		if (dzieci.size() > maxIloscDzieci) {
			throw new IllegalArgumentException("grupa moze miec nie wiecej niz: " + maxIloscDzieci);
		}
		this.dzieci.add(dziecko);
	}

	public Wychowawca getWychowawca() {
		return wychowawca;
	}

	public void setWychowawca(Wychowawca wychowawca) {
		this.wychowawca = wychowawca;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public static List<Grupa> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Grupa [nazwa=" + nazwa + ", maxIloscDzieci=" + maxIloscDzieci + ", sala=" + sala + "]";
	}

}
