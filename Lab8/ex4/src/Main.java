import model.Hello;
import model.Persoana;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persoana> persoanaList = Arrays.asList(
          new Persoana(23, " N1"),
          new Persoana(26, " N3"),
          new Persoana(29, " N2")
        );
        System.out.println(persoanaList);

        Collections.sort(persoanaList, Comparator.comparing(Persoana::getNume));
        System.out.println(persoanaList);

        Hello hello = new Hello();
        hello.run();

        Runnable r = () -> System.out.println("Hello World!");
        r.run();
    }
}
