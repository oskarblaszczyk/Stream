package zadanie.insta.parking;

import java.util.ArrayList;
import java.util.List;

public class Auto {
	private String marka;
	private String model;
	private double szerokosc;
	private String paliwo;
	private Parking parking;

	private static List<Auto> ekstensja = new ArrayList<>();

	public Auto(String marka, String model, double szerokosc, String paliwo) {
		super();
		this.marka = marka;
		this.model = model;
		this.szerokosc = szerokosc;
		this.paliwo = paliwo;

		ekstensja.add(this);
	}

	public static void wjazdParking(Auto auto, Parking parking) {
		if (parking.getIloscMiejsc() == Parking.getZaparkowaneAuta().size()) {
			throw new IllegalArgumentException("parking jest pelny");
		}
		if (parking.getSzerokoscMiejsca() < auto.getSzerokosc()) {
			throw new IllegalArgumentException("auto jest za szerokie");
		}
		if (parking.isDozwoloneLPG() == auto.getPaliwo().contains("LPG")) {
			throw new IllegalArgumentException("zakaz wjazdu z LPG");
		}
		// warunek dla elektrykow
		if (auto.getPaliwo().toLowerCase().contains("elektr")) {
			if (parking.getIloscLadowarek() == Parking.getZaparkowaneElektryki().size()) {
				throw new IllegalArgumentException("brak miejsc dla sam elektrycznych");
			}
			parking.getZaparkowaneElektryki().add(auto);
			parking.getZaparkowaneAuta().add(auto);
			auto.setParking(parking);
		}
		Parking.getZaparkowaneAuta().add(auto);
		auto.setParking(parking);

	}

	public void wyjazdParking(Auto auto) {
		if (auto.getParking() == null) {
			throw new IllegalArgumentException("auto nie jest zaparkowane");
		}
		auto.getParking().getZaparkowaneAuta().remove(auto);
		auto.setParking(null);
		if (auto.getPaliwo().toLowerCase().contains("elektr")) {
			auto.getParking().getZaparkowaneElektryki().remove(auto);
		}
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSzerokosc() {
		return szerokosc;
	}

	public void setSzerokosc(double szerokosc) {
		this.szerokosc = szerokosc;
	}

	public String getPaliwo() {
		return paliwo;
	}

	public void setPaliwo(String paliwo) {
		this.paliwo = paliwo;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

	public static List<Auto> getEkstensja() {
		return ekstensja;
	}

	@Override
	public String toString() {
		return "Auto [marka=" + marka + ", model=" + model + "]";
	}

}
