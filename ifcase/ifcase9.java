import java.util.Scanner;
public class ifcase9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("2*5+25/5-5 = ?");
        System.out.println("1.5");
        System.out.println("2.10");
        System.out.println("3.15");
        System.out.println("4.20");
        System.out.println("5.25");

        System.out.print("You choose(1-5): ");
        int num = input.nextInt();

        switch(num){
            case 2:
                System.out.print("Right");
                break;
            case 1:
            case 3:
            case 4:
            case 5:
                System.out.println("Wrong");
                break;
            default:
                System.out.print("Error");
            }
        input.close();
    }
}
