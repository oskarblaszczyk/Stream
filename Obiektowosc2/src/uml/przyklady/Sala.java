package uml.przyklady;

public class Sala {
	private int numer;
	private final Szkola szkola;
	
	public Sala(int numer, Szkola szkola) {
		
		if(szkola == null) {
			throw new IllegalArgumentException("szkola nie moze byc nullem");
		}
		
		this.numer = numer;
		this.szkola = szkola;
		
		szkola.getSale().add(this);
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public Szkola getSzkola() {
		return szkola;
	}

	@Override
	public String toString() {
		return "Sala [numer=" + numer + ", szkola=" + szkola + "]";
	}
	
	
	
}
