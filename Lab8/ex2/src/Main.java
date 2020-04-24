import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("s1","s5","s3","s2");

        //caz 1
        for(int i = 0; i < list.size(); i ++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.println("\n");
        //caz 2
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println("\n");
        //caz 3
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " " );
        }

        //caz 4
        list.forEach( s -> System.out.print (s));
        System.out.println("\n");

        //caz 5
        list.forEach(System.out::print);

       List<String> s1 = list.stream()
               .filter( e-> e.equals("s5"))
               .map( e -> {
                   System.out.println("bla bbla bla");
                   return  e.toUpperCase() ;
               }).collect(Collectors.toList());
        System.out.println(s1);

        String s2 = list.stream()
                .filter( e-> e.equals("s5"))
                .map( e -> {
                    System.out.println("bla bbla bla");
                    return  e.toUpperCase() ;
                }).collect(Collectors.joining());

        System.out.println(s2);
    }
}
