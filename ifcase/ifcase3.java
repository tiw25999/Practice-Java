import java.util.Scanner;
public class ifcase3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int num1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int num2 = input.nextInt();
        System.out.println("1:Add(+)");
        System.out.println("2:Subtract(-)");
        System.out.println("3:Multiply(*)");
        System.out.println("Enter Opration: ");
        char opra = input.next().charAt(0);
        int sum;


        switch (opra){
            case '+':
                sum = num1 + num2;
                System.out.print("Add = "+sum);
                break;
            case '-':
                sum = num1 - num2;
                System.out.print("Subtract = "+sum);
                break;
            case '*':
                sum = num1 * num2;
                System.out.print("Multiply = "+sum);
                break;
            default:
                System.out.print("Invalid System");
        }
    }
    
}
