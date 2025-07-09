package protect.first;

// s2.protect.first_package
public class Parent {
    protected String message = "Access to protected variable, in the same package";

    public Parent() {
    }
    public Parent(String message) {
        this.message = message;
    }
}
