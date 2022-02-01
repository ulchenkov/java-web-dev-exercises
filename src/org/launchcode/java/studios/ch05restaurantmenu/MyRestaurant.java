package org.launchcode.java.studios.ch05restaurantmenu;

import java.util.Date;

public class MyRestaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item = new MenuItem("Potato Salad", 6.0, Category.MAIN_COURSE);
        menu.addItem(item);
        item = new MenuItem("Three Milk Cak", 7.50, Category.DESSERT, new Date(System.currentTimeMillis() - 3600*1000*24*35L));
        menu.addItem(item);
        item = new MenuItem("Southwestern Eggrolls", 6.0, Category.APPETIZER);
        menu.addItem(item);
        MenuItem itemToRemove = item;
        item = new MenuItem("Potato Salad", 6.0, Category.MAIN_COURSE);
        System.out.println(menu.addItem(item));

        System.out.println(menu);

        menu.removeItem(itemToRemove);
        System.out.println(menu);

    }
}
