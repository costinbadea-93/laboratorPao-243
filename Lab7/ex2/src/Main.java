import model.Book;
import service.MainService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainService mainService = new MainService();

        List<Book> books = Arrays.asList(
          new Book("Name 1", "Author 1"),
          new Book("Name 4", "Author 4"),
          new Book("Name 2", "Author 2")
        );

        System.out.println("Alegeti una din urmatoarele optiuni");
        System.out.println("1.Generare raport sortat crescator dupa nume");
        System.out.println("2.Generare raport sortat descrescator dupa nume");
        System.out.println("3.Generare raport normal");
        System.out.println("4.Afiseaza raportul in consola");


        while (true) {
            String line = scanner.nextLine();
            switch (line) {
                case "1" :
                    Collections.sort(books, Comparator.comparing(Book::getName));
                    mainService.initReportHeader();
                    books.forEach(book -> mainService.writeDataToReport(book));
                    System.out.println("Report was generated with success!!!");
                    break;
                case "2" :
                    Collections.sort(books, Comparator.comparing(Book::getName).reversed());
                    mainService.initReportHeader();
                    books.forEach(book -> mainService.writeDataToReport(book));
                    System.out.println("Report was generated with success!!!");
                    break;
                case "3" :
                    mainService.initReportHeader();
                    books.forEach(book -> mainService.writeDataToReport(book));
                    System.out.println("Report was generated with success!!!");
                    break;
                case "4" :
                    mainService.readDataFromCsv();
                    break;
            }
            break;
        }


    }
}
