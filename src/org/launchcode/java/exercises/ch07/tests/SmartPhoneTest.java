package org.launchcode.java.exercises.ch07.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.ch07.Laptop;
import org.launchcode.java.exercises.ch07.SmartPhone;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone smartPhone;

    @Before
    public void SmartPhone() {
        smartPhone = new SmartPhone("Qualcomm Snapdragon 888", 6,
                "Android 12", 6.4, "2G, 3G, 4G, 5G", false );
    }

    @Test
    public void getSupportedWirelessTechnologiesReturnsCorrectValue() {
        assertEquals("2G, 3G, 4G, 5G", smartPhone.getSupportedWirelessTechnologies());
    }

    @Test
    public void isLockedReturnsCorrectValue() {
        assertEquals(false, smartPhone.isLocked());
    }
}
