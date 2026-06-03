package Zad7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad3 {
    private static final List<String> LIST = Arrays.asList("aab", "aab",
            "aac", "aac",
            "bbb", "ccc", "ddd");
    public static void main(String[] args) {
        LIST.parallelStream()
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
