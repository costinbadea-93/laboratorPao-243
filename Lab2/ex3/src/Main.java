import com.sun.deploy.util.ArrayUtil;
import model.Dog;
import utils.DogComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = {5,6,9,4,10,1};
        Dog d1 = new Dog(12,"N1");
        Dog d2 = new Dog(8,"N2");
        Dog d3 = new Dog(14,"N3");


        Dog [] myDogArray = {d1,d2,d3};
        DogComparator dogComparator = new DogComparator();

        Arrays.sort(myDogArray,dogComparator);
        System.out.println(Arrays.toString(myDogArray));
    }
}
