public abstract class shape {
    protected String color;
    public shape(String color){
        this.color = color;
    }
    public abstract double getArea();
    public void setColor(String color){
        this.color = color;
    }
    public  String toString(){
        return "Color: "+color;
    }
}
