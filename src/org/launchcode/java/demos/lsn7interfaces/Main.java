package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        System.out.printf("Before: %s%n", flavors);
        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        System.out.printf("After: %s%n", flavors);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.printf("Before: %s%n", cones);
        cones.sort(new ConeComparator());
        System.out.printf("After: %s%n", cones);
        flavors.sort(new AllergensComparator());
        cones.sort(new AllergensComparator());
        System.out.printf("After by allergens: %s%n", flavors);
        System.out.printf("After by allergens: %s%n", cones);


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
