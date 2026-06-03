package Zad7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad2 {
    private static final List<String> LIST = Arrays.asList("aab", "aab",
            "aac", "aac",
            "bbb", "ccc", "ddd");
    public static void main(String[] args) {
        List<String> a = LIST.stream()
                .filter(e -> {
                    System.out.println("Stream - filter: " + e);
                    return e.startsWith("a");
                })
                .map(e -> {
                    System.out.println("Stream - map:" + e);
                    return e.toUpperCase();
                })
                .collect(Collectors.toList());
    }
}
