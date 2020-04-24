import interfaceImplementation.MyInterfaceImpl;
import interfaces.MyInterface;

public class Main {
    public static void main(String[] args) {
        /**
         *  Interfata functionala => interfata cu o singura metoda abstracta(insa oricate
         *  static si default)
         */

        //caz 1
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        System.out.println("SumaImpl : " + myInterfaceImpl.sum(5, 6));


        //caz 2
        MyInterface myInterface = new MyInterface() {
            @Override
            public int sum(int n1, int n2) {
                return n1 + n2;
            }
        };
        System.out.println("SumaInterface : " + myInterface.sum(5,6));

        //caz 3
        MyInterface myInterfaceLambda = (n1,n2) -> n1 + n2;
        System.out.println("SumLambda : " + myInterfaceLambda.sum(5,6));
    }
}
