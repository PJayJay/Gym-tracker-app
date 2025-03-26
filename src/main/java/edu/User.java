package edu;

import java.util.ArrayList;

public class User {
    private int height;
    private int weight;
    public int avail;
    public Restriction limits;
    public ArrayList<String> goals;

    public void changeWeight(int newWeight) {
        weight = newWeight;
    }

    public void changeHeight(int newHeight) {
        height = newHeight;
    }

    public void updateAvailability(int newAvail) {
        avail = newAvail;
    }
}
