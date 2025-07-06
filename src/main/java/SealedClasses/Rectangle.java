package SealedClasses;

public sealed class Rectangle extends Shape permits TransparentRectangle {
    double side;

    public Rectangle(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}
