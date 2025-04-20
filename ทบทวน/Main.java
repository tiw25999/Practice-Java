import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n ,sum = 0;
        System.out.print("Enter: ");
        n = in.nextInt();
        while(n != 0){
            sum = sum + (n % 10 );
            n = n / 10;
        }
        System.out.print("Sum: "+sum);
    }
}
