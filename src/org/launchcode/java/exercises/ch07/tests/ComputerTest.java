package org.launchcode.java.exercises.ch07.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.exercises.ch07.Computer;



public class ComputerTest {
    Computer computer;

    @Before
    public void initializeComputer() {
        computer = new Computer("Intel Core i5 1135G7", 8, "Windows 11", 15.6);
    }

    @Test
    public void getCpuReturnsCorrectValue() {
        assertEquals("Intel Core i5 1135G7", computer.getCpu());
    }

    @Test
    public void getRamSizeReturnsCorrectValue() {
        assertEquals(8, computer.getRamSize());
    }

    @Test
    public void getOsReturnsCorrectValue() {
        assertEquals("Windows 11", computer.getOs());
    }

    @Test
    public void getScreenSizeReturnCorrectValue() {
        assertEquals(15.6, computer.getScreenSize(), .001);
    }
}
