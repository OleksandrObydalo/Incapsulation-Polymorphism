package Inheritance;

import Inheritance.Employee;

public class Programmer extends Employee {
    private double bonus;

    public Programmer(double salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double payForMonth() {
        return getSalary() + bonus;
    }
}
