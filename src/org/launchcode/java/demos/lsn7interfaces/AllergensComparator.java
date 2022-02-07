package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class AllergensComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient o1, Ingredient o2) {
        return Integer.compare(o2.getAllergens().size(), o1.getAllergens().size());
    }
}
