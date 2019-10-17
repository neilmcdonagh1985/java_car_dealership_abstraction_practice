import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void before() {
        dealership = new Dealership("Cars and Stuff", 10000);
        car = new Car("Toyota", "Yaris", "1998", 2000);
        dealership.addVehicle(car);

    }

    @Test
    public void getName() {
        assertEquals("Cars and Stuff", dealership.getName());
    }

    @Test
    public void canCountVehicles() {
        assertEquals(1, dealership.countVehicles());
    }

    @Test
    public void hasBalance() {
        assertEquals(10000, dealership.getBalance(), 0.01);
    }
}
