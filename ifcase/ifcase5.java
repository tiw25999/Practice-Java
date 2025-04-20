import java.util.Scanner;
public class ifcase5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("studen't status");
        System.out.print("Enter you Code(1-4): ");
        int code = input.nextInt();
        
        switch(code){
            case 1:
                System.out.print("Freshman");
                break;
            case 2:
                System.out.print("Sophomore");
                break;
            case 3:
                System.out.print("Junior");
                break;
            case 4:
                System.out.print("Senior");
                break;
            case 5:
                System.out.print("Masters Program");
                break;
            case 6:
                System.out.print("Doctoral Program");
                break;
            default:
                System.out.print("In incorrect code was entered");
        }
        input.close();
    }
}
