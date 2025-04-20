import java.util.Scanner;

public class method0012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int num = sc.nextInt();
        calnum(num);
        
    }

    public static void calnum(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println(sum);
}
}





