package org.mine.collections;

import java.text.MessageFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lists {

    public static void exploringList(){
        String text = "hola hola como estas como";
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(MessageFormat.format("[{0}] - [{1}]",k, v)));

        List<Integer> integerList = Arrays.asList(2,6,8,4,15,8,4,65,8,1,5,8,7,52,6,65,65,65,9,78,54,5,5);

        integerList.stream()
                .filter(a -> a > 50)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        integerList.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), num -> integerList.stream().filter(x -> x % num == 0).collect(Collectors.toSet())))
                .forEach((k, v) -> System.out.println(MessageFormat.format("{0} - {1}",k, v)));
    }

}
