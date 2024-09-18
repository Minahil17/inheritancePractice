package com.qa;

public class Animal {

    public Animal(){
        this("unknown", "unknown", 0, "unknown", "unknown", 0.0);
    }

    public Animal(String species, String gender, int age, String location, String habitat, double weight) {
        this.species = species;
        this.gender = gender;
        this.age = age;
        this.location = location;
        this.habitat = habitat;
        this.weight = weight;
        totalAnimals++;

    }

    @Override
    public String toString() {
        String animalString = "Animal Info: " + "\n\tSpecies: " + this.species + "\n\tGender: "+ this.gender +  "\n\tAge: "+ this.age + "\n\tLocation: "+ this.location + "\n\tHabitat: "+ this.habitat + "\n\tWeight: "+ this.weight+"g";
        return animalString;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    private String species;

    private String gender;

    public String habitat;

    private int age;

    public String location;

    private double weight;

    public static int totalAnimals = 0;

    public static int getTotalAnimals(){
        return totalAnimals;
    }



}
