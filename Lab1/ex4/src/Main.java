import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         *  Citire cele doua numere;
         *  Citire operatie("sum","dif","div","mult");
         *  Afisare rezultat
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduceti prima valoare: ");
        int val1 = scanner.nextInt();
        System.out.println("Intoduceti a doua valoare: ");
        int val2 = scanner.nextInt();
        System.out.println("Introduceti operatia: ");
        String operation = scanner.next();

        Calculator calculator = new Calculator();

        switch (operation) {
            case "sum":
                System.out.println(calculator.sum(val1, val2));
                break;
            case "dif":
                System.out.println(calculator.diff(val1, val2));
                break;
            case "mult":
                System.out.println(calculator.mult(val1, val2));
                break;
            case "div":
                System.out.println(calculator.div(val1, val2));
                break;
            default:
                System.out.println("Operatia nu a fost gasita!");
        }
    }
}
