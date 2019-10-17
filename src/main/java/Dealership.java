import Vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> availableVehicles;
    private double balance;
    private String name;

    public Dealership(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.availableVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return this.name;
    }

    public void addVehicle(Vehicle vehicle) {
        this.availableVehicles.add(vehicle);
    }

    public int countVehicles() {
        return this.availableVehicles.size();
    }

    public double getBalance() {
        return this.balance;
    }






}
