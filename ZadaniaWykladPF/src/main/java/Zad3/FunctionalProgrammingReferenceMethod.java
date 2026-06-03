package Zad3;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgrammingReferenceMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        names.forEach((String s) -> System.out.println(s));
        names.forEach((name) -> System.out.println(name));
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
