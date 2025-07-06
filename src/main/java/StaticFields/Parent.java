package StaticFields;

public class Parent {
    public static String role;

    public Parent() {
    }

    static {
        role = "Teacher";
        System.out.println("Load Parent static content");
    }

    public static void getStatVar() {
        System.out.println("Role: " + role);
    }
}
