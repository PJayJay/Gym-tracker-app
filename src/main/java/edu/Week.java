package edu;
import java.util.ArrayList;


import javax.management.RuntimeErrorException;

/*
 *  This function creates the week that can be viewed in planner, typically this is created by planner and holds
 * all the choices that have been selected for the week
 */
public class Week {
    private ArrayList<Choices> choices;

    public Week(ArrayList<Choices> choices){
        this.choices=choices;
       
    }
}
