import java.util.Scanner;
public class iftest13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int Number1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int Number2 = input.nextInt();
        System.out.print("Enter Number3: ");
        int Number3 = input.nextInt();
        int sum = Number1 + Number2 + Number3;
        System.out.println("Sum: "+sum);
        if (sum <= 100){
            System.out.print(sum+" <= 100");

        }
        else
            System.out.println(sum+" > 100");
    }
}
