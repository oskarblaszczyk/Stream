package wycieczka;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private List<Zakup> zakupy = new ArrayList<>();
    private static List<Klient> ekstensja = new ArrayList<>();

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        ekstensja.add(this);
    }

    public double kosztWycieczek() {
        double suma = 0;
        for (Zakup z : zakupy) {
            suma += z.getWycieczka().getCena();
        }
        return suma;
    }

    public double kosztDodatkow() {
        double suma = 0;
        for (Zakup z : zakupy) {
            for (Dodatek d : z.getDodatki()) {
                suma += d.getCena();
            }
        }
        return suma;
    }

    public double kosztZakupu() {
        return kosztDodatkow() + kosztWycieczek();
    }


    // Znadz klienta który wydal najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
    public static Klient najwiecejWydalWycieczki(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("nie null");
        }
        Klient najwiecej = klienci.get(0);
        for (Klient k : klienci) {
            if (k.kosztWycieczek() > najwiecej.kosztWycieczek()) {
                najwiecej = k;
            }
        }
        return najwiecej;
    }

    //  Znadz klienta który wydal najwiecej na dodatki do wycieczki uwzgledniajac tez cene wycieczki
    public static Klient najwiecejWydal(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("nie null");
        }
        Klient najwiecej = klienci.get(0);

        for (Klient k : klienci) {
            if (k.kosztZakupu() > najwiecej.kosztZakupu()) {
                najwiecej = k;
            }
        }
        return najwiecej;
    }

//
//// Dwie metody. W kazdej robie to samo.
//
//    //3.387 sekundy
//    public static Klient najwiecejWydalWyjazd(List<Klient> klienci) {
//        if (klienci == null || klienci.isEmpty()) {
//            throw new IllegalArgumentException("nie null i nie pusta");
//        }
//        Klient najwiecej = klienci.get(0);
//        double sumaTemp = 0;
//        for (Klient k : klienci) {
//            for (Zakup w : k.getWyjazdy()) {
//                double temp = w.getWycieczka().getCena();
//                for (Dodatek d : w.getDodatki()) {
//                    temp += d.getCena();
//                }
//                if (temp > sumaTemp) {
//                    najwiecej = k;
//                    sumaTemp = temp;
//                }
//            }
//        }
//        return najwiecej;
//    }
//
//    public static Klient najwiecejWydalDodatki(List<Klient> klienci) {
//        if (klienci == null || klienci.isEmpty()) {
//            throw new IllegalArgumentException("nie null i nie pusta");
//        }
//        Klient najwiecej = klienci.get(0);
//        double sumaTemp = 0;
//        for (Klient k : klienci) {
//            for (Zakup w : k.getWyjazdy()) {
//                double temp = 0;
//                for (Dodatek d : w.getDodatki()) {
//                    temp += d.getCena();
//                }
//                if (temp > sumaTemp) {
//                    najwiecej = k;
//                    sumaTemp = temp;
//                }
//            }
//        }
//        return najwiecej;
//    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


    public static List<Klient> getEkstensja() {
        return ekstensja;
    }

    @Override
    public String toString() {
        return "Klient{" + "imie='" + imie + '\'' + ", nazwisko='" + nazwisko + '\'' + '}';
    }
}
