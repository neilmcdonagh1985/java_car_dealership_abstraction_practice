package Vehicle;

public abstract class Vehicle {

    private String make;
    private String model;
    private String year;
    private int price;
    private boolean available;

    public Vehicle(String make, String model, String year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void sold() {
        this.available = false;
    }
}
