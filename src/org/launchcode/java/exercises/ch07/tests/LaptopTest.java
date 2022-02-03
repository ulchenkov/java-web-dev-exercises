package org.launchcode.java.exercises.ch07.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.ch07.Computer;
import org.launchcode.java.exercises.ch07.Laptop;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop laptop;

    @Before
    public void initializeLaptop() {
        laptop = new Laptop("Intel Core i5 1135G7", 8, "Windows 11", 15.6, 256);
    }

    @Test
    public void getHddCapacityReturnsCorrectValue() {
        assertEquals(256, laptop.getHddCapacity());
    }

    @Test
    public void getCpuReturnsCorrectValue() {
        assertEquals("Intel Core i5 1135G7", laptop.getCpu());
    }

    @Test
    public void getRamSizeReturnsCorrectValue() {
        assertEquals(8, laptop.getRamSize());
    }

    @Test
    public void getOsReturnsCorrectValue() {
        assertEquals("Windows 11", laptop.getOs());
    }
}
