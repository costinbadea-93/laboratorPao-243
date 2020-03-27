import contractsImpl.MyInterfaceImplEn;
import contractsImpl.MyInterfaceImplRo;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImplEn myInterfaceImplEn = new MyInterfaceImplEn();
        MyInterfaceImplRo myInterfaceImplRo = new MyInterfaceImplRo();

        myInterfaceImplEn.saySomething("world");
        myInterfaceImplRo.saySomething("lume");
        myInterfaceImplRo.m1();
    }
}
