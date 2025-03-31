package edu;


public class Food {
    String name;

    //Food restrictions are all booleans
    boolean isVegan;
    boolean isVegatarian;
    
    // Allergies
    boolean isNut;
    boolean isShellfish;
    boolean isSoy;
    boolean isDairy;
    boolean isWheat;


    // This is if the food is good for bulking
    boolean isBulking;
    // Calories are per 100g of the food
    Integer calories;

    /**
     * Constructor for the Food class
     * @param name
     * @param calories
     * @param isVegan
     * @param isVegatarian
     * @param isNut
     * @param isShellfish
     * @param isSoy
     * @param isDairy
     * @param isWheat
     * @param isBulking
     */
    public Food(String name, Integer calories, boolean isVegan, boolean isVegatarian, boolean isNut, boolean isShellfish, boolean isSoy, boolean isDairy, boolean isWheat, boolean isBulking) {
        this.name = name;
        this.calories = calories;
        this.isVegan = isVegan;
        this.isVegatarian = isVegatarian;
        this.isNut = isNut;
        this.isShellfish = isShellfish;
        this.isSoy = isSoy;
        this.isDairy = isDairy;
        this.isWheat = isWheat;
        this.isBulking = isBulking;

    }

    /**
     * Simplified Constructor for the Food class
     * @param name
     * @param calories
     * @param isVegan
     */
    public Food(String name, Integer calories, boolean isVegan){
        this.name = name;
        this.calories = calories;
        this.isVegan = isVegan;
        this.isVegatarian = isVegan;
        this.isNut = false;
        this.isShellfish = false;
        this.isSoy = false;
        this.isDairy = false;
        this.isWheat = false;
        this.isBulking = false;

    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public boolean isVegatarian() {
        return isVegatarian;
    }

    public boolean isNut() {
        return isNut;
    }

    public boolean isShellfish() {
        return isShellfish;
    }

    public boolean isSoy() {
        return isSoy;
    }

    public boolean isDairy() {
        return isDairy;
    }

    public boolean isWheat() {
        return isWheat;
    }

    public boolean isBulking() {
        return isBulking;
    }

}
