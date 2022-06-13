package lamda.wyrazenia;

public class Main {
    public static void main(String[] args) {

        // lista parametrow -> cialo wyrazenia

        //  int lambda = i -> 2 * i;
        Mnozenie m = i -> i * 2;

        Mnozenie m2 = i -> {
            System.out.println("bardziej rozbudowana lambda");
            return i * 2;
        };

        System.out.println(m.mnoz(5));

        // napisz wyrazenie lambda ktore wykonuje operacje na 2 liczbach

        DwieLiczby d = (i, j) -> i - j;
        System.out.println(d.dwie(4, 5));
        System.out.println(d.dwie(2, 4));

        // napisz interfejs + lambda wyrazenie ktore sprawdza czy liczba jest parzysta

        Porownaj p = i -> i % 2 == 0;
        System.out.println(p.porownaj(2));

        // napisz wyrazenie ktore sprawdza czy liczba jest wieksza od 5
        Porownaj p1 = i -> i > 5;
        System.out.println(p1.porownaj(6));


        // napis wyrazenie ktore zwraca czy napis jest dluzszy niz 10, jesli tak to
        // returnujemy "dlugi" a jak nie "krotki"

        PorownajString pS = s-> s.length() > 10 ? "dlugi" : "krotki";

        //napisz interfejs ktory przyjmuje dowolny typ i go wyswietla

        Wyswietlanie w = i -> System.out.println(i);


        // Oblicz dlugosc sume dlugosci wszystkich stringow na liscie

        /*
         * Napisz program który za pomocą wyrażeń lambda wykona działania jak kalkulator
         * czyli dodawanie, odejmowanie, mnożenie i dzielenie.
         */
    }
}
