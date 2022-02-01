package org.launchcode.java.studios.ch05restaurantmenu;

import java.util.Date;

public class MenuItem {
    private static final int NEW_DAYS = 30;
    private static  final long MILLISECONDS_IN_DAY =  1000 * 60 * 60 * 24; // 86400000

    private String description;
    private double price;
    private Category category;
    private Date startDate;

    public MenuItem(String description, double price, Category category, Date startDate) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.startDate = startDate;
    }

    public MenuItem(String description, double price, Category category) {
        this(description, price, category, new Date());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isNew() {
        return (new Date().getTime() - this.startDate.getTime()) / MILLISECONDS_IN_DAY < NEW_DAYS;
    }

    @Override
    public String toString() {
        return String.format("%s: %s - $%.2f. %s", category, description, price, isNew() ? "NEW!" : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (!description.equals(menuItem.description)) return false;
        return category == menuItem.category;
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }
}
