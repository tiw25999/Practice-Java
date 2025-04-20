package item2;

public class Rectangle extends Square {
    private double height;

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    public double getArea() {
        return super.getArea() * height;
    }

    
}
