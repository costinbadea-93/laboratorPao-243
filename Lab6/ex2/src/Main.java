import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *         Object
         *           |
         *        Throwable
         *           |
         *  Exception        Error
         *
         * checked Exception
         * unchecked Exception
         *
         *
         */
        //unchecked Exception
        try{
            m1();
        }catch (NullPointerException ex) {
            System.out.println("Obiectul instantiat este null.");
        }finally {
            System.out.println("Executing finally!!!");
        }


        try {
            m2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       try{
           m3();
       }catch (RuntimeException e) {
           System.out.println("Am prins exceptia de runetime!!!");
       }


        try{
            //some code
        }catch (Exception e) {
            //log exception
        }


        try{
            //some code
        }finally {
            //executing finally
        }

    }


    private static void m1() {
        Scanner scanner = null;
        System.out.println(scanner.nextLine());
    }

    private static void m2() throws FileNotFoundException {
        String filepath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\Lab Pao\\Lab6\\ex2\\src\\data.txt";
        Scanner scanner = new Scanner(new File(filepath));
    }

    private static void m3() {
        throw new RuntimeException("Exceptie!!!");
    }
}
