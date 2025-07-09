package protect.first;

public class App {
    public static void main(String[] args) {
        System.out.println(new Parent().message);
        Inheritor inheritor = new Inheritor("I was born");
        inheritor.printMessage();

        new Inheritor("I was born, but garbage collector will delete me").printMessage();
    }
}
