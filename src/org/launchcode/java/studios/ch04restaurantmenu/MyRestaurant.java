package org.launchcode.java.studios.ch04restaurantmenu;

import java.util.Date;

public class MyRestaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item = new MenuItem("Potato Salad", "Potato Salad", 6.0, Category.MAIN_COURSE);
        menu.addItem(item);
        item = new MenuItem("Three Milk Cak", "Three Milk Cak", 7.50, Category.DESSERT, new Date(System.currentTimeMillis() - 3600*1000*24*35L));
        menu.addItem(item);
        item = new MenuItem("Southwestern Eggrolls",
                "These aren’t your ordinary eggrolls. Crispy flour tortillas, chicken, black beans, corn, " +
                        "jalapeño Jack cheese, red peppers, spinach. Served with avocado-ranch.",
                6.0, Category.APPETIZER);
        menu.addItem(item);

        for(MenuItem menuItem : menu.getItems()) {
            System.out.println(menuItem);
        }

    }
}
