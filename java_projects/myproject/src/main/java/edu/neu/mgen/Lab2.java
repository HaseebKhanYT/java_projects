package edu.neu.mgen;

abstract class Animal {
    String name;
    String typicalSize;
    int typicalWeight;
    boolean isPredator;
    boolean isVegetartian;

    public Animal(String name, String size, int weight, boolean isPredator, boolean isVeg) {
        this.name = name;
        this.typicalSize = size;
        this.typicalWeight = weight;
        this.isPredator = isPredator;
        this.isVegetartian = isVeg;
    }

    abstract void displayInfo();
}

class Bird extends Animal {
    String speciesName;
    int wingspan;

    public Bird(String name, String size, int weight, boolean isPredator, boolean isVeg, String speciesName, int wingspan) {
        super(name, size, weight, isPredator, isVeg);
        this.speciesName = speciesName;
        this.wingspan = wingspan;
    }

    @Override
    void displayInfo() {
        System.out.println("Type: Bird");
        System.out.println("Name: " + name);
        System.out.println("Predator: " + isPredator);
        System.out.println("Species: " + speciesName);
        System.out.println("Wingspan: " + wingspan + "cm");
    }
}

class LandAnimal extends Animal {
    int numberOfLegs;

    // Constructor
    public LandAnimal(String name, String size, int weight, boolean isPredator, boolean isVeg, int numberOfLegs) {
        super(name, size, weight, isPredator, isVeg);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    void displayInfo() {
        System.out.println("Type: Land Animal");
        System.out.println("Name: " + name);
        System.out.println("Typical Weight: " + typicalWeight);
        System.out.println("Predator: " + isPredator);
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}

class Fish extends Animal {
    int numberOfFins;
    String species;
    boolean hasGills;

    public Fish(String name, String size, int weight, boolean isPredator, boolean isVeg, int numberOfFins, String species, boolean hasGills) {
        super(name, size, weight, isPredator, isVeg);
        this.numberOfFins = numberOfFins;
        this.species = species;
        this.hasGills = hasGills;
    }

    @Override
    void displayInfo() {
        System.out.println("Type: Fish");
        System.out.println("Name: " + name);
        System.out.println("Size: " + typicalSize);
        System.out.println("Predator: " + isPredator);
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Species: " + species);
        System.out.println("Gills: " + hasGills);
    }
}

public class Lab2 {
    public static void main(String[] args) {

        Bird robin = new Bird("Robin", "Small", 50, false, true, "American Robin", 30);
        LandAnimal lion = new LandAnimal("Lion", "Large", 250, true, false, 4);
        Fish salmon = new Fish("Salmon", "Medium", 15, true, false, 2, "Atlantic Salmon", true);
        System.out.println();
        System.out.println("The following are the details of the Animals:\n");

        robin.displayInfo();
        System.out.println();

        lion.displayInfo();
        System.out.println();

        salmon.displayInfo();
    }
}
