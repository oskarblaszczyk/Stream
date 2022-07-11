package iterator;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5};
        minMax(tablica, Integer::max);


    }

    //napisz metode ktora znajduje najmniejszy lub najwiekszy element z tablicy zaleznie od parametru metody
    public static int minMax(int[] tablica, IntBinaryOperator par) {
        return Arrays.stream(tablica)
                .reduce(par)
                .orElseThrow();
    }

    //napisz z pomoca Stream.iterate metorde ktora zwraca liste elementow od 1 do n

    public static List<Integer> listaElementow(int n) {
        return Stream.iterate(1, i -> i + 1)
                .limit(n)
                .toList();
    }

    // napisz metode która generuje 100 liczb parzystych lub nieparzystych w zaleznosci od parametru :)

    public static List<Integer> liczby(Predicate<Integer> par, int limit) {
        return Stream.iterate(0, i -> i + 1)
                .filter(par)
                .limit(limit)
                .toList();

    }
    // napisz za pomoca streamow generator fibonaciego

    // 1 1 2 3 5 8 13
    public static List<Integer> fibbonaci(int limit){
        return Stream.iterate(1, (i,j)-> i)

    }



    //napisz metode liczaca sume n elementow fibo

    //napisz metoda ktora zwraca liczby pierwsze z podanej listy
}
