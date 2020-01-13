package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double salary) {
        if (salary > 0) {
            this.salary += salary;
        }
    }

    public double payBonus() {
        double percentage = this.salary / 100;
        return percentage;
    }

    public void changeName(String name) {
        if(name != null) {
            this.name = name;
        }
    }
}
