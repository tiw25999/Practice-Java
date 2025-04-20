import java.util.Scanner;

public class iftest15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int Number1 = input.nextInt();
        System.out.print("Enter Number2: ");
        int Number2 = input.nextInt();
        System.out.print("Enter Number3: ");
        int Number3 = input.nextInt();
        if(Number1 > 10 && Number2 > 10 && Number3 > 10){
            int sum = Number1 + Number2 + Number3;
            System.out.print("Sum:"+sum);
        }
        input.close();
    }
}
