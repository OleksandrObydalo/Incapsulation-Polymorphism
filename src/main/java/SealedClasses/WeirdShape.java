package SealedClasses;

public non-sealed class WeirdShape extends Shape {
    public WeirdShape(String name) {
        super(name);
    }

    @Override
    double area() {
        return 0;
    }
}
