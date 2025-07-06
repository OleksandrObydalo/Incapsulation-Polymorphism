package Inheritance;

public class App {
    public static void main(String[] args) {
        Programmer p = new Programmer(2000, 550);
        System.out.println("Salary: " + p.getSalary());
        System.out.println("Bonus: " + p.getBonus());
        System.out.println("Payment for month: " + p.payForMonth());
    }
}

