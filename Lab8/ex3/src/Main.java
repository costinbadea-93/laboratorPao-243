import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Consumer
         * Supplier
         * Function
         * Bifunction
         * Predicate
         * BiPredicate
         * UnaryOperator
         * BinaryOperator
         */

        Consumer<String> c1 = p -> System.out.println(p);
        c1.accept("Hello world!");

        Supplier<String> s1 = () -> "Hello World!";
        System.out.println(s1.get());

        Function<String, String> f1 = (p) -> p + "World!";
        System.out.println(f1.apply("Hello "));

        BiFunction<String, String, String> bif1 = (a,b) -> a.concat(b);
        System.out.println(bif1.apply("Hello ", "World!"));

        Predicate<String> p1  = (p) -> p.equals("Hello World!");
        System.out.println(p1.test("some String"));

        BiPredicate<String, String> bip1 = (s3, s4) -> s3.equals(s4);
        System.out.println(bip1.test("Hello","Hello"));

        UnaryOperator<String> u1 = x -> x.concat(" World!");
        System.out.println(u1.apply("Hello"));

        BinaryOperator<String> bio1 = (a, b) -> a.concat(b);
        System.out.println(bio1.apply("Hello", " World!"));

    }
}
