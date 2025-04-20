import java.util.Scanner;
public class iftest16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Number = input.nextInt();
        if (Number > 10){
            System.out.print("Enter Number2: ");
            int Number2 = input.nextInt();
            System.out.print("Enter Number3: ");
            int Number3 = input.nextInt();
            int sum = Number + Number2 + Number3;
            System.out.print("Sum: "+sum);
        }
        input.close();
    }
}
