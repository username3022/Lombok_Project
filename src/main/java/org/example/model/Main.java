package org.example.model;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("--------------");

        Car car = new Car().builder().brand("Honda").model("Accord").engineVolume("2.2").build();

        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getEngineVolume());

        CarShop car2 = CarShop.builder().price(20000).color("Black, White, Yellow and Blue").kidsSeat(true).build();

        System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getEngineVolume() + " " + car2.getPrice() + " " + car2.getColor() + car2.isKidsSeat());

    }
}