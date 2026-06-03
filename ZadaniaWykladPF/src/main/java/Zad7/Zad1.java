package Zad7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad1 {
    private static final List<String> LIST = Arrays.asList("aab", "aab",
            "aac", "aac",
            "bbb", "ccc", "ddd",
            "eee", "fff", "ggg");

    public static void main(String[] args) {
        LIST.stream()
                .filter(e -> e.startsWith("a"))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}