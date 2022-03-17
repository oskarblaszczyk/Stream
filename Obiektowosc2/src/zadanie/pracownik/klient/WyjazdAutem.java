package zadanie.pracownik.klient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WyjazdAutem {
	private LocalDate dataWyjazdu;
	private LocalDate dataPowrotu;
	private Samochod samochod;
	private Pracownik pracownik;

	private static List<WyjazdAutem> ekstensja = new ArrayList<>();

	public WyjazdAutem(LocalDate dataWyjazdu, LocalDate dataPowrotu) {
		super();
		this.dataWyjazdu = dataWyjazdu;
		this.dataPowrotu = dataPowrotu;
	}

	public LocalDate getDataWyjazdu() {
		return dataWyjazdu;
	}

	public void setDataWyjazdu(LocalDate dataWyjazdu) {
		this.dataWyjazdu = dataWyjazdu;
	}

	public LocalDate getDataPowrotu() {
		return dataPowrotu;
	}

	public void setDataPowrotu(LocalDate dataPowrotu) {
		this.dataPowrotu = dataPowrotu;
	}

	public Samochod getSamochod() {
		return samochod;
	}

	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}

	public Pracownik getPracownik() {
		return pracownik;
	}

	public void setPracownik(Pracownik pracownik) {
		this.pracownik = pracownik;
	}

	public static List<WyjazdAutem> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "WyjazdAutem [dataWyjazdu=" + dataWyjazdu + ", dataPowrotu=" + dataPowrotu + "]";
	}

}
