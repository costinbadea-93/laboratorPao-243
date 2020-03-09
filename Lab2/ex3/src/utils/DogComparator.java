package utils;

import model.Dog;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
//        if(d1.getAge() > d2.getAge()) {
//            return 1;
//        } else if(d1.getAge() < d2.getAge()){
//            return -1;
//        } else{
//            return 0;
//        }
        return d1.getName().compareTo(d2.getName());
    }
}
