public class Square extends shape {
    private int width;

    public Square(int width){
        super("Orange");
        this.width = width;
    }


    public int compareTo(Object o){
        if(this.getArea() > ((Square)o).getArea()){
            return 1;
            
        }else if(this.getArea() < ((Square)o).getArea()){
            return -1;
        }else {
            return 0;
        }
    }

    public void resize(int percent){
        this.width = (width * percent) /100;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    public String toString() {
        return super.toString()+" " +"Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
