package org.launchcode.java.exercises.ch06.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}
