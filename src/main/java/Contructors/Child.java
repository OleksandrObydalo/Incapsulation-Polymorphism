package Contructors;

public class Child extends Parent {
    private int childNumb;
    private String name;

    public Child() {
        System.out.println("\t\tChild Constructor");
    }

    public Child(int childNumb, String name) {
        System.out.println("\t\tChild Constructor with params");
        this.childNumb = childNumb;
        this.name = name;
    }

    @Override
    public void getId() {
        System.out.println("Child number: " + childNumb);
    }

    @Override
    public String nameUpperC() {
        return name.toUpperCase();
    }
}
