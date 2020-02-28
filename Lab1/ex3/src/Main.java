import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Citire din consola
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar de la tastatura : ");
        int val1 = scanner.nextInt();
        System.out.println("Introduceti cel de al doilea numar de la tastatura : ");
        int val2 = scanner.nextInt();

        System.out.println("Suma numerelor introduse este : " + (val1 + val2));

        /**
         * Citire din fisier
         */
        String filePath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\laborator PAO\\ex3\\src\\data.txt";
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
