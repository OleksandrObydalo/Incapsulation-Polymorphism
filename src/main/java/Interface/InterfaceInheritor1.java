package Interface;

public interface InterfaceInheritor1 extends MyOwnInterface{
    @Override
    default void info() {
        System.out.println("First overridden method info");
    }
}
