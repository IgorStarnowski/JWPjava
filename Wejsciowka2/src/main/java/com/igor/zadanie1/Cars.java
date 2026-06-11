package com.igor.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList = new ArrayList<>();
    public Cars(){
        carList.add(new Car("Toyota", Color.CZERWONY, 2014));
        carList.add(new Car("Honda", Color.NIEBIESKI, 2018));
        carList.add(new Car("Ford", Color.CZERWONY, 2020));
        carList.add(new Car("Mazda", Color.CZARNY, 2015));
        carList.add(new Car("Ferrari", Color.CZERWONY, 2019));
        carList.add(new Car("BMW", Color.BIALY, 2012));
        carList.add(new Car("Porsche", Color.CZERWONY, 2022));
    }
    public List<Car> getCarList(){
        return carList;
    }
}
