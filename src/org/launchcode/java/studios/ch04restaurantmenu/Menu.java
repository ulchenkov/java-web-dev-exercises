package org.launchcode.java.studios.ch04restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdate;

    public Menu(ArrayList<MenuItem> items, Date lastUpdate) {
        this.items = items;
        this.lastUpdate = lastUpdate;
    }

    public Menu() {
        this(new ArrayList<>(), new Date());
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public boolean addItem(MenuItem item) {
        if (item != null && !this.items.contains(item)) {
            this.items.add(item);
            this.lastUpdate = new Date();
            return true;
        }
        return false;
    }

    public boolean removeItem(MenuItem item) {
        return this.items.remove(item); // removing item should not change lastUpdate
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
