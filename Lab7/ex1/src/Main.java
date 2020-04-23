import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * interface List -> Implements : Arraylist,LinkedList,Vector,Stack;
         */

        List<String> l1 = new ArrayList<>(); //nu pastreaza ordinea
        List<String> l2 = new LinkedList<>();//pastreaza ordinea
        List<String> l3 = new Vector<>();
        List<String> l4 = new Stack<>();

        l1.add("v1");
        l2.add("v1");
        l3.add("v1");
        l4.add("v1");

//        Iterator<String> iterator = l1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        l1.forEach(System.out::println);

        /**
         * interface - Queue -> PriorityQue
         */
        Queue<String> l5 = new PriorityQueue<>();
        l5.add("v1");
//        Iterator<String> iterator1 = l5.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        /**
         * interface - Set -> Implements: HashSet,LinkedHashSet
         *                 -> interface Sorted Set -> Implements: TreeSet
         */
        Set<String> l6 = new HashSet<>();
        Set<String> l7 = new LinkedHashSet<>();
        l6.add("v1");
        l6.add("v1");
        l6.add("v1");
        l6.add("v2");
//        Iterator<String> iterator2 = l6.iterator();
//        while (iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }

        SortedSet<String> l8 = new TreeSet<>();
        l8.add("v3");
        l8.add("v2");
        l8.add("v5");
//        Iterator<String> iterator3 = l8.iterator();
//        while (iterator3.hasNext()){
//            System.out.println(iterator3.next());
//        }

        /**
         * interface Map -> HashMap,LinkedHashMap
         *               -> interface SortedMap -> TreeMap
         */

        Map<String,String> m1 = new HashMap<>();
        m1.put("K1","V1");
        m1.put("K2","V2");
        m1.put("K3","V3");
        Set set = m1.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println(map.getKey() + " " + map.getValue());
        }

        m1.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
