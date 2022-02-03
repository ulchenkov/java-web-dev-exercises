package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";
    public double myWeight;

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
        myWeight = getWeight();
    }


    public HouseCat() {

    }

    public String getName() {
        return name;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return super.noise() + " Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }


    public String sayHi() {
        return "Hi!";
    }
}
