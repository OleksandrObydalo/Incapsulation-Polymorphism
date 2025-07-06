package Contructors;

public class Parent {
    public int passportId;
    public String name;

    public Parent() {
        System.out.println("\tParent Constructor");
    }

    public void getId() {
        System.out.println("Passport id: " + passportId);
    }

    public String nameUpperC() {
        return name.toUpperCase();
    }

    public void showName() {
        System.out.println("Name: " + nameUpperC());
    }
}
