package org.launchcode.java.exercises.ch07;

public class Computer extends AbstractEntity {
    private String cpu;
    private int ramSize;
    private String os;
    private double screenSize;

    public Computer(String cpu, int ramSize, String os, double screenSize) {
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.os = os;
        this.screenSize = screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public String getOs() {
        return os;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return String.format("CPU: %s; RAM: %sGb; Display: %s\"; OS: %s.", cpu, ramSize, screenSize, os);
    }
}
