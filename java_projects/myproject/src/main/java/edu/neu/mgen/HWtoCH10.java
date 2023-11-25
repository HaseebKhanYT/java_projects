package edu.neu.mgen;

abstract class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    abstract String getType();

    void displayInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Brand: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    boolean isElectric;

    public Car(String make, String model, boolean isElectric) {
        super(make, model);
        this.isElectric = isElectric;
    }

    @Override
    String getType() {
        return "Car";
    }

    void park() {
        System.out.println("Parking gear engaged!");
    }
}

class Motorbike extends Vehicle {
    boolean isCaferacer;

    public Motorbike(String make, String model, boolean isCaferacer) {
        super(make, model);
        this.isCaferacer = isCaferacer;
    }

    @Override
    String getType() {
        return "Motorbike";
    }

    void rev() {
        System.out.println("VROOOOOOM!");
    }
}

class Aircraft extends Vehicle {
    int numberOfEngines;

    public Aircraft(String make, String model, int numberOfEngines) {
        super(make, model);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    String getType() {
        return "Aircraft";
    }

    void takeOff() {
        System.out.println("Taking off!");
    }
}

class Ship extends Vehicle {
    int numberOfPassengers;

    // Constructor
    public Ship(String make, String model, int numberOfPassengers) {
        super(make, model);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    String getType() {
        return "Ship";
    }

    void sail() {
        System.out.println("Sailing!");
    }
}

public class HWtoCH10 {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Prius", true);
        Motorbike myMotorbike = new Motorbike("Yamaha", "R1", false);
        Aircraft myAircraft = new Aircraft("Airbus", "A320", 4);
        Ship myShip = new Ship("Cunard Liner", "QM2", 2000);

        System.out.println("My Car:");
        myCar.displayInfo();
        myCar.park();
        System.out.println();

        System.out.println("My Motorbike:");
        myMotorbike.displayInfo();
        myMotorbike.rev();
        System.out.println();

        System.out.println("My Aircraft:");
        myAircraft.displayInfo();
        myAircraft.takeOff();
        System.out.println();

        System.out.println("My Ship:");
        myShip.displayInfo();
        myShip.sail();
    }
}
