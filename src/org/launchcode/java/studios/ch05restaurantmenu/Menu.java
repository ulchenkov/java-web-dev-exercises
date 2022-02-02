package org.launchcode.java.studios.ch05restaurantmenu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private final ArrayList<MenuItem> items;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items, Date lastUpdate) {
        this.items = items;
        this.lastUpdated = lastUpdate;
    }

    public Menu() {
        this(new ArrayList<>(), new Date());
    }

    public ArrayList<MenuItem> getItems() {
        return new ArrayList<>(this.items);
    }

    public boolean addItem(MenuItem item) {
        if (item != null && !this.items.contains(item)) {
            this.items.add(item);
            this.lastUpdated = new Date();
            return true;
        }
        System.out.println("Item hasn't been added because it is already on the menu!");
        return false;
    }

    public boolean removeItem(MenuItem item) {
        boolean result = this.items.remove(item);
        if (result) {
            this.lastUpdated = new Date();
        }
        return result;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedFormatted() {
        SimpleDateFormat dateFormatted = new SimpleDateFormat("EEE, MMM d, yyyy");
        return dateFormatted.format(this.lastUpdated);
    }

    @Override
    public String toString() {
        StringBuilder menuText = new StringBuilder("\n=== OUR MENU === \n\n" + "Last updated: " + getLastUpdatedFormatted() + "\n\n");
        for(var item : items) {
            menuText.append(String.format("%s\n", item));
        }
        return menuText.toString();
    }
}
