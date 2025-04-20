import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press +: Add");
        System.out.println("Press -: Subtract");
        System.out.println("Press *: Multiply");
        System.out.println("Press /: Divide");
        System.out.println("Press %: Modulo");
        System.out.print("Press Operator: " );
        String opre = input.next().toLowerCase();
        System.out.print("Press Enter X: ");
        int num1 = input.nextInt();
        System.out.print("Press Enter Y: ");
        int num2 = input.nextInt();
        int result = 0;
        switch (opre) {
            case "+":
                result = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1+" * "+num2+" = "+result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println(num1+" % "+num2+" = "+result);
                break;
            default:
                System.out.println("Bye Bye !!!");
                break;
        }
    }
}
