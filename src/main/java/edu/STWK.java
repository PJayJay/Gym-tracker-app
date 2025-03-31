package edu;

public class STWK extends WK {
    private int sets;    // number of sets
    private int reps;    // number of reps per set
    private int weight;  // weight used in pounds or kilograms

    // Constructor
    public STWK (String type, String name, int calories, double timeNeeded, int sets, int reps, int weight) {
        super(type, name, calories, timeNeeded); // Call parent constructor
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    // Getters
    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

    // Setters
    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Override toString to include strength-specific info
    @Override
    public String toString() {
        return "StrengthWorkout{" +
                "type='" + getType() + '\'' +
                ", name='" + getName() + '\'' +
                ", calories=" + getCalories() +
                ", timeNeeded=" + getTimeNeeded() + " minutes" +
                ", sets=" + sets +
                ", reps=" + reps +
                ", weight=" + weight + " lbs" +
                '}';
    }
}
