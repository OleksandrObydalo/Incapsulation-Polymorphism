package StaticFields;

public class Child extends Parent {
    public static String role;

    private int ID;
    private String name;

    public Child(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        Child.role = role;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        role = "Student";
        System.out.println("Load Child static content");
    }

    public static void getStatVar() {
        System.out.println("Role: " + role);
    }
}
