package dyplom;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dyplom d1 = new Dyplom("Adam", "Kowalski", LocalDate.now());
        Ocena o1 = new Ocena(Wartosc.DOBRY, Przedmiot.JEZYK_POLSKI, d1);
        Ocena o2 = new Ocena(Wartosc.CELUJACY, Przedmiot.MATEMATYKA, d1);
        Ocena o3 = new Ocena(Wartosc.NIEDOSTATECZNY, Przedmiot.BIOLOGIA, d1);
        Ocena o4 = new Ocena(Wartosc.DOPUSZCZAJACY, Przedmiot.FIZYKA, d1);
        Ocena o5 = new Ocena(Wartosc.BARDZO_DOBRY, Przedmiot.CHEMIA, d1);


        Dyplom d2 = new Dyplom("Piotr", "Nowak", LocalDate.now());
        Ocena o6 = new Ocena(Wartosc.DOBRY, Przedmiot.JEZYK_POLSKI, d2);
        Ocena o7 = new Ocena(Wartosc.CELUJACY, Przedmiot.MATEMATYKA, d2);
        Ocena o8 = new Ocena(Wartosc.NIEDOSTATECZNY, Przedmiot.BIOLOGIA, d2);
        Ocena o9 = new Ocena(Wartosc.DOPUSZCZAJACY, Przedmiot.FIZYKA, d2);
        Ocena o10 = new Ocena(Wartosc.BARDZO_DOBRY, Przedmiot.CHEMIA, d2);


        System.out.println(d1.sredniaOcena());
        System.out.println(d2.sredniaOcena());
        System.out.println(Dyplom.najwyzszaSrednia(Dyplom.getEkstensja()));
        System.out.println(Dyplom.najwyzszaSrednia2(Dyplom.getEkstensja()));
        dodajOcene(Wartosc.DOSTATECZNY, Przedmiot.BIOLOGIA, d1);
        dodajOcene(Wartosc.DOSTATECZNY, Przedmiot.BIOLOGIA, d1);
        System.out.println(d1.getOceny());
        System.out.println(Ocena.getEkstensja());

    }
    public static void dodajOcene(Wartosc ocena, Przedmiot przedmiot, Dyplom dyplom){
        String nazwa= "n1";
        Ocena n1 = new Ocena(ocena, przedmiot, dyplom);
    }

}
