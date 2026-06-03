package Zad5;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgrammingAttend {

    @Test
    public void lambdaExample() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        final Integer[] integer = {2};
////        numbers.stream().map(number->number*integer).forEach(System.out::println);
//        Stream<Integer> integerStream= numbers.stream().map(number->number*integer[0]);
//        integer[0]=22;
//        integerStream.forEach(System.out::println);
//        numbers.stream().map(number->number*2).forEach(System.out::println);
//        System.out.println("------------------------------");
//        System.out.println(numbers);
        List<Integer> collect = numbers.stream().map(number->number*2).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println("------------------------------");
        System.out.println(collect);

    }
}
