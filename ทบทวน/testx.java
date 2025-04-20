import java.util.Scanner;

public class testx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = input.nextDouble();
        double a = 8, b = 16, c = 7, d = 5;
        double xmod = x % 2;
        double sum = 0;
        if(x == 0){
            sum += ((a / b) + (c / (2 * d)));
            System.out.print("Z is : "+sum);}
        else if( xmod == 0) {
            sum += ((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.abs(a-b)));
            System.out.print("Z is : " + sum);
        }else if(xmod != 0 && xmod > 0){
                sum += (d + c * (a / b));
            System.out.print("Z is : "+sum);
        }
        
        input.close();
    }
}

