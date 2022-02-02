package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

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
        //assertEquals(13, testCar.getGasTankLevel(), .001);
        assertTrue(testCar.getGasTankLevel() == 13);
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

}
