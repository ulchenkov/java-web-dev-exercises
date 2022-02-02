package org.launchcode.java.studios.ch05restaurantmenu.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.ch05restaurantmenu.Category;
import org.launchcode.java.studios.ch05restaurantmenu.MenuItem;

import java.util.Date;

import static org.junit.Assert.*;

public class MenuItemTest {
    MenuItem item;

    @Before
    public void setItem() {
        item = new MenuItem("Tacos", 10, Category.APPETIZER);
    }

    @Test
    public void getDescription() {
        assertEquals("Tacos", item.getDescription());
    }

    @Test
    public void getPrice() {
        assertEquals(10, item.getPrice(), .001);
    }

    @Test
    public void getCategory() {
        assertEquals(Category.APPETIZER, item.getCategory());
    }

    @Test
    public void getStartDate() {
        assertTrue(new Date().getTime() - item.getStartDate().getTime() < 2000);
    }

    @Test
    public void isNewTrue() {
        assertTrue(item.isNew());
    }

    @Test
    public void isNewFalse() {
        item = new MenuItem("Tacos", 10, Category.APPETIZER, new Date(System.currentTimeMillis() - 3600*1000*24*35L));
    }


}
