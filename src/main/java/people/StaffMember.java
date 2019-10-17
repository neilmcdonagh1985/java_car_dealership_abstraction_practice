package people;

import Vehicle.Vehicle;
import behaviours.ISell;

import java.util.ArrayList;

public class StaffMember extends Person implements ISell {

    private ArrayList<Vehicle> vehiclesSold;

    public StaffMember(String name) {
        super(name);
        this.vehiclesSold = new ArrayList<Vehicle>();
    }

    public int countVehiclesSold() {
        return this.vehiclesSold.size();
    }

    public String sell(Vehicle vehicle) {
        this.vehiclesSold.add(vehicle);
        vehicle.sold();
        return "I have sold a: " + vehicle.getMake();

    }
}
