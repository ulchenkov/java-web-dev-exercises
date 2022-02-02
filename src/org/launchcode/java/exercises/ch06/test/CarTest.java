package org.launchcode.java.exercises.ch06.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.ch06.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {
    Car testCar;
    @Before
    public void createCarObject() {
        testCar = new Car("Toyota", "Corolla", 13, 25);
    }

    @After
    public void sayGoodbye() {

    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(13, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        testCar.drive(25);
        assertEquals(12, testCar.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        testCar.drive(5000);
        assertEquals(0, testCar.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test (expected = IllegalArgumentException.class)
    public void  testGasOverfillException() {
        testCar.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

    @Test
    public void getMake() {
        assertEquals("Toyota", testCar.getMake());
    }

    @Test
    public void setMake() {
        testCar.setMake("Ford");
        assertEquals("Ford", testCar.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Corolla", testCar.getModel());
    }

    @Test
    public void setModel() {
        testCar.setModel("Prius");
        assertEquals("Prius", testCar.getModel());
    }

    @Test
    public void getGasTankSize() {
        assertEquals(13, testCar.getGasTankSize());
    }

    @Test
    public void setGasTankSize() {
        testCar.setGasTankSize(12);
        assertEquals(12, testCar.getGasTankSize());
    }

    @Test
    public void getGasTankLevel() {
        assertEquals(13, testCar.getGasTankLevel(), .001);
    }

    @Test
    public void setGasTankLevel() {
        testCar.setGasTankLevel(10);
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }

    @Test
    public void getMilesPerGallon() {
        assertEquals(25, testCar.getMilesPerGallon(), .001);
    }

    @Test
    public void setMilesPerGallon() {
        testCar.setMilesPerGallon(50);
        assertEquals(50, testCar.getMilesPerGallon(), .001);
    }

    @Test
    public void getOdometer() {
        assertEquals(0, testCar.getOdometer(), .001);
    }

    @Test
    public void drive() {
        testCar.drive(23);
        assertEquals(23, testCar.getOdometer(), .001);
        testCar.drive(5000);
        assertEquals(325, testCar.getOdometer(), .001);
    }

    @Test
    public void addGas() {
        testCar.drive(50);
        testCar.addGas(.5);
        assertEquals(11.5, testCar.getGasTankLevel(), .001);
    }
}
