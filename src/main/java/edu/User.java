package edu;

import java.util.ArrayList;

/**
 * This is the main user class for our gym software
 */

public class User {
    public int height;
    public int weight;
    public int avail;
    public Restriction limits;
    public ArrayList<String> goals;

    public User(int height,int weight){
        this.height=height;
        this.weight=weight;
    }

    public void changeWeight(int newWeight) {
        weight = newWeight;
    }

    public void changeHeight(int newHeight) {
        height = newHeight;
    }

    public void updateAvailability(int newAvail) {
        avail = newAvail;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }
}
