import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] myArray = new String[0];

        List<String> myList = new ArrayList<>();
        myList.add("elem1");
        myList.add("elem2");
        myList.add("elem3");

        myList.remove(1);

        for(String str : myList) {
            System.out.println(str);
        }

        for( int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
