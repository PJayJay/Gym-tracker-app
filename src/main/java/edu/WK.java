package edu;

public class WK {
    private String type;         // e.g., "Weight Loss" or "Gaining Weight"
    private String name;         // e.g., "Running" or "Bench Press"
    private int calories;        // calories burned
    private double timeNeeded;   // time in minutes to complete the workout

    // Constructor
    public WK(String type, String name, int calories, double timeNeeded) {
        this.type = type;
        this.name = name;
        this.calories = calories;
        this.timeNeeded = timeNeeded;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getTimeNeeded() {
        return timeNeeded;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setTimeNeeded(double timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    // toString method
    @Override
    public String toString() {
        return "Workout{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", timeNeeded=" + timeNeeded + " minutes" +
                '}';
    }
}
