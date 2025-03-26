package edu;
import java.util.ArrayList;
public class Planner {

    private User person;
    private ArrayList<int[]> map;
    private ArrayList<WK> workouts;
    private ArrayList<Food> diet;
    private Week currentWeek;
    private ArrayList<Week> history;

    public Planner(User p){
        person=p;
        map=new ArrayList<int[]>();
        workouts=new ArrayList<WK>();
        diet=new ArrayList<Food>();
        currentWeek=new Week();
        history=new ArrayList<Week>();
    }

    public ArrayList<Food> getFood(){
        return diet;
    }

    public ArrayList<WK> getWK(){
        return workouts;
    }

    //unfinished
    public void showCalendar(){

    }

    //unfinished
    public void logState(){

    }

    //unfinished
    public void makeMap(){

    }

    public ArrayList<Week> getHistory(){
        return history;
    }

    
}
