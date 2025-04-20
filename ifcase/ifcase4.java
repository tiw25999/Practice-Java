import java.util.Scanner;
public class ifcase4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("disk drive manufacturer");
        System.out.print("Enter Code(1-4): ");
        int num = input.nextInt();

        switch(num){
            case 1:
                System.out.print("3M Corporation");
                break;
            case 2:
                System.out.print("Maxell Corporation");
                break;
            case 3:
                System.out.print("Sony Corporation");
                break;
            case 4:
                System.out.print("Verbatim Corporation");
                break;
            default:
                System.out.print("An incorrect code was entered");
        }
        input.close();
    }
}
