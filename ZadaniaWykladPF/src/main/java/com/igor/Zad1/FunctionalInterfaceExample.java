package com.igor.Zad1;

import org.testng.annotations.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

//    @Test
//    public void function(){
//        Function<Integer, String> function = t -> t+t+ "zajęcia.pl";
//        System.out.println(function.apply(69));
//    }
//
//    @Test
//    public void predicate(){
//        Predicate<Student> predicate =p -> p.getAge() > 21;
//        boolean test1 = predicate.test(new Student("Jan", "Kowalski", 21));
//        boolean test2 = predicate.test(new Student("Karol", "Nowak", 23));
//        System.out.println(test1);
//        System.out.println(test2);
//    }

    public static void main(String[] args) {
        Function<Integer, String> function = t -> t+t+ " zajęcia.pl";
        System.out.println(function.apply(69));
        Predicate<Student> predicate =p -> p.getAge() > 21;
        boolean test1 = predicate.test(new Student("Jan", "Kowalski", 21));
        boolean test2 = predicate.test(new Student("Karol", "Nowak", 23));
        System.out.println(test1);
        System.out.println(test2);
    }
}
