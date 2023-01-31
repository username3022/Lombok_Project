package org.example.model;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");

        Car car = new Car().builder().brand("Honda").model("Accord").engineVolume("2.2").build();

        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getEngineVolume());


    }
}