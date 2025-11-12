package Task03.Vehicle;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelEfficiency() {
        return hasSidecar ? 25.0 : 35.0; // km/l (example values)
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency() + " km/l");
    }
}
