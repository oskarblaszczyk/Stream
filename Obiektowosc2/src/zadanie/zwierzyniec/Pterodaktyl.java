package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;

public class Pterodaktyl {
	private double rozpietoscSkrzydel;
	
	private static List<Pterodaktyl> ekstensja = new ArrayList<>();

	public Pterodaktyl(double rozpietoscSkrzydel) {
		super();
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
		
		ekstensja.add(this);
	}

	public double getRozpietoscSkrzydel() {
		return rozpietoscSkrzydel;
	}

	public void setRozpietoscSkrzydel(double rozpietoscSkrzydel) {
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
	}

	public static List<Pterodaktyl> getEkstensja() {
		return ekstensja;
	}
	
	
}
