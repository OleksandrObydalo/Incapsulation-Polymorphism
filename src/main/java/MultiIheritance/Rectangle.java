package MultiIheritance;

public class Rectangle implements Drawable, FlatFigure {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        for (int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    @Override
    public int area() {
        return height * width;
    }
}
