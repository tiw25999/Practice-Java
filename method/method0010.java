import java.util.Scanner;

public class method0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numarray = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter num: ");
            numarray[i] = sc.nextDouble();
        }
        
        Scan(numarray);
    }

    public static void Scan(double[] n) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
            if (n[i] < min) {
                min = n[i];
            }
            sum += n[i];
        }
        
        double average = sum / n.length; // Calculate the average
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}





