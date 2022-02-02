package org.launchcode.java.studios.ch05restaurantmenu.tests;

import org.junit.Test;
import org.launchcode.java.studios.ch05restaurantmenu.Category;
import org.launchcode.java.studios.ch05restaurantmenu.Menu;
import org.launchcode.java.studios.ch05restaurantmenu.MenuItem;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuTest {

    @Test
    public void constructorWithoutParameters() {
        Menu menu = new Menu();
        assertTrue(menu.getItems().isEmpty() &&
                new Date().getTime() - menu.getLastUpdated().getTime() < 2000);
    }

    @Test
    public void constructorWithParameters() {
        ArrayList<MenuItem> items = new ArrayList<>();
        MenuItem item = new MenuItem("Tacos", 10, Category.APPETIZER);
        items.add(item);
        item = new MenuItem("Burrito", 12, Category.MAIN_COURSE);
        items.add(item);

        long millisecondsInOneDay = 1000*60*60*24L;

        Menu menu = new Menu(items, new Date(System.currentTimeMillis() - millisecondsInOneDay));

        assertTrue(menu.getItems().get(1).equals(new MenuItem("Burrito", 12, Category.MAIN_COURSE)) &&
                new Date().getTime() - menu.getLastUpdated().getTime() < millisecondsInOneDay + 2000);
    }

    @Test
    public void getItems() {
        Menu menu = new Menu();
        boolean result = menu.addItem(new MenuItem("Tacos", 10, Category.APPETIZER));
        assertTrue(result &&
                menu.getItems().size() == 1 &&
                menu.getItems().get(0).getDescription().equals("Tacos") &&
                menu.getItems().get(0).getPrice() - 10 < .001);
    }

    @Test
    public void addItem() {
        Menu menu = new Menu();
        boolean result = menu.addItem(new MenuItem("Tacos", 10, Category.APPETIZER));
        MenuItem item = menu.getItems().get(0);
        assertTrue(result &&
                item.getDescription().equals("Tacos") &&
                item.getPrice() - 10 < .001 &&
                item.getCategory() == Category.APPETIZER);
    }

    @Test
    public void addItemReturnsFalseIfItemIsAlreadyOnMenu() {
        Menu menu = new Menu();
        boolean resultTrue = menu.addItem(new MenuItem("Tacos", 10, Category.APPETIZER));
        boolean resultFalse = menu.addItem(new MenuItem("Tacos", 10, Category.APPETIZER));
        assertTrue(resultTrue && !resultFalse && menu.getItems().size() == 1);
    }

    @Test
    public void removeItem() {
        Menu menu = new Menu();
        MenuItem itemToRemove = new MenuItem("Tacos", 10, Category.APPETIZER);
        menu.addItem(itemToRemove);
        menu.addItem(new MenuItem("Burrito", 12, Category.MAIN_COURSE));

        boolean result = menu.removeItem(itemToRemove);

        assertTrue(result &&
                menu.getItems().size() == 1 &&
                menu.getItems().get(0).equals(new MenuItem("Burrito", 12, Category.MAIN_COURSE)));
    }

    @Test
    public void removeItemReturnFalseIfItemNotOnMenu() {
        Menu menu = new Menu();
        MenuItem itemToRemove = new MenuItem("Tacos", 10, Category.APPETIZER);
        menu.addItem(new MenuItem("Burrito", 12, Category.MAIN_COURSE));

        boolean result = menu.removeItem(itemToRemove);

        assertTrue((!result && menu.getItems().size() == 1));
    }

    @Test
    public void getLastUpdate() {
        long millisecondsInOneDay = 1000*60*60*24L;
        Menu menu = new Menu(new ArrayList<>(), new Date(System.currentTimeMillis() - millisecondsInOneDay));
        Date initialDate = menu.getLastUpdated();
        menu.addItem(new MenuItem("Burrito", 12, Category.MAIN_COURSE));
        Date updatedDate = menu.getLastUpdated();

        Date now = new Date();

        assertTrue(now.getTime() - initialDate.getTime() < millisecondsInOneDay + 2000 &&
                now.getTime() - updatedDate.getTime() < 2000);
    }

    @Test
    public void getLastUpdateFormatted() {
        long date = 1643818892127L; //02-02-2022 Wed
        Menu menu = new Menu(new ArrayList<>(), new Date(date));
        assertEquals("Wed, Feb 2, 2022", menu.getLastUpdatedFormatted());
    }
}
