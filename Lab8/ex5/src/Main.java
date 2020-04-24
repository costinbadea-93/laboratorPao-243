import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> o = m1();

//        if(m1().isPresent()) {
//            System.out.println(m1().get());
//        }

        System.out.println(m1().orElseThrow(() -> new RuntimeException("Cutiuta este goala!")));
    }

    public static Optional<String> m1() {
        return Optional.of("Hello!");
        //return Optional.empty();
    }
}
