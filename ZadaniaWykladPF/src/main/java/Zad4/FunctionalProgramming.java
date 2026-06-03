package Zad4;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Przemek", "Dorota", "Łukasz", "Karol", "Anna", "Marcysia");
        long counter = 0;
        for(String name : names){
            if(name.length() > 6){
                counter++;
            }
        }
        System.out.println(counter);
        long counter1 = names.stream().filter(name -> name.length() > 6).count();
        System.out.println(counter1);
    }
}
