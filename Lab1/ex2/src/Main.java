public class Main {
    public static void main(String[] args) {
        /**
         *  Primitive: int, double, short, long, float, boolean, byte, char
         *  Wrapper class: Integer, Double, Short, Long, Float, Boolean, Byte, Character
         */
        int intPrimitive = 10;
        double doublePrimitive = 10.1;
        short shortPrimitive = 9;
        long longPrimitive = 100000000000000l;
        float floatPrimitive = 10.4f;
        byte bytePrimitive = 5;
        char charPrimitive = 'V';

        Integer intWrapper = 10;
        Double doubleWrapper = 10.1;
        Long longWrapper = 10L;
        Float floatWrapper = 10.4f;
        Byte byteWrapper = 5;
        Character charWrapper = 'V';


        System.out.println("IntPrimitive: " + intPrimitive);
        System.out.println("IntWrapper: " + intWrapper.toString());
        System.out.println("IntWrapper: " + intWrapper.compareTo(intPrimitive));
        System.out.println("IntWrapper: " + intWrapper.floatValue());


    }
}
