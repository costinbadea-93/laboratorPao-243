import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("2","2","5","7");
        List<String> stringList2 = Arrays.asList("b","c","a");
        List<List<String>> stringList3 = Arrays.asList(
          Arrays.asList("a","b"),
          Arrays.asList("c","d")
        );

        //1
        Stream<List<String>> st1 = Stream.of(stringList);
        st1.forEach(e -> e.forEach(System.out::println));


        //2
        System.out.println("===================");
        Stream.Builder<List<String>> st3 = Stream.builder();
        st3.accept(stringList);
        st3.build().forEach(e -> e.forEach(System.out::println));

        //3
        System.out.println("===================");
        Stream<String> st2 = stringList.stream();
        st2.forEach(System.out::println);

        System.out.println("=======================================================================================");

        //forEach
        System.out.println("===================");
        stringList.forEach(System.out::println);

        //map
        System.out.println("===================");
        List<String> mapList = stringList2.stream()
                                    .map(e -> e.toUpperCase())
                                    .collect(Collectors.toList());
        mapList.forEach(e -> System.out.println(e));

        //collect
        System.out.println("===================");
        String collectString = stringList2.stream()
                                .collect(Collectors.joining(","));
        System.out.println(collectString);

        //filter
        System.out.println("===================");
        stringList.stream()
                .filter(e -> e.equals("2"))
                .forEach(System.out::println);

        //findFirst
        System.out.println("===================");
        stringList.stream()
                .filter(e -> e.equals("2"))
                .findFirst().ifPresent(System.out::println);

        //flatMap
        System.out.println("===================");
        List<String> flatMapList = stringList3.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(flatMapList);

        //peek
        System.out.println("====================");
        stringList.stream()
                .peek(e -> System.out.println(e))
                .forEach(System.out::println);

        //sorted
        System.out.println("===================");
        stringList2.stream().sorted()
                .forEach(System.out::println);

        //min-max
        System.out.println("===================");
        stringList2.stream()
                .max(String::compareTo)
                .ifPresent(System.out::println);

        //distinct
        System.out.println("===================");
        stringList.stream()
                .distinct()
                .forEach(System.out::println);

        //allMatch anyMatch, noneMatch
        System.out.println("===================");
        boolean matching = stringList.stream()
                            .anyMatch(e -> e.equals("5"));
        System.out.println(matching);

        //Specialized Operations
        System.out.println("===================");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        int sum = integerList.stream()
                .mapToInt(Integer::intValue)
//                .average()
                .sum();
        System.out.println("Suma: "  + sum);

        //reduce
        int sum2 = integerList.stream()
                .reduce(0,(curr, prev) -> curr + prev);
        System.out.println("Suma2: " + sum2);

        //Group Operations

        //groupingBy
        System.out.println("===================");
        Map<Boolean,List<Integer>> groupByMap = integerList.stream()
                .collect(Collectors.groupingBy(elem -> elem % 2 == 0));
        System.out.println(groupByMap);
        System.out.println("===================");
        Map<Boolean,List<Integer>> partitioningByMap = integerList.stream()
                .collect(Collectors.partitioningBy(elem -> elem > 4));
        System.out.println(partitioningByMap);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("k1","V1");
        stringMap.put("k2","V2");
        stringMap.put("k3","V3");
        System.out.println("===================");
        Map<String, String> convertedMap =
                 stringMap.entrySet()
                .stream()
                .collect(Collectors.toMap(k-> k.getKey().toUpperCase(), Map.Entry::getValue));
        System.out.println(convertedMap);

        System.out.println("===================");
        integerList.parallelStream()
                .forEachOrdered(System.out::println);

    }
}
