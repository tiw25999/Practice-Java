import java.util.Scanner;
public class NumOfMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number(1-12): ");
        int month = input.nextInt();
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("30");
                break;
            case 2:
                System.out.print("28-29");
                break;
            default:
                System.out.print("Error");
        }
        input.close();
    }
}
