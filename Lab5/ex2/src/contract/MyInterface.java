package contract;

public interface MyInterface {
    void saySomething(String msg);

    default void m1() {
        m2();
        System.out.println("Hi from m1");
    }

    static void m2() {
        System.out.println("Hi from m2");
    }
}
