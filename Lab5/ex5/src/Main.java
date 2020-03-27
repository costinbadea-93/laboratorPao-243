import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /**
         * function
         * bifunction
         * predicate
         * bipredicate
         * unary operator
         * binary operator
         * consumer
         * supplier
         */

        List<Integer> myList = Arrays.asList(1,2,3,4,5);

       // myList.stream().forEach(e -> System.out.println(e));

        /**
         * Ex 1
         */
        int sum = 0;
        for(int i : myList) {
            sum += i;
        }
        System.out.println("Suma este " + sum);

       int sum2 = myList.stream()
               .reduce(0, (prev, curr) -> prev + curr);
        System.out.println("Sum from sum2 " + sum2);

        /**
         * Ex 2
         */
        List<Integer> mySecondList = new ArrayList<>();
        for(int i : myList){
            if( i%2 == 0) {
                mySecondList.add(i);
            }
        }

        System.out.println(mySecondList);

        List<Integer>myThirdList = myList.stream()
                .filter(e -> e %2 == 0)
                .collect(Collectors.toList());
        System.out.println(myThirdList);
    }
}
