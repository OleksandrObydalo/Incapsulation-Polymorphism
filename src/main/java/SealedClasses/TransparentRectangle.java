package SealedClasses;


public final class TransparentRectangle extends Rectangle {
    private int capacity;

    public TransparentRectangle(String name, double side, int capacity) {
        super(name, side);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
