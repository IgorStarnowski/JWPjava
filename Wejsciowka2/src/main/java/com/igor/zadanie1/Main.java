package com.igor.zadanie1;

public class Main {
    public static void main(String[] args) {
        Cars cars = new Cars();

        System.out.println("MARKI SAMOCHODÓW:");
        cars.getCarList().stream().map(Car::marka).forEach(System.out::println);

        System.out.println("SAMOCHODY CZERWONE:");
        cars.getCarList().stream().filter(car -> car.kolor() == Color.CZERWONY).forEach(System.out::println);

        System.out.println("MARKI SAMOCHODÓW:");
        cars.getCarList().stream().filter(car -> car.rokProdukcji() > 2015).forEach(System.out::println);

    }
}
