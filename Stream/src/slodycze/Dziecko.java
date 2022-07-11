package slodycze;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Dziecko {
    private String imie;
    private List<Slodycz> slodycze = new ArrayList<>();
    private static List<Dziecko> ekstensja = new ArrayList<>();

    public Dziecko(String imie) {
        this.imie = imie;
        ekstensja.add(this);
    }


    // zwroc lista wszystkich slodyczy ktore kupily dzieci
    public static List<Slodycz> kupioneSlodycze(List<Dziecko> dzieci) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Dziecko::getSlodycze)
                .filter(Objects::nonNull)
                .flatMap(List::stream)
                .toList();
    }

    // zwroc liste unikalnych nazw wszystkich slodyczy ktore kupily dzieci
    public static List<Slodycz> kupioneSlodyczeUnikalne(List<Dziecko> dzieci) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Dziecko::getSlodycze)
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .distinct()
                .toList();
    }


    // ile słodyczy podanego typu kupily dzieci
    public static long ileKupionychTypu(List<Dziecko> dzieci, Slodycz slodycz) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Dziecko::getSlodycze)
                .flatMap(List::stream)
                .filter(s -> s.equals(slodycz))
                .count();
    }

    // znajdz pierwsze dziecko które ma przynajmniej 2 slodycze

    public static Dziecko conajmniejN(List<Dziecko> dzieci, int n) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .filter(d -> d.getSlodycze().size() >= n)
                .findFirst()
                .orElseThrow();
    }

    // sprawdz czy ktorekolwiek dziecko ma gume

    public static boolean czyKupilo(List<Dziecko> dzieci, Slodycz slodycz) {
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .anyMatch(d -> d.getSlodycze().contains(slodycz));

    }


    // chcemy zwrócic dziecko które ma najwiecej slodyczy podanego typu
    // czyli np d1 ma s1,s1,s2,s3,s4,s4,s4
    // d2 ma s1,s1,s1,s1,s3,s4,s5
    // to metoda dla parametru s1 powinna dac d2, dla parametru s4 powinna dac d1

    public static Dziecko najwiecejSlodycz(List<Dziecko> dzieci, Slodycz slodycz){
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(d -> d.getSlodycze().stream().filter(s -> s.equals(slodycz)).count()))
                .orElseThrow();
    }



    // znajdz n-ty najpopularniejszy slodycz wsrod dzieci

    public static Slodycz najpopularniejszy(List<Dziecko> dzieci, int n){
        return Optional.ofNullable(dzieci)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .map(Dziecko::getSlodycze)
                .filter(Objects::nonNull)
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .skip(n-1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }



    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public List<Slodycz> getSlodycze() {
        return slodycze;
    }

    public static List<Dziecko> getEkstensja() {
        return ekstensja;
    }

}
