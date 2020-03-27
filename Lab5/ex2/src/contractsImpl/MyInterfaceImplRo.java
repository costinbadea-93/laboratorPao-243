package contractsImpl;

import contract.MyInterface;

public class MyInterfaceImplRo implements MyInterface {
    @Override
    public void saySomething(String msg) {
        System.out.println("Salut! " + msg);
    }
}
