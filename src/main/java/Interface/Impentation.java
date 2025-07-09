package Interface;

public class Impentation implements InterfaceInheritor1, InterfaceInheritor2{
    @Override
    public void mustImplement() {
        System.out.println("Implementation");
    }

    @Override
    public void info() {
        InterfaceInheritor1.super.info();
    }
}
