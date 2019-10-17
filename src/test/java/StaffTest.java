import Vehicle.Car;
import org.junit.Before;
import org.junit.Test;
import people.StaffMember;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    StaffMember staffMember;
    Car car;

    @Before
    public void before() {
        staffMember = new StaffMember("Susan");
        car = new Car("Toyota", "Yaris", "1998", 2000);
    }

    @Test
    public void hasName() {
        assertEquals("Susan", staffMember.getName());
    }

    @Test
    public void canSell() {
        staffMember.sell(car);
        assertEquals(1, staffMember.countVehiclesSold());
        assertEquals(false, car.isAvailable());
    }


}
