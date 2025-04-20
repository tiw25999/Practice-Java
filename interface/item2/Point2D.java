package item2;

public class Point2D {
    private int x;
    private int y;

    public Point2D() {
        
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveup(int y){
        this.y += y;
    }

    public void movedown(int y){
        this.y -= y;
    }

    public void moveleft(int x){
        this.x -= x;
    }

    public void moveright(int x){
        this.x += x;
    }

    public String toString(){
        return "Form (" + x + "," + y + ")";
    }
}
