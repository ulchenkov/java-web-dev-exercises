package org.launchcode.java.exercises.ch07;

public abstract class AbstractEntity {
    private static int _id = 0;

    private int id;

    public AbstractEntity() {
        id=_id++;
    }

    public int getId() {
        return id;
    }
}
