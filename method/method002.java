import java.util.Scanner;

public class method002 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        double base = in.nextDouble();
        System.out.print("Enter a pow number: ");
        int pow = in.nextInt();
        double sum = power(base, pow);
        System.err.println(sum);
}

public static double power(double x, int p){
    double sum = 0;
    sum = Math.pow(x, p);
    return sum;
}
}