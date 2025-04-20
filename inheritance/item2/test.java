package item2;

public class test {
    public static void main(String[] args) {
        Square s = new Square(10);
        System.out.println(s.getArea());

        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.getArea());

        Cube c = new Cube(10);
        System.out.println(c.getArea());

    }
}
