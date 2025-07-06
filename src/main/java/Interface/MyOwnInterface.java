package Interface;

public interface MyOwnInterface {
    int myVariable = 10;

    void mustImplement();

    static int getMyVariable() {
        return MyOwnInterface.myVariable + 1;
    }

    private String onlyInInterface() {
        return "From private method onlyForInterface()";
    }

    default void info() {
        System.out.println("Default method info get data: \n" + onlyInInterface());
    }
}
