import model.Dog;
import model.DogComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();

        Dog d1 = new Dog("N1","C1");
        Dog d2 = new Dog("N4","C4");
        Dog d3 = new Dog("N2","C2");

        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);

        //sort with comparator
        Collections.sort(dogList, new DogComparator());

        //sort with comparable
        Collections.sort(dogList);

        System.out.println(dogList);
    }
}
