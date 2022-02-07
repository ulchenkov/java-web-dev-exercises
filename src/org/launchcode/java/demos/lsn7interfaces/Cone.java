package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Cone extends Ingredient {

    public Cone(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }

    @Override
    public String toString() {
        return String.format("%s: $%s (%s)", getName(), getCost(), getAllergens().size());
    }
}
