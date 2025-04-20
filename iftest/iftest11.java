import java.util.Scanner;
public class iftest11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Number1: ");
        int Number1 = input.nextInt();
        System.out.print("Enter you Number2: ");
        int Number2 = input.nextInt();

        int sum = Number1 + Number2;
        System.out.println("Sum: "+sum);

        if (sum > 50){
            System.out.println("More 50");
        }
        
        }
}
