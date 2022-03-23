package zadanie.pracownik.klient;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class WyjazdAutem {
	private Pracownik pracownik;
	private Samochod samochod;
	private LocalDate dataWyjazdu;
	private LocalDate dataPowrotu;

	private static List<WyjazdAutem> ekstensja = new ArrayList<>();

	public WyjazdAutem(Pracownik pracownik, Samochod samochod, LocalDate dataWyjazdu, LocalDate dataPowrotu) {
		if (pracownik == null || samochod == null) {
			throw new IllegalArgumentException("pracownik oraz samochod nie moga byc null");
		}
		if(dataWyjazdu.isAfter(dataPowrotu)) {
			//wyjatek
		}
//		for (WyjazdAutem w : samochod.getWyjazdy()) {
//			if (Period.between(w.getDataPowrotu(), dataWyjazdu).isNegative()) {
//				throw new IllegalArgumentException("Data wyjazdu nie moze byc wczesniejsza niz powrot z innego wyjazdu");
//			}
//		}
//		for(WyjazdAutem w : pracownik.getWyjazdy()) {
//			if(Period.between(w.getDataPowrotu(), dataWyjazdu).isNegative()) {
//				throw new IllegalArgumentException("Data wyjazdu nie moze byc wczesniejsza niz powrot z innego wyjazdu");	
//			}
//		}
		this.pracownik = pracownik;
		this.samochod = samochod;
		this.dataWyjazdu = dataWyjazdu;
		this.dataPowrotu = dataPowrotu;

		ekstensja.add(this);
		pracownik.getWyjazdy().add(this);
		samochod.getWyjazdy().add(this);
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
