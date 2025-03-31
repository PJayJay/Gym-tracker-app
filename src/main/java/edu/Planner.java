package edu;
import java.util.ArrayList;
public class Planner {
    private String name;
    private ArrayList<WK> workout;
    private ArrayList<Food> foods;
    private ArrayList<String> history;
    public int[] map;

    public Planner(String name){
        this.name=name;
    }

    public ArrayList<WK> getWK(){
        if(workout==null){
            workout=new ArrayList<WK>();
        }
        return workout;
    }

    public ArrayList<Food> getFoods(){
        if(foods==null){
            foods=new ArrayList<Food>();
        }
        return foods;
    }

    public ArrayList<String> getHistory(){
        if(history==null){
            history=new ArrayList<String>();
        }
        return history;
    }



    public void makeMap(){

    }
}
