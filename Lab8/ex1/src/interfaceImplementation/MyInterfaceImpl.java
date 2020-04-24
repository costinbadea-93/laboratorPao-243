package interfaceImplementation;

import interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}
