import java.util.Scanner;
public class loop17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double money = 0, tax = 0;
        char yn = 'y';
        while(yn == 'y'){
            System.out.print("Input your revenue: ");
            money = in.nextDouble();
            if(money <= 80000){
                tax = 0;
                System.out.println("Tax rate = 0%");
                System.out.println("Your Tax = "+tax);}
            else if(money >= 80001 && money <= 100000){
                    tax = (money /100) * 5;
                    System.out.println("Tax rate = 5%");
                    System.out.println("Your Tax = "+tax);}
            else if(money >= 100001 && money <= 500000){
                        tax = (money / 100) * 10;
                        System.out.println("Tax rate = 10%");
                        System.out.println("Your Tax = "+tax);}
            else if(money >= 500001 && money <= 1000000){
                            tax = (money / 100) * 15;
                            System.out.println("Tax rate = 15%");
                            System.out.println("Your Tax = "+tax);}
            else if(money >= 1000001){
                                tax = (money / 100) * 20;
                                System.out.println("Tax rate = 20%");
                                System.out.println("Your Tax = "+tax);}
            else
                {System.out.print("Error input for money");
                return;}
            System.out.print("Continue [y/n]: ");
            yn = in.next().toLowerCase().charAt(0);
            if(yn != 'y' && yn != 'n'){
                System.out.print("you can only input y or n");
            }
            }
                        }
                    }
