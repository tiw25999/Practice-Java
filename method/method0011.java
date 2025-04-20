import java.util.Scanner;

public class method0011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of array: ");
        int range = sc.nextInt();
        double[] numarray = new double[range];
        for (int i = 0; i < numarray.length ; i++) {
            System.out.print("Enter age: ");
            numarray[i] = sc.nextDouble();
        }
        
        Scan(numarray);
    }

    public static void Scan(double[] n) {
        double max = Double.MIN_VALUE;
        
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        
    }
    System.out.println("the Max age is : " + max);
}
}





