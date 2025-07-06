package SealedClasses;

public class App {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("My Circle", 2.5);
        shapes[1] = new Rectangle("My Rectangle", 2);
        shapes[2] = new TransparentRectangle("Transparent Rectangle", 3, 10);

        for (Shape s : shapes) {
            System.out.println(s.getName() + " Area: " + s.area());
            if (s instanceof TransparentRectangle) {
                System.out.println("Capacity rectangle is: " + ((TransparentRectangle) s).getCapacity());
            }
        }
    }
}
