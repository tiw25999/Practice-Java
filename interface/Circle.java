public class Circle extends shape {
    private int radius;

    public Circle(int radius){
        super("Violet");
        this.radius = radius;
    }

    public int compareTo(Object o){
        if(this.getArea() > ((Circle)o).getArea()){
            return 1;
            
        }else if(this.getArea() < ((Circle)o).getArea()){
            return -1;
        }else {
            return 0;
        }
    }

    public void resize(int percent){
        this.radius = (radius * percent) /100;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return super.toString()+" " +"Area: " + getArea() + " Circumference: " + getCircumference();
    }
    
}
