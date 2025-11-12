package Task03.Vehicle;

public class Truck extends Vehicle {
    private double loadCapacity; // in tons

    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8.0; // km/l (example value)
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " km/l");
    }
}
