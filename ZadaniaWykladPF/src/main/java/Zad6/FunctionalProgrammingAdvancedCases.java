package Zad6;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgrammingAdvancedCases {
    @Test
    public void mapExample(){
        List<String> names = Arrays.asList("Przemysław", "Dorota", "Mateusz", "Karol", "Anna", "Maksymilian");
//        names.stream().map(String::length).forEach(System.out::println);
//        List<String> collect = names.stream()
//                .filter(s->s.length()>2)
//                .limit(5)
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(collect);
        String collect = names.stream()
                .filter(s->s.length()>2)
                .limit(5)
                .map(String::toUpperCase)
                .sorted((Comparator.comparingInt(String::length)))
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
    @Test
    public void statistics(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        OptionalInt optionalInt=numbers.stream().mapToInt(x->x).min();
//        System.out.println(optionalInt.getAsInt());
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
