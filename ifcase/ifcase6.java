import java.util.Scanner;
public class ifcase6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of money: ");
        int money = input.nextInt();
        if(money <= 20000){
            int money1000 = money / 1000;
            System.out.println("1000 Bath = "+money1000);
            int money1000m = money % 1000;
            int money500m = money1000m / 500;
            System.out.println("500 Baths = "+money500m);
            int money500 = money1000m % 500;
            int money100 = money500 / 100;
            System.out.println("100 Baths = "+money100);
            }
            else
            System.out.print("You can't withdraw money more than 20000 baths");
            input.close();
            }
        }

        