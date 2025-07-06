package StaticFields;

public class App {
    public static void main(String[] args) {
        Parent parent = new Child(1,"Simon");
        parent.getStatVar();     // некоректно — виклик через об’єкт
        Child.getStatVar();      // правильно — виклик через клас
    }
}
