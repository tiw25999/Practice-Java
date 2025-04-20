import java.util.Scanner;

public class method0013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.print("Enter pow: ");
        int pow = sc.nextInt();
        calnum(num, pow);
        
    }

    public static void calnum(int n, int p) {
        double sum = Math.pow(n,p);
        System.out.println(sum);
}
}





