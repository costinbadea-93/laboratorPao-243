import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] myArray = {1,3,5};
        myArray = addElement(myArray, 3);
        myArray = addElement(myArray, 5);
        myArray = addElement(myArray, 2);
        System.out.println("Printing Array....");
        System.out.println(Arrays.toString(myArray));
    }

    private static int[] addElement(int[] myArray, int value) {
        int [] tmp = new int[myArray.length + 1];
//        for(int i = 0; i < myArray.length; i ++) {
//            tmp[i] = myArray[i];
//            System.out.println("We added " + myArray[i] + " !");
//        }
        System.arraycopy(myArray,0,tmp,0,myArray.length);
        tmp[tmp.length - 1] = value;
//        System.out.println("We added " + value+ " !");
        return tmp;
    }
}
