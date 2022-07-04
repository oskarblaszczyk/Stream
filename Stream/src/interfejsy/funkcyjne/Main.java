package interfejsy.funkcyjne;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        // Function
        Function<Integer, Integer> zwieksz10 = a -> a + 10;
        Function<Integer, Integer> podwaja = a -> a * 2;

        System.out.println(podwaja.andThen(zwieksz10).apply(10));
        System.out.println(podwaja.compose(zwieksz10).apply(10));


        //Consumer (dowolnytyp, nic nie zwrac)
        Consumer<Integer> konsumer = a -> System.out.println(a);
        konsumer.accept(4);

        //Supplier (nic nie przyjmuje, zwraca dowolny)
        Supplier<Integer> suplajer = () -> 10;

        //Predicate (dowolny typ, boolean) taki jak selector

        Predicate<Integer> predikejt = a -> a < 10;

        System.out.println(predikejt.test(10));
        System.out.println(predikejt.negate().test(10));


        //UnarrayOperator (zwraca to co przyjmuje)
        UnaryOperator<Integer> unaraj = a -> a + 10;


    }
}
