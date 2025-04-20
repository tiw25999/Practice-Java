import java.util.Scanner;
public class ifcase13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Wheels(4,6,8,10): ");
        int num = input.nextInt();
        int price = 0;
        
        switch(num){
            case 4:
                price = 20;
                break;
            case 6:
                price = 30;
                break;
            case 8:
                price = 40;
                break;
            case 10:
                price = 50;
                break;
            default:
                System.out.println("not found wheels");
                return;
        }
        System.out.println("Price "+price+" Baths");
        input.close();
    }
}
