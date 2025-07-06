package AbstractClasses;

public class Book extends Product {
    private String author;

    public Book(long id, String name, double price, String manufacturer, String author) {
        super(id, name, price, manufacturer);
        this.author = author;
    }

    @Override
    public void info() {
        System.out.println("It is Book:\nprice is: " + getPrice() +
                ", and author is: " + author);
    }
}
