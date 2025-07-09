package protect.first;

public class Inheritor extends Parent{

    public Inheritor() {
    }

    public Inheritor(String message) {
        super(message);
    }

    public void printMessage(){
        System.out.println(message);
    }
}
