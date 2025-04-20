import java.util.Scanner;
public class method007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Centifrade: ");
        int c = sc.nextInt();
        change(c);
    }

    public static int change(int c){
        int f = (c * 9 / 5) + 32;
        System.out.println(f+" Fahrenheit");
        return 0;
    }
}
