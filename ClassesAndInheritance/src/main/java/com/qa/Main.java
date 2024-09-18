package com.qa;
import static com.qa.Animal.getTotalAnimals;

public class Main {
    public static void main(String[] args) {

        animalTypes();

    }

    public static void animalTypes() {

        Animal frog = new Animal();
        frog.setSpecies("Amphibian");
        frog.setAge(7);
        frog.setGender("Male");
        frog.setHabitat("Rainforest");
        frog.setLocation("Amazon");
        frog.setWeight(21.8);

        System.out.println("A frog is an " + frog.getSpecies());
        System.out.println("Age: " + frog.getAge());
        System.out.println("Habitat: " + frog.getHabitat());
        System.out.println("Location: " + frog.getLocation());
        System.out.println("Weight: " + frog.getWeight() + "g");

        Animal lion = new Animal();
        System.out.println(lion.toString());
        System.out.println(lion);

        Animal salmon = new Animal("Fish",  "Female", 5, "Pacific Ocean", "Ocean", 20.2);
        System.out.println(salmon);

        System.out.println(getTotalAnimals());
    }}