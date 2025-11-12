package Task03.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0; // km/l (example value)
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " km/l");
    }
}
