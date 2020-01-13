package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINumber, double salary, String depName, double budget) {
        super(name, NINumber, salary, depName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
