package MultiIheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Drawable drawable = rectangle;
        FlatFigure figure = rectangle;
    }

    public static void draw(Drawable drawable, int times){
        for(int i = 0; i < times; i++){
            System.out.println();
            drawable.draw();
            System.out.println();
        }
    }

    public static void printFigureArea(FlatFigure figure){
        System.out.println("This figure has area: " + figure.area());
    }
}
