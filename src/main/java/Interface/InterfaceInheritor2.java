package Interface;

public interface InterfaceInheritor2 extends MyOwnInterface{

    @Override
    default void info() {
        System.out.println("Second overridden method info");
    }
}
