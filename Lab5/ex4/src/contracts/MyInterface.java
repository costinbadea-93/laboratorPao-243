package contracts;


@FunctionalInterface
public interface MyInterface {
    String sum (int a, int b);

    default void m3(){}
    default void m4(){}
    default void m5(){}

    static void m6(){}
    static void m7(){}
    static void m8(){}
    static void m9(){}
}
