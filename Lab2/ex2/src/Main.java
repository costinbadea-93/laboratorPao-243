import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4};
        int [] mySecondArray = new int[10];

        for(int i = 0; i < myArray.length; i ++) {
            System.out.println("Element value: " + myArray[i]);
        }
        System.out.println("================================");
        for(int i : myArray){
            System.out.println("Element value: " + i);
        }
        System.out.println("=================================");
        Arrays.stream(myArray).forEach(System.out::println);
    }
}
