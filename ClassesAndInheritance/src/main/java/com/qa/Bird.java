package com.qa;

//this class is a subclass of the superclass animal
public class Bird extends Animal{

    //constructor
    public Bird(String species, String gender, int age, String location, String habitat, double weight, boolean canFly){
        // calling the superclass constructors
        super(species, gender, age, location, habitat,weight);
        this.setCanFly(canFly);
    }

    public Bird(){
        this("Bird", "unknown", 0, "unknown", "unknown", 0.0, true);
    }

 // overriding the abstract method used from animal abstract class
 @Override
 public String makeNoise() {
     return "Hoot hoot";
 }

    // getters and setters
    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // variables
    private boolean canFly;

}
