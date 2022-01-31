package org.launchcode.java.studios.ch04restaurantmenu;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class MenuItem {
    private static final int NEW_DAYS = 30;
    private static  final long MILLISECUNDS_IN_DAY =  1000 * 60 * 60 * 24;
    private String name;
    private String description;
    private double price;
    private Category category;
    private Date startDate;

    public MenuItem(String name, String description, double price, Category category, Date startDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.startDate = startDate;
    }

    public MenuItem(String name, String description, double price, Category category) {
        this(name, description, price, category, new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return (new Date().getTime() - this.startDate.getTime()) / MILLISECUNDS_IN_DAY < NEW_DAYS;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", startDate=" + startDate +
                ", isNew=" + isNew() +
                '}';
    }
}
