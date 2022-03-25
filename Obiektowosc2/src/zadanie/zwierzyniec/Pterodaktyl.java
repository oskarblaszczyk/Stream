package zadanie.zwierzyniec;

import java.util.ArrayList;
import java.util.List;

public class Pterodaktyl extends Zwierze {
	private double rozpietoscSkrzydel;

	private static List<Pterodaktyl> pterodaktyle = new ArrayList<>();

	public Pterodaktyl(String nazwa, String gatunek, double rozpietoscSkrzydel) {
		super(nazwa, gatunek);
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;

		pterodaktyle.add(this);
	}

	public double getRozpietoscSkrzydel() {
		return rozpietoscSkrzydel;
	}

	public void setRozpietoscSkrzydel(double rozpietoscSkrzydel) {
		this.rozpietoscSkrzydel = rozpietoscSkrzydel;
	}

	public static List<Pterodaktyl> getPterodaktyle() {
		return pterodaktyle;
	}

}
