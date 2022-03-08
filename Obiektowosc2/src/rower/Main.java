package rower;

public class Main {

	public static void main(String[] args) {
		Rower r1 = new Rower("Romet", "Aspre", 2021, 12131415);
		Rower r2 = new Rower("Kross", "Esker", 2022, 21324354);
		Rower r3 = new Rower("Marin", "Fourcorners", 2020, 98674318);
		
		System.out.println(Rower.getEkstensja());
		System.out.println(r1.wiek());
		r2.dodajWyposazenie("torba");
		r2.dodajWyposazenie("lampka");
		System.out.println(r2.getWyposazenie());
		
		RowerDzieciecy rD1 = new RowerDzieciecy("Liv", "Enchant", 2019, 653927391, false);
		System.out.println(RowerDzieciecy.getEkstensja());
		System.out.println(Rower.getEkstensja());
		System.out.println(RowerDzieciecy.getIloscKol());
		
	}

}
