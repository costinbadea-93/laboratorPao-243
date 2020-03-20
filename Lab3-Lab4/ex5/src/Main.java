public class Main {
    public static void main(String[] args) {

        String myString  =  "Hello";
        concat1(myString);
        System.out.println(myString);

        StringBuilder stringBuilder = new StringBuilder(myString);
        concat2(stringBuilder);
        System.out.println(stringBuilder.toString());


        StringBuffer stringBuffer = new StringBuffer(myString);
        concat3(stringBuffer);
        System.out.println(stringBuffer.toString());
    }

    public static void concat1(String str) {
        str += " concat 1";
    }

    public static void concat2(StringBuilder stringBuilder) {
        stringBuilder.append("concat2");
    }

    public static void concat3(StringBuffer stringBuffer) {
        stringBuffer.append("concat3");
    }
}
