package Interface;

public class MyClass implements MyOwnInterface {
    @Override
    public void mustImplement() {
        System.out.println("Implemented method in my class");
    }
}
