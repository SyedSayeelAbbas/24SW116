// Parent class
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

// Child class Car (overriding displayInfo)
class Cars extends Vehicle {
    int numberOfDoors;

    // Constructor
    Cars(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);  // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    void honk() {
        System.out.println("Car is honking!");
    }
}

// Child class Bike (overriding displayInfo)
class Bike extends Vehicle {
    boolean hasCarrier;

    // Constructor
    Bike(String brand, String model, int year, boolean hasCarrier) {
        super(brand, model, year);
        this.hasCarrier = hasCarrier;
    }

    // Overriding displayInfo method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }

    void ringBell() {
        System.out.println("Bike bell is ringing!");
    }
}

// Main class
public class VechileMain {
    public static void main(String[] args) {
        Cars car = new Cars("Toyota", "Camry", 2022, 4);
        Bike bike = new Bike("Giant", "Escape", 2021, true);

        System.out.println("Car Details:");
        car.displayInfo();
        car.honk();

        System.out.println("\nBike Details:");
        bike.displayInfo();
        bike.ringBell();
    }
}

