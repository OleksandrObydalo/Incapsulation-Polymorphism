package DownCasting;

import Inheritance.Employee;
import Inheritance.Programmer;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Programmer(2500, 300);

        System.out.println("Salary: " + e1.getSalary());
//        System.out.println("Bonus: " + e1.getBonus()); // Creates error, as Employee doesn't have such method
        System.out.println("Bonus: " + ((Programmer) e1).getBonus());
    }
}
