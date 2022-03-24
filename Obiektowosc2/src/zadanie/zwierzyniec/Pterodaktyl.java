package zadanie.zwierzyniec;

public class Pterodaktyl extends Zwierze {
	private double rozpietoscSkrzydel;

	//private static List<Pterodaktyl> ekstensja = new ArrayList<>();

	public Pterodaktyl(String nazwa, String gatunek, double rozpietoscSkrzydel) {
		super(nazwa, gatunek);
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
		
	//	ekstensja.add(this);
		Zwierze.getEkstensja().add(this);
	}

	public double getRozpietoscSkrzydel() {
		return rozpietoscSkrzydel;
	}

	public void setRozpietoscSkrzydel(double rozpietoscSkrzydel) {
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
	}

//	public static List<Pterodaktyl> getEkstensja() {
//		return ekstensja;
//	}

}
