package edu;
import java.util.ArrayList;
public class Restriction {
    private boolean isVegan;
    private boolean isVegetarian;
    private ArrayList<String> allergies;

    public Restriction(boolean isVegan,boolean isVegetarian, ArrayList<String> allergies){
        this.isVegan=isVegan;
        this.isVegetarian=isVegetarian;
        this.allergies=allergies;
    }

    public boolean getVegan(){
        return isVegan;
    }

    public boolean getVegetarian(){
        return isVegetarian;
    }

    public ArrayList<String> getAllergies(){
        return allergies;
    }

    public void changeVegan(boolean f){

    }

    public void changeVegetarian(boolean f){

    }

    public void addAllergy(String f){

    }

}
