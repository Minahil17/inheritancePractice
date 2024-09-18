package com.qa;
import static com.qa.Animal.getTotalAnimals;

public class Main {
    public static void main(String[] args) {

        animalTypes();

    }

    public static void animalTypes() {

        //Animal frog = new Animal("Amphibian", "Male", 7, "Amazon", "Rainforest", 21.7);
//        frog.setSpecies("Amphibian");
//        frog.setAge(7);
//        frog.setGender("Male");
//        frog.setHabitat("Rainforest");
//        frog.setLocation("Amazon");
//        frog.setWeight(21.8);

//        System.out.println("A frog is an " + frog.getSpecies());
//        System.out.println("Age: " + frog.getAge());
//        System.out.println("Habitat: " + frog.getHabitat());
//        System.out.println("Location: " + frog.getLocation());
//        System.out.println("Weight: " + frog.getWeight() + "g");

       // Animal lion = new Animal("Mammal", "Male", 12, "Sub-Saharan Africa", "Open Savanna", 1500);
//        System.out.println(lion.toString());
        //System.out.println(lion);

       // Animal salmon = new Animal("Fish",  "Female", 5, "Pacific Ocean", "Ocean", 20.2);
        //System.out.println(salmon);

        Reptile lizard = new Reptile("Reptile","Male", 7, "Australia", "Woodland", 15.0, true, true);
        System.out.println(lizard);

//        Array of object instances
        Animal[] animals = {lizard};
        for (Animal a : animals) {
            System.out.println("-----------------------------");
            System.out.println(a);
            System.out.println(a.makeNoise());
        }

        System.out.println("\nTotal Animals: " + getTotalAnimals());
    }}