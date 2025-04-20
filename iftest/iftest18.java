import java.util.Scanner;
public class iftest18 {
    public static void main(String[] args){
        System.out.print("Enter Charector: ");
        Scanner input = new Scanner(System.in);
        char charec = input.next().charAt(0);
        if(charec == 'a' || charec == 'A') {
            System.out.print("Enter Number: ");
            int Number = input.nextInt();
            System.out.print("Sum: "+Number);
        }
        else if(charec == 'b' || charec == 'B'){
            System.out.print("Enter Number: ");
            int Number1 = input.nextInt();
            System.out.print("Enter Number: ");
            int Number2 = input.nextInt();
            int sum = Number1 + Number2;
            System.out.print("Sum: "+sum);
        }
        else if(charec == 'c' || charec == 'C') {
            System.out.print("Enter Number: ");
            int Number3 = input.nextInt();
            System.out.print("Enter Number: ");
            int Number4 = input.nextInt();
            System.out.print("Enter Number: ");
            int Number5 = input.nextInt();
            int sum2 = Number3 + Number4 + Number5;
            System.out.print("Sum: "+sum2);
            
        }
        else
            System.out.print("Choose a and b and c ");
            input.close();
    }

}
