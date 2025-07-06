package SealedClasses;

import java.awt.*;

public abstract sealed class Shape permits Circle, Rectangle, WeirdShape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double area();
}
