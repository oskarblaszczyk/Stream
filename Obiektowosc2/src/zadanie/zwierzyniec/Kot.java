package zadanie.zwierzyniec;

public class Kot extends Zwierze {
	private int jakBardzoWkurwiajacy;

	//private static List<Kot> ekstensja = new ArrayList<>();

	public Kot(String nazwa, String gatunek, int jakBardzoWkurwiajacy) {
		super(nazwa, gatunek);
		setJakBardzoWkurwiajacy(jakBardzoWkurwiajacy);
		
		//ekstensja.add(this);
		Zwierze.getEkstensja().add(this);
	}

	public int getJakBardzoWkurwiajacy() {
		return jakBardzoWkurwiajacy;
	}

	public void setJakBardzoWkurwiajacy(int jakBardzoWkurwiajacy) {
		if (jakBardzoWkurwiajacy > 10 || jakBardzoWkurwiajacy < 1) {
			throw new IllegalArgumentException("poziom wkurwiania mooze byc w przedziale 1-10");
		}
		this.jakBardzoWkurwiajacy = jakBardzoWkurwiajacy;
	}

//	public static List<Kot> getEkstensja() {
//		return ekstensja;
//	}

}
