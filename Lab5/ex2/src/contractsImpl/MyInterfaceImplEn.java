package contractsImpl;

import contract.MyInterface;

public class MyInterfaceImplEn implements MyInterface {
    @Override
    public void saySomething(String msg) {
        System.out.println("Hello! " + msg);
    }

}
