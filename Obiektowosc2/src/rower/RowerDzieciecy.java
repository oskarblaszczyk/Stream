package rower;

import java.util.ArrayList;
import java.util.List;

public class RowerDzieciecy extends Rower {

	private boolean kolaBoczne;
	private static List<RowerDzieciecy> ekstensja = new ArrayList<>();

	public RowerDzieciecy(String marka, String model, int rokProdukcji, int nrSeryjny, boolean kolaBoczne) {
		super(marka, model, rokProdukcji, nrSeryjny);
		this.kolaBoczne = kolaBoczne;

		ekstensja.add(this);
	}

}
