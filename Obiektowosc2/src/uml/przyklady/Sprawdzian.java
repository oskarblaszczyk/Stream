package uml.przyklady;

import java.util.*;

public class Sprawdzian {

	private String nazwa;

	private List<Ocena> oceny = new ArrayList<>();

	public Sprawdzian(String nazwa) {
		super();
		this.nazwa = nazwa;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}

}
