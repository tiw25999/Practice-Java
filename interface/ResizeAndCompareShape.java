public class ResizeAndCompareShape {

    public static void main(String[] args) {
        Square square = new Square(4);
        Square square2 = new Square(20);
        Circle circle = new Circle(3);
        Circle circle2 = new Circle(3);
        System.out.println("=======================================================================");
        System.out.println("Before Resize");
        System.out.println(square.toString());
        System.out.println(square2.toString());
        System.out.println("=======================================================================");
        System.out.println(circle.toString());
        System.out.println(circle2.toString());
        System.out.println("=======================================================================");
        System.out.println("After Resize");
        square.resize(90);
        square2.resize(200);
        System.out.println(square.toString());
        System.out.println(square2.toString());
        System.out.println("=======================================================================");
        circle.resize(80);
        circle2.resize(50);
        System.out.println(circle.toString());
        System.out.println(circle2.toString());
        System.out.println("=======================================================================");
        System.out.println("Compare 2 Square After Resize");
        if(square.compareTo(square2) > 0){
            System.out.println("Square Bigger Square2");
        }else if(square.compareTo(square2) < 0){
            System.out.println("Square Smaller Square2");
        }else {
            System.out.println("Square Equal Square2");
        }
        System.out.println("Compare 2 Circle After Resize");
        if(circle.compareTo(circle2) > 0){
            System.out.println("Circle Bigger Circle2");
        }else if(circle.compareTo(circle2) < 0){
            System.out.println("Circle Smaller Circle2");
        }else {
            System.out.println("Circle Equal Circle2");
        }
        
        
}
}