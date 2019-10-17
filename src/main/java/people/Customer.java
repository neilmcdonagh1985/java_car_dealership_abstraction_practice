package people;

public class Customer extends Person {

    private double budget;

    public Customer(String name, double budget) {
        super(name);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
