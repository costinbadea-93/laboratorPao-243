public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("D1", 3);
        Dog dog2 = new Dog("D1", 3);

        System.out.println("Comparing dog result ... " + dog1.equals(dog2));
        //DO NOT USE REFLECTION IN JAVA
        System.out.println(dog1.getClass());
        System.out.println(dog1 instanceof Dog);
    }
}
