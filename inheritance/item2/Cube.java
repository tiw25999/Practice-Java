package item2;

public class Cube extends Square {
    
    public Cube(double width){
        super(width);
    }

    public double getArea(){
        return super.getArea() * 6;
    }
}
