package people;

import java.util.ArrayList;

public class Manager extends Person {

    private ArrayList<StaffMember> team;

    public Manager(String name) {
        super(name);
        this.team = new ArrayList<StaffMember>();
    }


    public StaffMember getTeamMember(String name) {
        for (StaffMember staffMember : this.team) {
            if (staffMember.getName() == name) {
                return staffMember;
            }
        }
        return null;
    }

    public void addStaffMember(StaffMember staffMember) {
        this.team.add(staffMember);
    }

    public int countTeam() {
        return this.team.size();
    }
}
