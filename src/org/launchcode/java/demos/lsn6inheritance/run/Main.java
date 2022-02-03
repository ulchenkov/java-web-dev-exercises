package org.launchcode.java.demos.lsn6inheritance.run;

import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class Main {
    public static void main(String[] args) {
//        HouseCat garfield = new HouseCat("Garfield", 12);
//        garfield.eat();
//        System.out.println(garfield.isTired());
//        System.out.println(garfield.isHungry());
//        System.out.println(garfield.getWeight());
//        System.out.println(garfield.noise());
//
//        Cat myCat=new HouseCat("s", 12);
//        myCat.eat();
//        System.out.println(myCat.isHungry());
//        System.out.println(myCat.sayHi());
//
//        System.out.println(((HouseCat)myCat).isSatisfied());

        // ***********

        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        System.out.printf("%s - %s pounds! (%s)",keyboardCat.getName(), keyboardCat.getWeight(), keyboardCat.myWeight);

    }
}
