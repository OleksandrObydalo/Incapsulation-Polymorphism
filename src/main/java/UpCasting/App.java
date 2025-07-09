package UpCasting;

import Inheritance.Employee;
import Inheritance.Programmer;

public class App {
    public static void main(String[] args) {
        Employee employee = new Programmer(2500, 300); // не обов'язково явно
        Employee e = new Programmer(2000, 550);

        System.out.println("It is Upcasting. \nSalary: " + employee.getSalary());
        System.out.println("It is Upcasting. \nSalary: " + e.getSalary());
    }
}
