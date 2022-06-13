/*
 * Stwórz klase klient i wycieczka, klient moze miec wiele wycieczek, wycieczka
 * moze miec wielu klientow. Wycieczka ma nazwe, kraj, cena i liste dodatkow
 * (kazdy jest dodatkowo platny) Znadz klienta który wydal najwiecej na dodatki
 * do wycieczki uwzgledniajac tez cene wycieczki Znadz klienta który wydal
 * najwiecej na dodatki do wycieczki nieuwzgledniajac tez ceny wycieczki
 */

package wycieczka;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Klient k1 = new Klient("Jan", "Kowalski");
        Klient k2 = new Klient("Adam", "Nowak");

        Wycieczka w1 = new Wycieczka("Piramidy", "Egipt", 3500);
        Wycieczka w2 = new Wycieczka("Bieszczady", "Polska", 2150);

        Zakup p1 = new Zakup(k2, w1, Arrays.asList(Dodatek.NOCLEG, Dodatek.PRZEWODNIK, Dodatek.TRANSFER, Dodatek.WYZYWIENIE));
        Zakup p2 = new Zakup(k1, w2, Arrays.asList(Dodatek.WYZYWIENIE, Dodatek.NOCLEG, Dodatek.WYZYWIENIE));


//        System.out.println(Zakup.(Zakup.getEkstensja()));
//        System.out.println(Klient.najwiecejWydalWyjazd(Klient.getEkstensja()));
//
//        System.out.println(Zakup.najdrozszeDodatki(Zakup.getEkstensja()));
//        System.out.println(Klient.najwiecejWydalDodatki(Klient.getEkstensja()));

    }
}
