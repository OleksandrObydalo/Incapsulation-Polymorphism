package MultiIheritance;

public class Circle implements FlatFigure{
    protected double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double area() {
        return Math.PI * radious * radious;
    }
}
