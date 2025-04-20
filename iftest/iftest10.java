import java.util.Scanner;
public class iftest10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Number1: ");
        int Number1 = input.nextInt();
        System.out.print("Enter you Number2: ");
        int Number2 = input.nextInt();
        if (Number1 > Number2) {
            System.out.print(Number1+" > "+Number2);

        }
        else {
            System.out.print(Number1+" <= "+Number2);
        }
    }
    
}
