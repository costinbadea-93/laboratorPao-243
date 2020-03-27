import contracts.MyInterface;
import model.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("D1", "C1");
        Dog d2 = new Dog("D6", "C6");
        Dog d3 = new Dog("D4", "C4");

        List<Dog> dogList = Arrays.asList(d1,d2,d3);
        System.out.println("==================================");
        for(int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }
        System.out.println("==================================");
        for(Dog d : dogList) {
            System.out.println(d);
        }

        System.out.println("==================================");
        dogList.stream().forEach(dog -> System.out.println(dog));

        Collections.sort(dogList,(dog1, dog2) -> dog1.getName().compareTo(dog2.getName()));

        System.out.println("==================================");
        dogList.stream().forEach(dog -> System.out.println(dog));

//        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
//        myInterfaceImpl.m2();


//        MyInterface myInterface1 = (int a, int b) -> {return a + " " + b;};
//        MyInterface myInterface2 = ( a,  b) ->a + " " + b;
//        System.out.println(myInterface1.sum(5,6));


    }
}
