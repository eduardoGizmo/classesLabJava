package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, String NINumber, double salary, String depName) {
        super(name, NINumber, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return this.depName;
    }
}
