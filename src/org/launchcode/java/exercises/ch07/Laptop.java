package org.launchcode.java.exercises.ch07;

public class Laptop extends Computer{
    private final int hddCapacity;

    public Laptop(String cpu, int ramSize, String os, double screenSize, int hddCapacity) {
        super(cpu, ramSize, os, screenSize);
        this.hddCapacity = hddCapacity;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    @Override
    public String toString() {
        return String.format("CPU: %s; RAM: %sGb; HDD: %sGb; Display: %s\"; OS: %s.", getCpu(), getRamSize(), hddCapacity, getScreenSize(), getOs());
    }
}
