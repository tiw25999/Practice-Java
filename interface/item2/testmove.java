
package item2;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class testmove {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int lines = input.nextInt();
        int Cpoint = lines * 2;
        System.out.println("You need " + Cpoint + " points to form " + lines + " lines");
        int count = 0;
        Point2D.Double[] points = new Point2D.Double[Cpoint];
        for (int i = 0; i < Cpoint; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            points[i] = new Point2D.Double(x, y);
            if (i % 2 != 0) {
                count++;
                double slope = (points[i].getY() - points[i-1].getY()) / (points[i].getX() - points[i-1].getX());
                double distance = Math.sqrt(Math.pow(points[i].getX() - points[i-1].getX(), 2) + Math.pow(points[i].getY() - points[i-1].getY(), 2));
                System.out.printf("Line No. %d from (%.2f, %.2f) to (%.2f, %.2f) ", count, points[i-1].getX(), points[i-1].getY(), points[i].getX(), points[i].getY());
                if (points[i].getX() != points[i-1].getX()) {
                    System.out.printf("Slope is %.2f ", slope);
                } else {
                    System.out.print("Slope is undefined ");
                }
                System.out.printf("Distance is %.2f\n", distance);
            }
        }
        input.close();
    }
}
