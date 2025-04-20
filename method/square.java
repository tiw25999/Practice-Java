public class square {
    int width;

    public square(){
        width = 0;
    }

    public square(int w){
        width = w;
    }

    public void setWidth(int w){
        width = w;
    }

    public int getWidth(){
        return width;
    }

    public int calarea(){
        return width * width;
    }

    public int calperimeter(){
        return 4 * width;
    }

    public String toString(){
        return "Width = " + width + " Area = " + calarea() + " Perimeter = " + calperimeter();
    }
}
