package wyrazenia.regularne;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("Tomek");
        Matcher matcher = pattern.matcher("Tomek lubi jesc lody");

        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        System.out.println();

        // znak ? - element przed nim jest opcjonalny
        Pattern pattern1 = Pattern.compile("Tom?ek");
        System.out.println(pattern1.matcher("Tomek").matches());
        System.out.println(pattern1.matcher("Toek").matches());
        System.out.println(pattern1.matcher("Tomekk").matches());
        System.out.println(pattern1.matcher("Toek1").matches());
        System.out.println();

        // znak * - element przed nim moze wystapic 0 lub wiele razy
        Pattern pattern2 = Pattern.compile("Tom*ek");
        System.out.println(pattern2.matcher("Tommmmmek").matches());
        System.out.println(pattern2.matcher("Toek").matches());
        System.out.println(pattern2.matcher("Tomekk").matches());
        System.out.println(pattern2.matcher("Tomek1").matches());

        // znak + - element przed nim moze wystapic 1 lub wiele razy
        Pattern pattern3 = Pattern.compile("Tom+ek");
        System.out.println(pattern3.matcher("Tommmmmek").matches());
        System.out.println(pattern3.matcher("Toek").matches());
        System.out.println(pattern3.matcher("Tomekk").matches());
        System.out.println(pattern3.matcher("Tomek1").matches());

        // znak . - w miejsce kropki mozna wstawic dowolny element
        Pattern pattern4 = Pattern.compile("Tom.ek");
        System.out.println(pattern4.matcher("Tommek").matches());
        System.out.println(pattern4.matcher("Tom*ek").matches());
        System.out.println(pattern4.matcher("Tomek").matches());
        System.out.println(pattern4.matcher("Tomek1").matches());

        // {i} i razy

        // {i,} przynajmniej i razy

        // {i,j} od i do j razy

        Pattern pattern5 = Pattern.compile("Tom{3}ek");
        System.out.println(pattern5.matcher("Tommmek").matches());
        System.out.println(pattern5.matcher("Toek").matches());
        System.out.println(pattern5.matcher("Tomekk").matches());
        System.out.println(pattern5.matcher("Tomek1").matches());

        Pattern pattern6 = Pattern.compile("Tom{3,}ek");
        System.out.println(pattern6.matcher("Tommmek").matches());
        System.out.println(pattern6.matcher("Tommmmek").matches());
        System.out.println(pattern6.matcher("Tommmmek").matches());
        System.out.println(pattern6.matcher("Tomek").matches());

        Pattern pattern7 = Pattern.compile("Tom{3,5}ek");
        System.out.println(pattern7.matcher("Tommmek").matches());
        System.out.println(pattern7.matcher("Tommmmek").matches());
        System.out.println(pattern7.matcher("Tommmmmek").matches());
        System.out.println(pattern7.matcher("Tommmmmmek").matches());

        /*
         * klasy - grupy symboli, oznaczane za pomoca nawiasow [ ] [A-E] - jakakolwiek
         * wielka litera od A do E [h-u] - jakakolwiek mala literka od h do u [A-Cg-z] -
         * jakakolwiek wielka litera od A do C lub mala od go do z [H-g] - jajakolwiek
         * wielka litera od H do Z lub od a do g [3-8] - jakakolwiek licba od 3 do 8
         * [^a-c] - cokolwiek poza przedzialem od a do c
         */

        // stw?rz pattern na imie
        // Bartek
        // Bartek Tomek

        Pattern pattern8 = Pattern.compile("[A-Z][a-z]{2,}( [A-Z][a-z]{2,})?");

        // stw?rz pattern na imie i nazwisko
        // Jan Korwin
        // Jan Korwin-Mikke
        // Jan Korwin Mikke
        // (a|b) a lub b

        Pattern pattern9 = Pattern.compile("[A-Z][a-z]{2,}( [A-Z][a-z]{2,})(( |-)[A-Z][a-z]{2,})?"); // zle- poprawione
        System.out.println(pattern9.matcher("Jan Korwin-Mikke").matches());

        /*
         * \d - jakakolwiek cyfra \D - zaprzeczenie grupy \d \w - znaki uzywane w
         * slowach [A-z0-9_] \W - zaprzeczenie grupy \w \s - whitespacy \S -
         * zaprzeczenie \s
         */

        Pattern pattern10 = Pattern.compile("\\d{1,3}");
        System.out.println(pattern10.matcher("23").matches());

        // napisz pattern na dat? w postaci xx-xx-xxxx

        Pattern pattern11 = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
        System.out.println(pattern11.matcher("01-2-1999").matches());

        // napisz pattern na maila
        // ab.a-a_a1a
        // @gmail.com
        // @o2.com.pl
        Pattern pattern12 = Pattern.compile("\\w{1,}@\\w{1,}\\.[a-z]{1,}");

        /*
         * Sprawdz czy liczba zmiennoprzecinkowa podana przez u?ytkownika ma poprawny
         * format. Na przyk?ad liczba 123,2341515132135 czy -10 s? poprawne ale 18-12
         * czy 123, ju? nie,
         */

        Pattern pattern13 = Pattern.compile("-?\\d*(,\\d*)?");

        /*
         * sprawdz czy numer domu jest w formacie numer\numer. Poprawnym numerem jest
         * 123\2A, 24B\3 czy 12\5, ale ju? numer abc\cba nie,
         */

        Pattern pattern14 = Pattern.compile("\\d+[A-Z]?\\\\\\d+[A-Z]?");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(pattern14.matcher("123\\2A").matches());

        // napisz pattern na miasto np Warszawa, Bielsko-Biala, Zielona Gora

        Pattern pattern15 = Pattern.compile("[A-Z][a-z]+(( |-)[A-Z][a-z]+)?");
        System.out.println("Warszawa: " + pattern15.matcher("Warszawa").matches());
        System.out.println("Bielsko-Biala: " + pattern15.matcher("Bielsko-Biala").matches());
        System.out.println("Zielona Gora: " + pattern15.matcher("Zielona Gora").matches());


        // napisz metode zamien(int ilosc, String waluta) ktora dzia?a jak kantor,
        // pokazuje ile mozesz kupic danej waluty za podana liczbe euro
        // czyli np zamien(100, "PLN") powinno wypluc 439,79
        String kursy = "{\"rates\":{\"CAD\":1.5563,\"HKD\":9.1212,\"ISK\":162.6,\"PHP\":57.324,\"DKK\":7.4441,\"HUF\":350.68,\"CZK\":26.083,\"AUD\":1.6442," + "\"RON\":4.8405,\"SEK\":10.363,\"IDR\":17383.99,\"INR\":88.198,\"BRL\":6.5908,\"RUB\":87.735,\"HRK\":7.5243,\"JPY\":124.53,\"THB\":37.161," + "\"CHF\":1.0744,\"SGD\":1.6131,\"PLN\":4.3979,\"BGN\":1.9558,\"TRY\":8.5925,\"CNY\":8.1483,\"NOK\":10.5913,\"NZD\":1.8045,\"ZAR\":20.2977," + "\"USD\":1.1769,\"MXN\":26.066,\"ILS\":4.0029,\"GBP\":0.89755,\"KRW\":1403.15,\"MYR\":4.9194},\"base\":\"EUR\",\"date\":\"2020-08-21\"}";

        /*
         * Stworz klase Osoba(imie,nazwisko, pesel, plec)
         *
         * 1) Sprawdz czy pesel jest poprawny - czy sklada sie z 11 znakow, samych cyfr
         * itp
         *
         * 2) Sprawdz czy pesel odpowiada podanej p?ci
         *
         * 3) Napisz metody kt?re zwracaja z peselu date urodzenia (LocalDAte)
         */

        Osoba o1 = new Osoba("Oskar", "Blaszczyk", "88090502219");
        System.out.println(o1);
        Osoba o2 = new Osoba("Oskar", "Blaszczyk", "88090502219");
        System.out.println(o2);


        System.out.println();

        //System.out.println(zamien(100, "GBP"));

        System.out.println(zamien(100, "EUR"));

    }

    // ile mozna kupic waluty za podana kwote PLN
    public static float zamien(int ilosc, String waluta) throws IOException {

        URL url = new URL("https://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        Scanner sc = new Scanner(url.openStream());
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.next());
        }
        String result = sb.toString();
        System.out.println(result);

        Pattern pattern = Pattern.compile("[A-Z]{3}\",\"mid\":\\d*\\.\\d*");
        Matcher m = pattern.matcher(result);
        System.out.println(m.find());

        Map<String, Float> mapaWalut = new HashMap<>();
        while (m.find()) {
            mapaWalut.put(result.substring(m.start(), m.start() + 3), Float.parseFloat(result.substring(m.start() + 12, m.end())));
        }
        return ilosc / mapaWalut.get(waluta);
    }
}
