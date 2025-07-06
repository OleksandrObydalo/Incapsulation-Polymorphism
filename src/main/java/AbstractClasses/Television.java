package AbstractClasses;

public class Television extends Product {
    private double screenDiagonal;

    public Television(long id, String name, double price, String manufacturer, double screenDiagonal) {
        super(id, name, price, manufacturer);
        this.screenDiagonal = screenDiagonal;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public void info() {
        System.out.println("It is TV:\nprice is: " + getPrice() +
                ", and screen diagonal is: " + screenDiagonal);
    }
}
