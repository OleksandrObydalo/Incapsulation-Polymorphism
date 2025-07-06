package Interface;

public class App {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.mustImplement();
        myClass.info();

        System.out.println("-----\nStatic variable from interface is: " + MyOwnInterface.myVariable);
        System.out.println("-----\nStatic method from interface return: " + MyOwnInterface.getMyVariable());
    }
}
