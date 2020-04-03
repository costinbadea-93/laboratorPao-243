import exceptions.MyException1;
import exceptions.MyException2;

public class Main {
    public static void main(String[] args) {

        /**
         *          RuntimeException
         *
         *    MyException1    MyException2
         */

        try{
            m1();
        }catch (MyException1 | MyException2 e1) {
            e1.printStackTrace();
        } finally {
            System.out.println("Executing finally");
        }

//        try{
//            m1();
//        }catch (MyException1 | RuntimeException e1) {
//            e1.printStackTrace();
//        } finally {
//            System.out.println("Executing finally");
//        }

        try {
            m1();
        }catch (MyException1 e) {
            e.printStackTrace();
        }catch ( RuntimeException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Executing finally");
        }

//        try {
//            m1();
//        }catch (RuntimeException e) {
//            e.printStackTrace();
//        }catch ( MyException1 e) {
//            e.printStackTrace();
//        }finally {
//            System.out.println("Executing finally");
//        }

    }


    private static void m1() {
        throw new MyException1("MyException1!");
    }

    private static void m2() {
        throw new MyException2("MyException2!");
    }
}
