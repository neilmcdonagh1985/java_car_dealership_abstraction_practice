import org.junit.Before;
import org.junit.Test;
import people.Manager;
import people.StaffMember;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    StaffMember staffMember;

    @Before
    public void before() {
        manager = new Manager("Bob");
        staffMember = new StaffMember("Simon");
        manager.addStaffMember(staffMember);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void addStaffMemberToTeam() {
        assertEquals(1, manager.countTeam());
    }

    @Test
    public void isInStaffMemberList() {
        assertEquals(staffMember, manager.getTeamMember("Simon"));
    }
}
