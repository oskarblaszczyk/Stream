package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Zakup {
    private final Klient klient;
    private final Wycieczka wycieczka;
    private List<Dodatek> dodatki = new ArrayList<>();
    private static List<Zakup> ekstensja = new ArrayList<>();

    public Zakup(Klient klient, Wycieczka wycieczka, List<Dodatek> dodatki) {
        this.klient = klient;
        this.wycieczka = wycieczka;
        this.dodatki = dodatki;

        ekstensja.add(this);
        klient.getWyjazdy().add(this);
        wycieczka.getWyjazdy().add(this);
    }


    public double cenaDodatkow() {
        double suma = 0;
        for (Dodatek d : dodatki) {
            suma += d.getCena();
        }
        return suma;
    }
//
//    //2.974(1.950) sekundy
//    public static Klient najdrozszyWyjazd(List<Zakup> wyjazdy) {
//        if (wyjazdy == null || wyjazdy.isEmpty()) {
//            throw new IllegalArgumentException("nie null i nie pusta");
//        }
//        Zakup n = wyjazdy.get(0);
//        double wartosc = n.wartoscDodatkow(); //zapisanie do zmiennej aby nie wywolywac metody w petli bez potrzeby
//        for (Zakup w : wyjazdy) {
//            double wartosc2 = w.wartoscDodatkow(); //raz wywolujemy metode zamiast 2 razy (if oraz ewentualne przypisanie)
//            if ((w.getWycieczka().getCena() + wartosc2) > (n.getWycieczka().getCena() + wartosc)) {
//                n = w;
//                wartosc = wartosc2;
//            }
//        }
//        return n.getKlient();
//    }
//    //3.489 (3.785) sekundy przy liscie z dwoma wyjazdami
//    public static Klient najdrozszyWyjazd2(List<Zakup> wyjazdy) {
//        if (wyjazdy == null || wyjazdy.isEmpty()) {
//            throw new IllegalArgumentException("nie null i nie pusta");
//        }
//        Zakup n = wyjazdy.get(0);
//        for (Zakup w : wyjazdy) {
//               if ((w.getWycieczka().getCena() + w.wartoscDodatkow()) > (n.getWycieczka().getCena() + w.wartoscDodatkow())) {
//                n = w;
//            }
//        }
//        return n.getKlient();
//    }
//
//    public static Klient najdrozszeDodatki(List<Zakup> wyjazdy) {
//        if (wyjazdy == null || wyjazdy.isEmpty()) {
//            throw new IllegalArgumentException("nie null i nie pusta");
//        }
//        Zakup n = wyjazdy.get(0);
//        double wartosc = n.wartoscDodatkow();
//        for (Zakup w : wyjazdy) {
//            double wartosc2 = w.wartoscDodatkow();
//            if (wartosc2 > wartosc) {
//                n = w;
//                wartosc = wartosc2;
//            }
//        }
//        return n.getKlient();
//    }


    public Klient getKlient() {
        return klient;
    }

    public Wycieczka getWycieczka() {
        return wycieczka;
    }

    public static List<Zakup> getEkstensja() {
        return ekstensja;
    }

    public List<Dodatek> getDodatki() {
        return dodatki;
    }

    public void setDodatki(List<Dodatek> dodatki) {
        this.dodatki = dodatki;
    }

    @Override
    public String toString() {
        return "Wyjazd{" + "klient=" + klient + ", wycieczka=" + wycieczka + '}';
    }
}
