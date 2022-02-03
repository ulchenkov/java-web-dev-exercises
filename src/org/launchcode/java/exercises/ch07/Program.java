package org.launchcode.java.exercises.ch07;

public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i7", 16, "Windows 10", 27);
        Laptop laptop = new Laptop("Intel Core i5 1135G7", 8, "Windows 11", 15.6, 256);
        SmartPhone smartPhone = new SmartPhone("Qualcomm Snapdragon 888", 6,
                "Android 12", 6.4, "2G, 3G, 4G, 5G", false );

        System.out.printf("My computer [%s]: %s\n", computer.getId(), computer);
        System.out.printf("My laptop [%s]: %s\n", laptop.getId(), laptop);
        System.out.printf("My smartPhone [%s]: %s\n", smartPhone.getId(), smartPhone);
    }
}
