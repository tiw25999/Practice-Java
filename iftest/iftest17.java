import java.util.Scanner;

public class iftest17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Number = input.nextInt();
        if(Number < 10){
            System.out.print("Enter Number2: ");
            int Number2 = input.nextInt();
            System.out.print("Enter Number3 :");
            int Number3 = input.nextInt();
            if (Number3 != 10){
            System.out.print("Enter Number4: ");
            int Number4 = input.nextInt();
            int sum = Number + Number2 + Number3 + Number4;
            System.out.print("Sum: "+sum);
            }
            else {
                System.out.print("Number Shouldn't != 10 ");}
        }
        else {
            System.out.print("Number Shouldn't > 10 ");}
        input.close();
    }
}
